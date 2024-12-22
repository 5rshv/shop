package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;

public class app {
  public static void main(String[] args) {
    System.out.println("Корзина: ");
    ProductBasket.printBasket();
    System.out.print("ИТОГО: ");
      ProductBasket.totalPriceBasket();
      System.out.println("Поиск по ключевому слову Стол");
    ProductBasket.productInBasket("Стол");
    System.out.println("Добавление продукта");
      ProductBasket.addProductInBasket();
    System.out.println("Очистка корзины");
      ProductBasket.delBasket();
      ProductBasket.printBasket();

  }
}

