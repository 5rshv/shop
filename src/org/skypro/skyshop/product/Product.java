package org.skypro.skyshop.product;
import org.skypro.skyshop.basket.ProductBasket;

import java.util.Objects;

public class Product {
    private String nameProduct;
    private double priceProduct;

    public Product(String nameProduct, double priceProduct) {
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    @Override
    public String toString() {
        return  nameProduct  + " "+  priceProduct ;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Product product)) return false;
        return Objects.equals(nameProduct, product.nameProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nameProduct);
    }
}
