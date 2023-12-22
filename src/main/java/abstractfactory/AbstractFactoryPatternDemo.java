package abstractfactory;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory cremeFactory=FactoryProducer.getFactory(false);
        Creme creme1=cremeFactory.getCremeType("AntiAgedCreme");
        creme1.apply();

        AbstractFactory cremeFactory1=FactoryProducer.getFactory(true);
        Creme creme2=cremeFactory1.getCremeType("MoisturizingCreme");
        creme2.apply();
        Creme creme3=cremeFactory1.getCremeType("Serum");
        creme3.apply();


    }
}
