package abstractfactory;

public class AntiAgedCreme implements Creme{
    @Override
    public void apply() {
        System.out.println("Use this cream after 25");
    }
}
