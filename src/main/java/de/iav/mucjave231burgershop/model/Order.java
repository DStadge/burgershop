package de.iav.mucjave231burgershop.model;

import java.util.List;

public record Order (String id, List<Burger> burgers,){
}





//id, name, price, mainDish, sideDish, beverage