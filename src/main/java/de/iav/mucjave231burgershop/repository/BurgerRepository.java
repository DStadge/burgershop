package de.iav.mucjave231burgershop.repository;

import de.iav.mucjave231burgershop.exception.MenueNotFoundException;
import de.iav.mucjave231burgershop.model.Burger;

import java.util.ArrayList;
import java.util.List;

public class BurgerRepository {

    private final List<Burger> burgers;

    public BurgerRepository() {
        burgers = new ArrayList<>();
        // Zur besseren Testbarkeit mit dem Controller, habe ich hier initiale Produkte eingefügt
//        addInitialProducts();
    }

    public BurgerRepository(List<Burger> burgers) {
        this.burgers = burgers;
        // Zur besseren Testbarkeit mit dem Controller, habe ich hier initiale Produkte eingefügt
//        addInitialProducts();
    }

    public List<Burger> list() {
        return burgers;
    }
    public Burger getBurgerById(String idOfRequestedProduct) {
        // Indices:  0              1                      2
        //          AppleKeyboard   Vorwerk Staubsauger    Les Paul Gitarre

        // for-each Schleife
        // Wir "schauen" uns die products Liste STück für Stück an
        // singleProductFromList -> Das Objekt aus der Liste das wir uns anschauen
        for (Burger singleProductFromList : burgers) {
            if (singleProductFromList.id().equals(idOfRequestedProduct)) {
                return singleProductFromList;
            }
        }

        // Wenn for-Schleife durchgelaufen ist, aber nichts gefunden hat ...
        // Soll eine Exception geworfen werden
        throw new MenueNotFoundException(idOfRequestedProduct);
    }
    public void addProduct(Burger productToAdd) {
        burgers.add(productToAdd);
    }


    private void addInitialBurgers() {
        this.burgers.addAll(List.of(new Burger("Product-1", "8.99", "BigMac", "Pommes", "Cola"), new Burger("Product-2", "12.99", "UltraBigMac", "Eis","Fanta"), new Burger("Product-3", "6.50","FishMac", "irgendwas","Bier")));
    }


}
