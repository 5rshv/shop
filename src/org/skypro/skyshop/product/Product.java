package org.skypro.skyshop.product;

import org.skypro.skyshop.search.Searchable;

import java.util.Objects;


public abstract class Product implements Searchable {
    protected String nameProduct;


    public Product(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public abstract double getPriceProduct();


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Product product)) return false;
        return Objects.equals(nameProduct, product.nameProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nameProduct);
    }

    @Override
    public String getTypeContent() {
        return "PRODUCT";
    }

    @Override
    public String getSearchTerm() {
        return getNameProduct() + " " + getTypeContent();
    }

}
