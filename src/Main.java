import shapes.*;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1.Cube 2.Rectangular Prison 3.Sphere 4.Cone: ");
        {
            int option = scanner.nextInt();
            switch (option) {
                case 1 -> {
                    Cube cube;
                    {
                        System.out.println("Enter color: ");
                        String color = scanner.next();
                        System.out.println("Enter name: ");
                        String name = scanner.next();
                        System.out.println("Enter side for the cube: ");
                        double side = scanner.nextDouble();
                        Square square = new Square(color, name, side);
                        cube = new Cube(square);
                    }
                    System.out.println("Cube's name: " + cube.getName() + "\nCube's color: " + cube.getColor() + "\nCube's volume: " + cube.getVolume());
                }

                case 2 -> {
                    RectangularPrison rectangularPrison;
                    {
                        System.out.println("Enter color: ");
                        String color = scanner.next();
                        System.out.println("Enter name: ");
                        String name = scanner.next();
                        System.out.println("Enter length for the rectangular prison: ");
                        double length = scanner.nextDouble();
                        System.out.println("Enter base for the rectangular prison: ");
                        double base = scanner.nextDouble();
                        System.out.println("Enter height for the rectangular prison: ");
                        double height = scanner.nextDouble();
                        rectangularPrison = new RectangularPrison(color, name, length, base, height);

                    }
                    System.out.println("Rectangular's name: " + rectangularPrison.getName() + "\nRectangular's color: " + rectangularPrison.getColor() + "\nRectangular's volume: " + rectangularPrison.getVolume());
                }

                case 3 -> {
                    Sphere sphere;
                    {
                        System.out.println("Enter color: ");
                        String color = scanner.next();
                        System.out.println("Enter name: ");
                        String name = scanner.next();
                        System.out.println("Enter radius: ");
                        double radius = scanner.nextDouble();
                        Circle circle = new Circle(color, name, radius);
                        sphere = new Sphere(circle);
                    }
                    System.out.println("Sphere's name: " + sphere.getName() + "\nSphere's color: " + sphere.getColor() + "\nSphere's volume: " + sphere.getVolume());
                }

                case 4 -> {
                    Cone cone;
                    {
                        System.out.println("Enter color: ");
                        String color = scanner.next();
                        System.out.println("Enter name: ");
                        String name = scanner.next();
                        System.out.println("Enter radius: ");
                        double radius = scanner.nextDouble();
                        System.out.println("Enter height: ");
                        double height = scanner.nextDouble();
                        Circle circle = new Circle(color, name, radius);
                        cone = new Cone(circle, height);
                    }
                    System.out.println("Cone's name: " + cone.getName() + "\nCone's color: " + cone.getColor() + "\nCone's volume: " + cone.getVolume());
                }

                default -> System.out.println("Invalid input");
            }
        }
    }
}