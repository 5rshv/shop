package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {
    private double priceProduct;
    private double salePercent;

    public DiscountedProduct(String nameProduct, double priceProduct, double salePercent) {
        super(nameProduct);
        this.priceProduct = priceProduct;
        this.salePercent = salePercent;
    }


    public double getSalePercent() {
        return salePercent;
    }

    @Override
    public double getPriceProduct() {
        return priceProduct - (priceProduct * (salePercent / 100));
    }

    @Override
    public String toString() {
        return nameProduct +
                " : " + getPriceProduct() +
                " (Скидка: " + (int) salePercent + "%)";
    }
}
