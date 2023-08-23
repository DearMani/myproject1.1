/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarker2.mvc.controller;
import java.util.ArrayList;
import supermarker2.mvc.model.OrderDetailModel;
import supermarker2.mvc.model.OrderModel;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
        
/**
 *
 * @author Manidu
 */
public class OrderController  {
    private Connection connection;
    
      public String placeOrder( OrderModel orderModel , ArrayList<OrderDetailModel> odDetailList ) throws SQLException{
               
                 
                     
         try{
                  connection =CrudUtil.connection;
                 connection.setAutoCommit(false);
                  boolean stateForOrder =(CrudUtil.executeUpdate( "  INSERT INTO orders VALUES ( ? ,? ,? ) " , 
                          orderModel.getOrderId() , orderModel.getOrderDate(), orderModel.getCustId()) );
                  
                  if(stateForOrder){
                       boolean isSaveOrderDetail =true;
                        for(OrderDetailModel odm : odDetailList){
                               Object[] odmDetails ={odm.getOrderId(),odm.getItemCode(),odm.getOrderQTY(),odm.getDiscount()};
                               boolean stateForOrderDetails =CrudUtil.executeUpdate(" INSERT INTO orderdetail VALUES ( ? ,? ,? ,? )  ",
                                       odmDetails);
                               if(!stateForOrderDetails){
                                      isSaveOrderDetail =false;
                                      break;
                               }
                             
                        }
                        
                        if(isSaveOrderDetail){
                            boolean isUpdateItem =true;
                            for( OrderDetailModel odm : odDetailList ){
                                   
                                boolean stateForItem =CrudUtil.executeUpdate(  " UPDATE item SET  QtyOnHand  =  QtyOnHand  -  ?  WHERE   ItemCode =? ",
                                        odm.getOrderQTY(), odm.getItemCode());
                                
                                if(!stateForItem){
                                     isUpdateItem =false;
                                     break;
                                }
                           
                            }
                            
                            if(isUpdateItem){
                                connection.commit();
                                return "Success";             
                            }
                            
                            else{
                                connection.rollback();
                                return " Error in Update Item";
                            }
                              
                            
                        }
                        else{
                            connection.rollback();
                            return " Error in order detail Save";
                        }
                     
                      
                  }
                  else{
                      connection.rollback();
                      return " Order Save Error ";
                  }
             
         
             }
              catch(Exception e){
                          connection.rollback();
                          e.printStackTrace();
                           return e.getMessage();   
                           }    finally{
                              connection.setAutoCommit(true);
                               } 
                         
                 
                        
      }
      
      public String getTotalPrice( String orderId ) throws SQLException{
            ResultSet     set=CrudUtil.getResultSet("  SELECT SUM(od.OrderQTY * it.UnitPrice - od.Discount) "+
                    "    FROM orderdetail od  " +
                    "   JOIN item  it ON od.ItemCode = it.ItemCode  "+
                       "  WHERE  od. OrderID =?  "  , 
                    orderId);
            Double totalSum =0.0;
            while(set.next()){
                    totalSum =set.getDouble(1);
            
            }
            return " sum of total is "+String.valueOf(totalSum);
         
      }
          
        
}
