package de.iav.mucjave231burgershop.Controller;


import de.iav.mucjave231burgershop.model.Menue;
import de.iav.mucjave231burgershop.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ShopController {


    private final ShopService shopService;


    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping("/menue")
    public List<Menue> allBurgers(){
        return shopService.listMenues();
    }

    @GetMapping("/menue/{id}")
    public Menue getSingleBurger(@PathVariable String id){
        return shopService.getMenueById(id);
    }

     @PostMapping("/menue")
    public void addMenue(@RequestBody Menue menue){
        shopService.addMenue(menue);
    }

  //  @PutMapping("/po")
  //  public void addMenue(@RequestBody Menue order){
      //  shopService.addMenue(order);}

//    @DeleteMapping("/menue/{id}")
  //  public void delMenue(@PathVariable String id){shopService}

}
/*
    GET /api/menus (Gibt alle Menüs zurück)
    GET /api/menus/{id} (Gibt ein bestimmtes Menü zurück)
    POST /api/menus (Fügt ein neues Menü hinzu)
    PUT /api/menus/{id} (Ändert ein bestehendes Menü ab)
    DELETE /api/menus/{id} (Löscht ein bestimmtes Menü)
*/



