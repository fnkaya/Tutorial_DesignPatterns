package design.patterns.decorator;

public class Test {

    public static void main(String[] args) {

        Phone meizu16 = new Meizu16(new AndroidPhone());

        System.out.println("Name: " + meizu16.getName());
        System.out.println("Camera: " + meizu16.getCameraCount());
        System.out.println("Price: " + meizu16.getPrice());
        System.out.println("Color: " + ((Meizu16) meizu16).getColor());
    }
}
