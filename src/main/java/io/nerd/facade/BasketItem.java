/**
 * @author Hassan Refaat <hassan.refaat.dev@gmail.com>
 * @Created 4/22/2023 8:19 AM
 */
package io.nerd.facade;

public class BasketItem {
    private String ItemId;
    private double ItemPrice;
    private int quantity;

    public BasketItem() {
    }
    public BasketItem(String itemId, double itemPrice, int quantity) {
        ItemId = itemId;
        ItemPrice = itemPrice;
        this.quantity = quantity;
    }

    public String getItemId() {
        return ItemId;
    }

    public void setItemId(String itemId) {
        ItemId = itemId;
    }

    public double getItemPrice() {
        return ItemPrice;
    }

    public void setItemPrice(double itemPrice) {
        ItemPrice = itemPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
