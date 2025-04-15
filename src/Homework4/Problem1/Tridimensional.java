package Homework4.Problem1;

abstract public class Tridimensional {
    abstract double Volume();
    abstract double SurfaceArea();
    void print() {
        System.out.println("Volume: " + Volume());
        System.out.println("Surface Area: " + SurfaceArea());
    }
}

class Cuboid extends Tridimensional {
    double length;
    double width;
    double height;
    Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    double Volume() {
        return length * width * height;
    }
    double SurfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }
}
