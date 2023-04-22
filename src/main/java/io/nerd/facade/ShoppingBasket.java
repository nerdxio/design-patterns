/**
 * @author Hassan Refaat <hassan.refaat.dev@gmail.com>
 * @Created 4/22/2023 8:21 AM
 */
package io.nerd.facade;

import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {

    private List<BasketItem> basketItems =  new ArrayList<>();

    public void addItem(BasketItem item){
        basketItems.add(item);
    }

    public void removeItem(BasketItem item){
        basketItems.remove(item);
    }

    public List<BasketItem> getBasketItems(){
        return basketItems;
    }
}
