package builderpattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    List<Item> items= new ArrayList<>();

public void addItem(Item item){
    items.add(item);

}
public float getCost(){
    float cost=0.0f;
    for(Item item:items){
        cost+=item.price();
    }
    return cost;
}
public void showItems(){
    for(Item item:items) {
        System.out.println("Your item is"+item.name());
        System.out.println("Your packing is"+ item.packing());
        System.out.println("Price is"+ item.price());

    }

}
}
