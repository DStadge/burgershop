package de.iav.mucjave231burgershop.Controller;


import de.iav.mucjave231burgershop.model.Burger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ShopController {


    @GetMapping("/menue")
    public List<Burger> allBurgers(){return }



}
