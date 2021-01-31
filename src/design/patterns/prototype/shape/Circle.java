package design.patterns.prototype.shape;

public class Circle extends Shape {

    public int radius;

    public Circle() {}

    public Circle(Circle target) {
        super(target);
        if (target != null)
            this.radius = target.radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Circle circle = (Circle) o;

        return this.radius == circle.radius;
    }
}
