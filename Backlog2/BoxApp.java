import java.util.Scanner;

class Box {
    // Declare width, height, and length variables
    private double width;
    private double height;
    private double length;

    // Constructor to initialize the Box with width, height, and length
    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    // Constructor to initialize the Box with width and height, setting a default value for length
    public Box(double width, double height) {
        this.width = width;
        this.height = height;
        this.length = 10.0; // Default value for length if not provided
    }

    // Constructor to initialize the Box with just width, setting default values for height and length
    public Box(double width) {
        this.width = width;
        this.height = 10.0; // Default value for height if not provided
        this.length = 10.0; // Default value for length if not provided
    }

    // Method to calculate and return the volume of the box
    public double volume() {
        return width * height * length;
    }
}

public class BoxApp {
    public static void main(String[] args) {
        // Scanner for taking user input
        Scanner scanner = new Scanner(System.in);

        // Input the width, height, and length of the box
        System.out.print("Enter width of the box: ");
        double width = scanner.nextDouble();

        System.out.print("Enter height of the box: ");
        double height = scanner.nextDouble();

        System.out.print("Enter length of the box: ");
        double length = scanner.nextDouble();

        // Create Box object using the constructor with width, height, and length
        Box box1 = new Box(width, height, length);
        System.out.println("Volume of the box: " + box1.volume());

        // Optionally, creating a Box object using the overloaded constructor (width and height only)
        Box box2 = new Box(width, height);
        System.out.println("Volume of the box with default length: " + box2.volume());

        // Optionally, creating a Box object using the overloaded constructor (only width)
        Box box3 = new Box(width);
        System.out.println("Volume of the box with default height and length: " + box3.volume());

        // Closing the scanner
        scanner.close();
    }
}


//without input method
// class Box {
//     private double width, height, length;

//     // Constructor with parameters
//     public Box(double width, double height, double length) {
//         this.width = width;
//         this.height = height;
//         this.length = length;
//     }

//     // Constructor with default values
//     public Box() {
//         this.width = 1.0;
//         this.height = 1.0;
//         this.length = 1.0;
//     }

//     // Method to calculate the volume of the box
//     public double volume() {
//         return width * height * length;
//     }
// }

// public class BoxApp {
//     public static void main(String[] args) {
//         Box box1 = new Box(5, 10, 2);
//         Box box2 = new Box(); // Uses default values
//         System.out.println("Volume of Box 1: " + box1.volume());
//         System.out.println("Volume of Box 2 (default): " + box2.volume());
//     }
// }
