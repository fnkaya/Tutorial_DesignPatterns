package design.patterns.prototype.shape;

public class Rectangle extends Shape {

    public int width;
    public int height;

    public Rectangle() {}

    public Rectangle(Rectangle target) {
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public Shape clone() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Rectangle) || !super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return this.width == rectangle.width && this.height == rectangle.height;
    }
}
