package builderpattern;

public class ChickenPizza extends Pizza{
    @Override
    public String name() {
        return "ChickenPizza";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
