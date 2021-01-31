package design.patterns.strategy;

import design.patterns.strategy.strategies.EatingStrategy;

public class Person {

    private String name;
    private EatingStrategy eatingStrategy;

    public Person(String name, EatingStrategy eatingStrategy) {
        this.name = name;
        this.eatingStrategy = eatingStrategy;
    }

    public void eat() {
        eatingStrategy.eat(this.name);
    }
}
