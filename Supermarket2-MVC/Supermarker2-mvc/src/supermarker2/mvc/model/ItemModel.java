/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarker2.mvc.model;

/**
 *
 * @author Manidu
 */
public class ItemModel {
    
          private String itemCode;
           private String description;
           private String packSize;
           private Double unitPrice;
           private Integer qtyOnHead;

    public ItemModel() {
    }

    public ItemModel(String itemCode, String description, String packSize, Double unitPrice, Integer qtyOnHead) {
        this.itemCode = itemCode;
        this.description = description;
        this.packSize = packSize;
        this.unitPrice = unitPrice;
        this.qtyOnHead = qtyOnHead;
    }

    /**
     * @return the itemCode
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @param itemCode the itemCode to set
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the packSize
     */
    public String getPackSize() {
        return packSize;
    }

    /**
     * @param packSize the packSize to set
     */
    public void setPackSize(String packSize) {
        this.packSize = packSize;
    }

    /**
     * @return the unitPrice
     */
    public Double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * @return the qtyOnHead
     */
    public Integer getQtyOnHead() {
        return qtyOnHead;
    }

    /**
     * @param qtyOnHead the qtyOnHead to set
     */
    public void setQtyOnHead(Integer qtyOnHead) {
        this.qtyOnHead = qtyOnHead;
    }

    @Override
    public String toString() {
        return "ItemModel{" + "itemCode=" + itemCode + ", description=" + description + ", packSize=" + packSize + ", unitPrice=" + unitPrice + ", qtyOnHead=" + qtyOnHead + '}';
    }
    
    
    
    
}
