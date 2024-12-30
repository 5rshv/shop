package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

public class app {

    public static void main(String[] args) {

        ProductBasket productBasket = new ProductBasket();

        Product products1 = new SimpleProduct("Стол", 12000);
        Product products2 = new SimpleProduct("Стул", 10000);
        Product products3 = new FixPriceProduct("Кресло");
        Product products4 = new DiscountedProduct("Пуфик", 2000, 10);
        Product products5 = new DiscountedProduct("Кровать", 35000, 50);

        productBasket.addProductInBasket(products1);
        productBasket.addProductInBasket(products2);
        productBasket.addProductInBasket(products3);
        productBasket.addProductInBasket(products4);
        productBasket.addProductInBasket(products5);
        System.out.println("Корзина: ");
        productBasket.printBasket();
        System.out.print("ИТОГО: ");
        productBasket.totalPriceBasket();
        System.out.println("Очистка корзины");
        productBasket.delBasket();
        productBasket.printBasket();

    }
}

