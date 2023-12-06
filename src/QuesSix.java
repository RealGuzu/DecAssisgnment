import java.util.Scanner;

abstract class Shape {
    abstract double area();
    abstract double perimeter();
}

class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape {
    private final double side1;
    private final double side2;
    private final double base;

    public Triangle(double side1, double side2, double base) {
        this.side1 = side1;
        this.side2 = side2;
        this.base = base;
    }

    @Override
    public double area() {
        double semiPerimeter = (side1 + side2 + base) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - base));
    }

    @Override
    public double perimeter() {
        return side1 + side2 + base;
    }
}

public class QuesSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter circle radius: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter triangle side 1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter triangle side 2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter triangle base: ");
        double base = scanner.nextDouble();

        Circle circle = new Circle(radius);
        Triangle triangle = new Triangle(side1, side2, base);

        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());
        System.out.println("Triangle Area: " + triangle.area());
        System.out.println("Triangle Perimeter: " + triangle.perimeter());

        scanner.close();
    }
}
