package abstractfactory;

public class FactoryProducer {


    public static AbstractFactory getFactory(boolean normal){
        if(normal){
            return new NormalCremeFactory();
        }else{
            return new AntiAgedCremeFactory();
        }
    }
}
