package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.*;


public class ProductBasket {
    private Map<String, LinkedList<Product>> basket;

    public ProductBasket() {
        basket = new HashMap<>();
    }

    public void addProductInBasket(Product product) {
        basket.computeIfAbsent(product.getNameProduct(),k-> new LinkedList<>()).add(product);
            System.out.println("Добавлен продукт " + product.getNameProduct());
    }

    public double totalPriceBasket() {
        return  basket.values().stream().flatMap(Collection::stream)
                    .mapToDouble(Product::getPriceProduct).sum();
    }

    public void printBasket() {
        if (basket.isEmpty()) {
            System.out.println("Корзина пуста!");
        }
        else {
            System.out.println(basket);
        }
    }

    public List delProduct(String name) {
        if(basket.isEmpty() || !basket.containsKey(name)) return  new LinkedList<Product>();
        LinkedList<Product> delProducts = basket.remove(name);
        return delProducts;
    }



    public void delBasket() {
        basket.clear();
    }

}


