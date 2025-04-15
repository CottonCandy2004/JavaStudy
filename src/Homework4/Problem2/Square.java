package Homework4.Problem2;

interface Area{
    double area();
}
interface Perimeter{
    double perimeter();
}

public class Square implements Area, Perimeter {
    private double length;
    private double width;
    Square(double length, double width) {
        this.length = length;
        this.width = width;
    }
    Square() {
        this.length = 0;
        this.width = 0;
    }
    public double area() {
        return length * width;
    }
    public double perimeter() {
        return 2 * (length + width);
    }

    void print() {
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
}