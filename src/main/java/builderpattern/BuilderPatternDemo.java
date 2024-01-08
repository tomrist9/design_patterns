package builderpattern;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MenuBuilder menuBuilder=new MenuBuilder();
        Meal mushroomMeal= menuBuilder.prepareMushRoomPizzaMenu();
        System.out.println("Pizza with Mushrooms");
        mushroomMeal.showItems();
        System.out.println("Total cost for your menu"+mushroomMeal.getCost());

        Meal chickenMeal=menuBuilder.chickenPizzaMenu();
        System.out.println("ChickenPizza");
        chickenMeal.showItems();
        System.out.println("Total cost for your menu"+chickenMeal.getCost());
    }
}
