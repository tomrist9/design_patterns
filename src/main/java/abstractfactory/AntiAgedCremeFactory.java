package abstractfactory;

public class AntiAgedCremeFactory extends AbstractFactory {
    @Override
    Creme getCremeType(String cremeType) {
        if ((cremeType.equalsIgnoreCase("AntiAgedCreme"))) {
            return new AntiAgedCreme();
        } else {
            return null;
        }
    }
}
