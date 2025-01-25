package org.skypro.skyshop.product;

public class SimpleProduct extends Product {
    private double priceProduct;

    public SimpleProduct(String nameProduct, double priceProduct) {
        super(nameProduct);
        if (priceProduct <= 0){
            throw new IllegalArgumentException("Цена должна быть больше 0 ");
        }
        this.priceProduct = priceProduct;
    }

    @Override
    public double getPriceProduct() {
        return priceProduct;
    }

    @Override
    public String toString() {
        return nameProduct + " : " + priceProduct;
    }
}
