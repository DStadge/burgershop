package de.iav.mucjave231burgershop.repository;

import de.iav.mucjave231burgershop.exception.MenueNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class MenueRepository {

    private final List<Product> products;

    public ProductRepository() {
        products = new ArrayList<>();
        // Zur besseren Testbarkeit mit dem Controller, habe ich hier initiale Produkte eingefügt
//        addInitialProducts();
    }

    public ProductRepository(List<Product> products) {
        this.products = products;
        // Zur besseren Testbarkeit mit dem Controller, habe ich hier initiale Produkte eingefügt
//        addInitialProducts();
    }

    public List<Product> list() {
        return products;
    }

    public Product getProductById(String idOfRequestedProduct) {
        // Indices:  0              1                      2
        //          AppleKeyboard   Vorwerk Staubsauger    Les Paul Gitarre

        // for-each Schleife
        // Wir "schauen" uns die products Liste STück für Stück an
        // singleProductFromList -> Das Objekt aus der Liste das wir uns anschauen
        for (Product singleProductFromList : products) {
            if (singleProductFromList.id().equals(idOfRequestedProduct)) {
                return singleProductFromList;
            }
        }

        // Wenn for-Schleife durchgelaufen ist, aber nichts gefunden hat ...
        // Soll eine Exception geworfen werden
        throw new MenueNotFoundException(idOfRequestedProduct);
    }
    public void addProduct(Product productToAdd) {
        products.add(productToAdd);
    }


    private void addInitialProducts() {
        this.products.addAll(List.of(new Product("Product-1", "Georgischer Rotwein"), new Product("Product-2", "Franz. Chardonnay"), new Product("Product-3", "Adiletten"), new Product("Product-4", "Bademantel"), new Product("Product-5", "Apple Keyboard")));
    }


}
