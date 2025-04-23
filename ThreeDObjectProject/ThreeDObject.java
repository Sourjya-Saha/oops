// Abstract class representing 3D objects
abstract class ThreeDObject {
    // Protected variables for dimensions
    protected double dimension1, dimension2, dimension3;

    // Constructor to initialize dimensions
    public ThreeDObject(double dimension1, double dimension2, double dimension3) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
        this.dimension3 = dimension3;
    }

    // Abstract methods to be implemented by derived classes
    public abstract double wholesurfacearea();
    public abstract double volume();
}
