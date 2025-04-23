// Derived class Box from ThreeDObject
class Box extends ThreeDObject {
    // Constructor to initialize dimensions of the box
    public Box(double length, double width, double height) {
        super(length, width, height);
    }

    // Method to calculate the total surface area of the box
    public double wholesurfacearea() {
        return 2 * (dimension1 * dimension2 + dimension1 * dimension3 + dimension2 * dimension3);
    }

    // Method to calculate the volume of the box
    public double volume() {
        return dimension1 * dimension2 * dimension3;
    }
}
