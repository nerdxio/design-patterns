/**
 * @author Hassan Refaat <hassan.refaat.dev@gmail.com>
 * @Created 4/22/2023 9:12 AM
 */
package io.nerd.facade;

public class OrderFacade {
    private final ShoppingBasket basket;
    private final InventoryOrder inventoryOrder;
    private final PurchaseInvoice purchaseInvoice;
    private final PaymentProcessor paymentProcessor;
    private final SmsNotification smsNotification;
    private final Inventory inventory;
    public OrderFacade() {
        basket = new ShoppingBasket();
        inventoryOrder = new InventoryOrder();
        purchaseInvoice = new PurchaseInvoice();
        paymentProcessor = new PaymentProcessor();
        smsNotification = new SmsNotification();
        inventory = new Inventory();
    }

    public void createOrder(String itemId, int quantity, String address, String phone, String accountNumber) {
        BasketItem item = new BasketItem(itemId, 10, quantity);
        if (inventory.checkItemQuantity(item.getItemId(), item.getQuantity())) {
            basket.addItem(item);
        }
        inventoryOrder.createOrder(basket);
        PurchaseInvoice invoice = purchaseInvoice.creatPurchaseInvoice(basket, address);
        paymentProcessor.handlePayment(accountNumber, invoice.getNetTotal());
        smsNotification.sendSms(phone, "your order has been created successfully");
    }
}

