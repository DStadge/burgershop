package de.iav.mucjave231burgershop.service;

import de.iav.mucjave231burgershop.model.Burger;
import de.iav.mucjave231burgershop.model.Menue;
import de.iav.mucjave231burgershop.repository.BurgerRepository;
import de.iav.mucjave231burgershop.repository.MenueRepository;

import java.awt.*;
import java.util.List;

public class ShopService {

    // Abhängigkeiten -> Der ShopService BRAUCHT diese Repositories
    private final BurgerRepository burgerRepository;
    private final MenueRepository menueRepository;

    public ShopService(BurgerRepository burgerRepository, MenueRepository menueRepository) {
        this.burgerRepository = burgerRepository;
        this.menueRepository = menueRepository;
    }

    public Menue getMenueById(String id) {
        return menueRepository.getMenueById(id);
    }

    public Burger getProductById(String id) {
        return burgerRepository.getBurgerById(id);
    }

    public List<Burger> listBurgers() {
        return burgerRepository.list();
    }

    // ShopService greift auf das Repository zu
    public List<Menue> listMenues() {
        return menueRepository.list();
    }

    public void addMenue(Menue menueToAdd) {
        menueRepository.addMenue(menueToAdd);
    }
}



}
