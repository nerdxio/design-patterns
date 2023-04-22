/**
 * @author Hassan Refaat <hassan.refaat.dev@gmail.com>
 * @Created 4/22/2023 7:49 AM
 */
package io.nerd.facade;


/*
* Facade is a structural design pattern that provides a simplified interface
* to a library, a framework, or any other complex set of classes.
*/
public class FacadeDemo {
    public static void main(String[] args) {
        /* the bad code without facade */

        // create the basket
        var basket = new ShoppingBasket();
        var item = new BasketItem("1", 10, 2);

        // check stock
        var inventory = new Inventory();
        if (inventory.checkItemQuantity(item.getItemId(), item.getQuantity())) {
            basket.addItem(item);
        }
        // create inventory order
        var inventoryOrder = new InventoryOrder();
        inventoryOrder.createOrder(basket);

        // create invoice
        var purchaseInvoice = new PurchaseInvoice();
        var invoice =purchaseInvoice.creatPurchaseInvoice(basket, "address: 123 street, city: cairo, country: egypt");

        // payment process
        var payment = new PaymentProcessor();
        payment.handlePayment("acc=2323",invoice.getNetTotal());

        //send sms
        var smsNotification = new SmsNotification();
        smsNotification.sendSms("01000000000", "your order has been created successfully");

        /* the good code with facade */
        var  orderUsingFacade = new OrderFacade();
        orderUsingFacade.createOrder("1", 2, "address: 123 street, city: cairo, country: egypt", "01000000000", "acc=2323");
        // so easy to use
    }
}
