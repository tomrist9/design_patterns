package builderpattern;

public class NonAlcoholDrinks extends Drink{
    @Override
    public String name() {
        return "NonAlcoholDrink";
    }

    @Override
    public float price() {
        return 5.0f;
    }
}
