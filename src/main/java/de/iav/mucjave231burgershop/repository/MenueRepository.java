package de.iav.mucjave231burgershop.repository;

import de.iav.mucjave231burgershop.exception.MenueNotFoundException;
import de.iav.mucjave231burgershop.model.Menue;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
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

    public Menue getMenueById(String idOfRequestedMenue) {
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

    public void addMenue(Menue menueToAdd) {menues.add(menueToAdd);
    }

private void addInitialMenues() {

        this.addMenue (new Menue("1", "6.99", "Mac", "Pommes","Cola"));

    }

}
