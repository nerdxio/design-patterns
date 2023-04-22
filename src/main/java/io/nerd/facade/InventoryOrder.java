/**
 * @author Hassan Refaat <hassan.refaat.dev@gmail.com>
 * @Created 4/22/2023 8:30 AM
 */
package io.nerd.facade;

import java.util.Random;

public class InventoryOrder {

    public String createOrder(ShoppingBasket basket){
        basket.getBasketItems();
        return String.format("Order created successfully, order id: %d", new Random().nextInt(1000));
    }
}
