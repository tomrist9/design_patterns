package builderpattern;

public class AlcoholDrinks extends Drink{
    @Override
    public String name() {
        return "AlcoholDrink";
    }

    @Override
    public float price() {
        return 20.0f;
    }
}
