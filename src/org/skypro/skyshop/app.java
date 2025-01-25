package org.skypro.skyshop;

import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.exception.BestResultNotFound;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;
import org.skypro.skyshop.search.Searchable;
import org.skypro.skyshop.search.SearchebleEngine;

public class app {

    public static void main(String[] args) throws BestResultNotFound {

        ProductBasket productBasket = new ProductBasket();

        Product products1 = new SimpleProduct("Стул", 10);
        Product products2 = new SimpleProduct("Стул", 10000);
        Product products3 = new FixPriceProduct("Кресло");
        Product products4 = new DiscountedProduct("Пуфик", 1000, 10);
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

        SearchebleEngine searchEngine = new SearchebleEngine(10);

        searchEngine.add(products1);
        searchEngine.add(products2);
        searchEngine.add(products3);
        searchEngine.add(products4);
        searchEngine.add(products5);

        Article article1 = new Article("Артикул 1 Привет", "Статья 1");
        Article article2 = new Article("Артикул 2 ПриветПривет", "Статья 2");
        Article article3 = new Article("Артикул 3 ПриветПриветПривет", "Статья 3");
        Article article4 = new Article("Артикул 4 ПриветПриветПриветПривет", "Статья 4");
        Article article5 = new Article("Артикул 5 Привет", "Статья 5");

        searchEngine.add(article1);
        searchEngine.add(article2);
        searchEngine.add(article3);
        searchEngine.add(article4);
        searchEngine.add(article5);


        Searchable[] searchableResults = searchEngine.search("PRODUCT");
        for (Searchable result : searchableResults) {
            if (result == null) continue;
            System.out.println(result);
        }
        searchableResults = searchEngine.search("ARTICLE");
        for (Searchable result : searchableResults) {
            if (result == null) continue;
            System.out.println(result);
        }
        searchableResults = searchEngine.search("Кровать");
        for (Searchable result : searchableResults) {
            if (result == null) continue;
            System.out.println(result);
        }

        System.out.println("____________________________");
        Searchable a = searchEngine.searchableEngine("Привет");
        System.out.println("Результат по поиску: "+ a );

        try {

        Searchable b = searchEngine.searchableEngine("xfrkv");
        System.out.println("Результат по поиску: "+ b );

        }catch (BestResultNotFound e){
            System.out.println("Ошибка: " + e.getMessage());
        }


        System.out.println("____________________________");

        System.out.println("Обработка исключений: ");
        ProductBasket eProductBasket = new ProductBasket();
        try {
            Product eProduct1 = new SimpleProduct("Стол", 0);
            Product eProduct2 = new SimpleProduct("Стул", 10000);
            Product eProduct3 = new FixPriceProduct("Кресло");
            Product eProduct4 = new DiscountedProduct("Пуфик", 1000, 1000);
            Product eProduct5 = new DiscountedProduct("Кровать", 35000, 10);

            eProductBasket.addProductInBasket(eProduct1);
            eProductBasket.addProductInBasket(eProduct2);
            eProductBasket.addProductInBasket(eProduct3);
            eProductBasket.addProductInBasket(eProduct4);
            eProductBasket.addProductInBasket(eProduct5);

        }catch (IllegalArgumentException e){
            System.out.println("Ошибка: " + e.getMessage());
        }
        eProductBasket.printBasket();
    }

    }

