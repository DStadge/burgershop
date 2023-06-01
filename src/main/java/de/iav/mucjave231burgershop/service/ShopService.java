package de.iav.mucjave231burgershop.service;

import de.iav.mucjave231burgershop.model.Menue;
import de.iav.mucjave231burgershop.repository.MenueRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShopService {

    // Abhängigkeiten -> Der ShopService BRAUCHT diese Repositories

    private final MenueRepository menueRepository;

    public ShopService(MenueRepository menueRepository) {
       this.menueRepository = menueRepository;
    }

    public Menue getMenueById(String id) {
        return menueRepository.getMenueById(id);
    }

    // ShopService greift auf das Repository zu
    public List<Menue> listMenues() {
        return menueRepository.list();
    }

    public void addMenue(Menue menueToAdd) {
        menueRepository.addMenue(menueToAdd);
    }




}




