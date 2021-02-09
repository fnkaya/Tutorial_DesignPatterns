package design.patterns.adapter;

import design.patterns.adapter.adapter.SquarePegAdapter;
import design.patterns.adapter.shape.RoundPeg;
import design.patterns.adapter.shape.SquarePeg;

public class Test {

    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rPeg = new RoundPeg(5);

        if (hole.fits(rPeg)) {
            System.out.println("Round peg r5 fits round hole r5");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);

        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);

        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5");
        }

        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5");
        }
    }
}
