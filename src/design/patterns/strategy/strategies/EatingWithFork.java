package design.patterns.strategy.strategies;

import design.patterns.strategy.strategies.EatingStrategy;

public class EatingWithFork implements EatingStrategy {

    @Override
    public void eat(String name) {
        System.out.println(String.format("%s eats with fork.", name));
    }
}
