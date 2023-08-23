/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarker2.mvc.controller;

import java.sql.SQLException;

import supermarker2.mvc.model.ItemModel;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Manidu
 */
public class ItemController {
    public String addItem(ItemModel item) throws SQLException{
       
            return((CrudUtil.executeUpdate("   INSERT INTO item VALUES( ? ,? ,? ,? ,?  )  ",
                    item.getItemCode(), item.getDescription(), item.getPackSize(), item.getUnitPrice(), item.getQtyOnHead())) !=false) ? " Item added Success" : " Fail";       
    }
    
    public String updateItem(ItemModel  item) throws SQLException{
                 return((CrudUtil.executeUpdate(" UPDATE  item  SET  Description =? ,  PackSize =? ,   UnitPrice=? ,  QtyOnHand =?   WHERE  ItemCode =?   ",
                    item.getDescription(), item.getPackSize(), item.getUnitPrice(), item.getQtyOnHead()  , item.getItemCode())) !=false) ? " Item Update Success" : " Fail";          
    }
    
    public String deleteItem(String custId) throws SQLException{
            return ((CrudUtil.executeUpdate("  DELETE FROM item WHERE  ItemCode =?  ", custId)) !=false) ? " delete Sucess" : "fail";
    }
    
    public ItemModel getItem(String custId) throws SQLException{
          
        ResultSet set =CrudUtil.getResultSet("  SELECT * FROM item WHERE ItemCode =?   ", custId);
        while(set.next()){
                ItemModel item = new ItemModel(set.getString(1),
                        set.getString(2), set.getString(3), set.getDouble(4), set.getInt(5));
                return item;
        }
          
               return null;
    }
    
    public ArrayList<ItemModel> getAllItem() throws SQLException{
               ResultSet set = CrudUtil.getResultSet(" SELECT * FROM item ", (Object[]) null);
               ArrayList<ItemModel> itemList =new ArrayList<>();
               while(  set.next() ){
                   ItemModel item =new ItemModel(set.getString(1), set.getString(2), set.getString(3), set.getDouble(4), set.getInt(5));
                   itemList.add(item);
               }
               return itemList;            
    }
    
    
    
    
}
