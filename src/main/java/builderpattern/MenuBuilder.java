package builderpattern;

import java.awt.*;

public class MenuBuilder {

    public Meal prepareMushRoomPizzaMenu(){
        Meal meal=new Meal();
        meal.addItem(new MushRoomPizza());
        meal.addItem(new AlcoholDrinks());
        meal.addItem(new NonAlcoholDrinks());
        return meal;

    }
    public Meal chickenPizzaMenu(){
        Meal meal=new Meal();
        meal.addItem(new ChickenPizza());
        meal.addItem(new AlcoholDrinks());
        meal.addItem(new NonAlcoholDrinks());
        return meal;

    }
}
