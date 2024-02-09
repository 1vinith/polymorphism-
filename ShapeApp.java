package polymorphism.com;
import java.util.Scanner;

class Shape {
    public void draw() {
        System.out.println("Drawing shape...");
    }

    public void fillColor(String color) {
        System.out.println("Filling color with " + color + "...");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}

public class ShapeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a shape:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        Shape shape = null;

        switch (choice) {
            case 1:
                shape = new Circle();
                break;
            case 2:
                shape = new Triangle();
                break;
            case 3:
                shape = new Square();
                break;
            default:
                System.out.println("Invalid choice!");
                System.exit(1);
        }

        scanner.nextLine(); // Consume newline
        System.out.print("Enter color for the shape: ");
        String color = scanner.nextLine();

        System.out.println("---Drawing Shape---");
        shape.draw();
        shape.fillColor(color);

        scanner.close();
    }
}
