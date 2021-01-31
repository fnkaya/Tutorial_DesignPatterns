package design.patterns.factory;

import design.patterns.factory.products.Computer;
import design.patterns.factory.products.ComputerBrand;
import design.patterns.factory.products.Hp;
import design.patterns.factory.products.Mac;

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
