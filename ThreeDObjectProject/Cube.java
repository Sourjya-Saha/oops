// Derived class Cube from ThreeDObject
class Cube extends ThreeDObject {
    // Constructor to initialize side length of the cube
    public Cube(double side) {
        super(side, side, side);  // All sides are the same for a cube
    }

    // Method to calculate the total surface area of the cube
    public double wholesurfacearea() {
        return 6 * dimension1 * dimension1;
    }

    // Method to calculate the volume of the cube
    public double volume() {
        return dimension1 * dimension1 * dimension1;
    }
}
