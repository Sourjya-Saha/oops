// Derived class Cone from ThreeDObject
class Cone extends ThreeDObject {
    // Constructor to initialize radius and height of the cone
    public Cone(double radius, double height) {
        super(radius, height, 0);  // Only two dimensions needed
    }

    // Method to calculate the total surface area of the cone
    public double wholesurfacearea() {
        return Math.PI * dimension1 * (dimension1 + Math.sqrt(dimension1 * dimension1 + dimension2 * dimension2));
    }

    // Method to calculate the volume of the cone
    public double volume() {
        return (Math.PI * dimension1 * dimension1 * dimension2) / 3;
    }
}
