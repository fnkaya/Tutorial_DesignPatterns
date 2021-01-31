package design.patterns.prototype;

import design.patterns.prototype.shape.Circle;
import design.patterns.prototype.shape.Rectangle;
import design.patterns.prototype.shape.Shape;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Shape> shapeList = new ArrayList<>();
        List<Shape> copyShapeList = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapeList.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapeList.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapeList.add(rectangle);

        cloneAndCompare(shapeList, copyShapeList);
    }

    private static void cloneAndCompare(List<Shape> shapeList, List<Shape> copyShapeList) {
        shapeList.forEach(shape -> copyShapeList.add(shape.clone()));

        for (int i=0; i<shapeList.size(); i++) {
            if (shapeList.get(i) != copyShapeList.get(i)) {
                System.out.println(i + ": Shapes are different");
                if (shapeList.get(i).equals(copyShapeList.get(i)))
                    System.out.println(i + ": And they are identical");
                else
                    System.out.println(i + ": But they are not identical");
            }
            else
                System.out.println(i + ": Shape are same");
        }
    }
}
