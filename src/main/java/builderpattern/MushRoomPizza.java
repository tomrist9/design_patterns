package builderpattern;

public class MushRoomPizza extends Pizza{
    @Override
    public String name() {
        return "MushRoomPizza";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
