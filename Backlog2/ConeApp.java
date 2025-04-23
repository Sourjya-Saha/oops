import java.util.Scanner;

class Cone {
    private double radius;
    private double height;
    private double slantHeight;
    
    // Constructor
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
        this.slantHeight = Math.sqrt(radius * radius + height * height); // Slant height formula
    }

    public double volume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

    public double surfaceArea() {
        return Math.PI * radius * (radius + slantHeight);
    }

    public double getSlantHeight() {
        return slantHeight;
    }
}

public class ConeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius of the cone: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter height of the cone: ");
        double height = scanner.nextDouble();

        Cone cone = new Cone(radius, height);

        System.out.println("Slant Height of the cone: " + cone.getSlantHeight());
        System.out.println("Volume of the cone: " + cone.volume());
        System.out.println("Surface Area of the cone: " + cone.surfaceArea());

        scanner.close();
    }
}
