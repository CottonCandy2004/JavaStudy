/**
 * @Author: CottonCandy2004
 * @Discription: complex
 */

package EX2.problem1;

public class complex {
    protected double realPart;
    protected double imaginaryPart;
    complex(double realPart, double imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
    complex(){
        this.realPart = 0;
        this.imaginaryPart = 0;
    }
    public void printComplex(){
        System.out.println("(" + this.realPart + " + " + this.imaginaryPart + "i" + ")");
    }
    public complex add(complex c){
        complex result = new complex();
        result.realPart = this.realPart + c.realPart;
        result.imaginaryPart = this.imaginaryPart + c.imaginaryPart;
        return result;
    }
    public complex subtract(complex c){
        complex result = new complex();
        result.realPart = this.realPart - c.realPart;
        result.imaginaryPart = this.imaginaryPart - c.imaginaryPart;
        return result;
    }
    public complex multiply(complex c){
        complex result = new complex();
        result.realPart = this.realPart * c.realPart - this.imaginaryPart * c.imaginaryPart;
        result.imaginaryPart = this.realPart * c.imaginaryPart + this.imaginaryPart * c.realPart;
        return result;
    }
    public complex divide(complex c){
        complex result = new complex();
        result.realPart = (this.realPart * c.realPart + this.imaginaryPart * c.imaginaryPart) / (c.realPart * c.realPart + c.imaginaryPart * c.imaginaryPart);
        result.imaginaryPart = (this.imaginaryPart * c.realPart - this.realPart * c.imaginaryPart) / (c.realPart * c.realPart + c.imaginaryPart * c.imaginaryPart);
        return result;
    }
}
