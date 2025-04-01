/**
 * @Author: CottonCandy2004
 * @Discription: Shape
 */

package EX2.problem2;

abstract public class Shape {
    abstract double Area();
    abstract double Perimeter();
    void print(){
        System.out.println("Area: " + Area());
        System.out.println("Perimeter: " + Perimeter());
    }
}

class Circle extends Shape {
    private double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    Circle() {
        this.radius = 0;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    double Area() {
        return Math.PI * radius * radius;
    }
    double Perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    Rectangle() {
        this.length = 0;
        this.width = 0;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    double Area() {
        return length * width;
    }
    double Perimeter() {
        return 2 * (length + width);
    }
}
