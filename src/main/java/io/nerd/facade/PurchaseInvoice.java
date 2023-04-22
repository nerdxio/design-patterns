/**
 * @author Hassan Refaat <hassan.refaat.dev@gmail.com>
 * @Created 4/22/2023 8:39 AM
 */
package io.nerd.facade;

public class PurchaseInvoice {
    private double discount = 0;

    private double totalAmount = 0;

    private double netTotal = 0;

    public PurchaseInvoice creatPurchaseInvoice(ShoppingBasket basket, String customerInfo) {
        var invoice = new PurchaseInvoice();
        var items = basket.getBasketItems();
        for (BasketItem item : items) {
            invoice.totalAmount += item.getItemPrice() * item.getQuantity();
        }
        if (items.size() > 5) invoice.discount = 20;
        invoice.netTotal = invoice.totalAmount - invoice.discount;
        return invoice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getNetTotal() {
        return netTotal;
    }

    public void setNetTotal(double netTotal) {
        this.netTotal = netTotal;
    }
}
