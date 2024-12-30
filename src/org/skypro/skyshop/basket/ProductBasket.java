package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.Arrays;


public class ProductBasket {
    private int count = 0;

    private Product[] products = new Product[5];

    public void addProductInBasket(Product product) {
        if (count < products.length) {
            products[count++] = product;
            System.out.println("Добавлен продукт " + product.getNameProduct());
        } else {
            System.out.println("Невозможно добавить продукт!");
        }

    }

    public void totalPriceBasket() {
        double sum = 0;
        for (Product value : products) {
            sum = sum + value.getPriceProduct();
        }
        System.out.println(sum);
    }

    public void printBasket() {
        if (count == 0) {
            System.out.println("Корзина пуста!");
        } else {
            for (Product value : products) {
                System.out.println(value);
            }
        }
    }

    public boolean productInBasket(String nameProduct) {
        boolean b = false;
        if (count == 0) {
            System.out.println("Корзина пуста!");
        } else {
            for (Product value : products) {
                if (value.getNameProduct().equals(nameProduct)) {
                    b = true;
                    break;
                }
            }
        }
        System.out.println(b);
        return b;
    }

    public void delBasket() {
        Arrays.fill(products, null);
        count = 0;
    }

}


