package design.patterns.adapter.adapter;

import design.patterns.adapter.shape.RoundPeg;
import design.patterns.adapter.shape.SquarePeg;

public class SquarePegAdapter extends RoundPeg {

    private final SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        return Math.sqrt(Math.pow(peg.getWidth() / 2, 2) * 2) ;
    }
}
