/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarker2.mvc.controller;

import supermarker2.mvc.model.CustomerModel;
import java.sql.SQLException;
import supermarker2.mvc.controller.CrudUtil;
import java.sql.ResultSet;
import java.util.ArrayList;



/**
 *
 * @author Manidu
 */
public class CustomerController {
        public String addCustomer(CustomerModel custModel) throws SQLException{
            
                return(  (CrudUtil.executeUpdate("INSERT INTO customer VALUES ( ? ,? ,? ,? ,? ,? ,? ,? ,?)",
                        custModel.getCustId() , custModel.getCustTitle() ,custModel.getCustName(),
                        custModel.getDob(),  custModel.getSalary(), custModel.getCustAddress(),
                        custModel.getCity(), custModel.getProvince(), custModel.getZip() ) )  != false) ? " Customer added" :
                        "Fail" ;
         
        }
        
         public String updateCustomer(CustomerModel custModel) throws SQLException{
            
                return(  (CrudUtil.executeUpdate("UPDATE  customer SET   CustTitle =? ,  CustName =?,  DOB =?, salary =? , CustAddress =?,  City =?,  Province =? , PostalCode =? WHERE  CustID =?   ",
                         custModel.getCustTitle() ,custModel.getCustName(),
                        custModel.getDob(),  custModel.getSalary(), custModel.getCustAddress(),
                        custModel.getCity(), custModel.getProvince(), custModel.getZip() , custModel.getCustId() ) ) != false) ? " Customer Update" :
                        "Fail" ;
         
        }
         public String deleteCustomer(String custId) throws SQLException {
                     return ((CrudUtil.executeUpdate(" DELETE FROM customer WHERE CustID = ?",custId))  !=false) ? " Delete Customer" : "Fail";
         }
         
         public CustomerModel   getCustomer(String custId) throws  SQLException{
                   ResultSet set = CrudUtil.getResultSet(" SELECT * FROM customer WHERE CustID = ? ", custId);
                   while(set.next()){
                       CustomerModel cusModel = new CustomerModel(set.getString(1), set.getString(2), set.getString(3),
                               set.getString(4), set.getDouble(5), set.getString(6), set.getString(7), set.getString(8), set.getString(9));
                       return cusModel;
                   }
                   return  null;          
         }
        
         
         public ArrayList<CustomerModel> getAllCustomer()throws SQLException {
                   ResultSet set  =CrudUtil.getResultSet(" SELECT * FROM customer  ", (Object[]) null);
                  ArrayList<CustomerModel> custList =new ArrayList<>();
                   while( set.next()){
                       
                  CustomerModel cusModel = new CustomerModel(set.getString(1), set.getString(2), set.getString(3),
                    set.getString(4), set.getDouble(5), set.getString(6), set.getString(7), set.getString(8), set.getString(9));
                       
                        custList.add(cusModel);
                   }
                   return custList;
         }
          
}
