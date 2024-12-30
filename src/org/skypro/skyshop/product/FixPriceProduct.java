package org.skypro.skyshop.product;

public class FixPriceProduct extends Product {

    private static final double PRICE = 1000;

    public FixPriceProduct(String nameProduct) {
        super(nameProduct);
    }

    @Override
    public double getPriceProduct() {
        return PRICE;
    }

    @Override
    public String toString() {
        return nameProduct +
                " : Фиксированная цена " + getPriceProduct();
    }
}
