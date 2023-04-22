/**
 * @author Hassan Refaat <hassan.refaat.dev@gmail.com>
 * @Created 4/22/2023 8:23 AM
 */
package io.nerd.facade;

public class Inventory {

    public boolean checkItemQuantity(String itemId, double quantity) {
        // check item in inventory
        return quantity < 100;
    }
}