package de.iav.mucjave231burgershop.repository;

import de.iav.mucjave231burgershop.exception.MenueNotFoundException;
import de.iav.mucjave231burgershop.model.Burger;
import de.iav.mucjave231burgershop.model.Menue;

import java.util.ArrayList;
import java.util.List;

public class MenueRepository {



    private final List<Menue> menues;

    public MenueRepository() {
        menues = new ArrayList<>();

        // Zur besseren Testbarkeit mit dem Controller, habe ich hier initiale Bestellungen eingefügt
//        addInitialOrders();
    }

    public MenueRepository(List<Menue> menues) {
        this.menues = menues;

        // Zur besseren Testbarkeit mit dem Controller, habe ich hier initiale Bestellungen eingefügt
//        addInitialOrders();
    }

    public List<Menue> list() {
        return menues;
    }

    public Burger getOrderById(String idOfRequestedMenue) {
        // for-each Schleife
        // Wir "schauen" uns die orders Liste Stück für Stück an
        // singleOrderFromList -> Das Objekt aus der Liste das wir uns anschauen
        for (Menue singleMenueFromList : menues) {
            if (singleMenueFromList.id().equals(idOfRequestedMenue)) {
                return singleMenueFromList;

            }
        }

        // Wenn for-Schleife durchgelaufen ist, aber nichts gefunden hat ...
        // Soll eine Exception geworfen werden
        throw new MenueNotFoundException(idOfRequestedMenue);
    }
/*
    public void addMeune(Menue menueToAdd) {menues.add(menueToAdd);
    }

    private void addInitialMenues() {
        this.addMenue(new Burger("1", List.of(new Menue("Product-1", "Georgischer Rotwein"), new Menue("Product-2", "Franz. Chardonnay";

    }
*/
}
