/**
 * @Author: CottonCandy2004
 * @Discription: Main of problem1
 */
package EX2.problem1;

public class Main {
    public static void main(String[] args) {
        complex c1 = new complex(3, 4);
        complex c2 = new complex(1, 2);
        complex c3 = c1.add(c2);
        System.out.print("c1=");
        c1.printComplex();
        System.out.print("c2=");
        c2.printComplex();
        System.out.print("c1 + c2 = ");
        c3.printComplex();
        complex c4 = c1.subtract(c2);
        System.out.print("c1 - c2 = ");
        c4.printComplex();
        complex c5 = c1.multiply(c2);
        System.out.print("c1 * c2 = ");
        c5.printComplex();
        complex c6 = c1.divide(c2);
        System.out.print("c1 / c2 = ");
        c6.printComplex();   
    }
}
