package abstractfactory;

public class NormalCremeFactory extends AbstractFactory{
    @Override
    Creme getCremeType(String cremeType) {
        if(cremeType.equalsIgnoreCase("Serum")){
            return new Serum();
        }else if (cremeType.equalsIgnoreCase("MoisturizingCreme")){
            return new MoisturizingCreme();

        }
        return null;
    }
}
