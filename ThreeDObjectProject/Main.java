import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // For Box (length, width, height)
        System.out.print("Enter the length of the Box: ");
        double boxLength = sc.nextDouble();
        System.out.print("Enter the width of the Box: ");
        double boxWidth = sc.nextDouble();
        System.out.print("Enter the height of the Box: ");
        double boxHeight = sc.nextDouble();
        ThreeDObject box = new Box(boxLength, boxWidth, boxHeight);

        // For Cube (side length)
        System.out.print("Enter the side length of the Cube: ");
        double cubeSide = sc.nextDouble();
        ThreeDObject cube = new Cube(cubeSide);

        // For Cylinder (radius, height)
        System.out.print("Enter the radius of the Cylinder: ");
        double cylinderRadius = sc.nextDouble();
        System.out.print("Enter the height of the Cylinder: ");
        double cylinderHeight = sc.nextDouble();
        ThreeDObject cylinder = new Cylinder(cylinderRadius, cylinderHeight);

        // For Cone (radius, height)
        System.out.print("Enter the radius of the Cone: ");
        double coneRadius = sc.nextDouble();
        System.out.print("Enter the height of the Cone: ");
        double coneHeight = sc.nextDouble();
        ThreeDObject cone = new Cone(coneRadius, coneHeight);

        // Display surface areas and volumes for each object
        System.out.println("\nBox Surface Area: " + box.wholesurfacearea());
        System.out.println("Box Volume: " + box.volume());
        
        System.out.println("\nCube Surface Area: " + cube.wholesurfacearea());
        System.out.println("Cube Volume: " + cube.volume());
        
        System.out.println("\nCylinder Surface Area: " + cylinder.wholesurfacearea());
        System.out.println("Cylinder Volume: " + cylinder.volume());
        
        System.out.println("\nCone Surface Area: " + cone.wholesurfacearea());
        System.out.println("Cone Volume: " + cone.volume());

        sc.close();
    }
}
