// Derived class Cylinder from ThreeDObject
class Cylinder extends ThreeDObject {
    // Constructor to initialize radius and height of the cylinder
    public Cylinder(double radius, double height) {
        super(radius, height, 0);  // Only two dimensions needed
    }

    // Method to calculate the total surface area of the cylinder
    public double wholesurfacearea() {
        return 2 * Math.PI * dimension1 * (dimension1 + dimension2);
    }

    // Method to calculate the volume of the cylinder
    public double volume() {
        return Math.PI * dimension1 * dimension1 * dimension2;
    }
}
