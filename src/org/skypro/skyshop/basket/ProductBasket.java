package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.Arrays;
import java.util.Objects;


public class ProductBasket {

    public static Product[] product = new Product[5];

    static {
        product[0] = new Product("Стол", 12000);
        product[1] = new Product("Стул", 10000);
        product[2] = new Product("Кресло", 30000);
        product[3] = new Product("Пуфик", 2000);
        product[4] = new Product("Кровать", 35000);
    }


    public static void addProductInBasket() {
        Product[] newProduct = new Product[product.length+1];
        for (int i = 0; i < product.length; i++){
            newProduct[i] = product[i];
        }
        newProduct[newProduct.length-1] = new Product("Кровать", 300000);
        for (Product value : newProduct) {
            System.out.println(value);
        }
    }

    public static void totalPriceBasket() {
        double sum = 0;
        for (Product value : product) {
            sum = sum + value.getPriceProduct();
        }
        System.out.println(sum);
    }

    public static void printBasket() {
        for (Product value : product) {
            System.out.println(value);
        }
    }
    public static boolean productInBasket(String nameProduct) {
        boolean b = false;
        for (Product value : product) {
            if (value.getNameProduct().equals(nameProduct)) {
                b = true;
                break;
            }
        }
        System.out.println(b);
        return b;
    }

    public static void delBasket() {
        Arrays.fill(product, null);
        double sum = 0;
    }
    }
