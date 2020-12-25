package design.patterns.factory;

public class ComputerFactory {

    public static Computer getInstance(Class pClass) throws IllegalAccessException, InstantiationException {

        return (Computer) pClass.newInstance();
    }

    public static Computer getInstance(ComputerBrand brand){

        switch (brand) {
            case MAC: return new Mac();
            case HP: return new Hp();
            default: throw new UnsupportedOperationException();
        }
    }
}
