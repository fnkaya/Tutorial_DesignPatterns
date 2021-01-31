package design.patterns.prototype.shape;

import java.util.Objects;

public abstract class Shape {

    public int x;
    public int y;
    public String color;

    public Shape() {}

    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Shape)) return false;
        Shape shape = (Shape) o;
        return this.x == shape.x && this.y == shape.y && Objects.equals(this.color, shape.color);
    }
}
