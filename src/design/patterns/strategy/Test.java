package design.patterns.strategy;

import design.patterns.strategy.strategies.EatingWithFork;
import design.patterns.strategy.strategies.EatingWithSpoon;

public class Test {

    public static void main(String[] args) {

        Person furkan = new Person("Furkan", new EatingWithSpoon());
        furkan.eat();

        Person said = new Person("Said", new EatingWithFork());
        said.eat();
    }
}
