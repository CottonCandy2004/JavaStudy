package Homework5.Problem1;

import java.util.ArrayList;
import java.util.Scanner;
public class sort {
    public static void main(String[] args) {
        System.out.println("Please enter integers (end with a EOF):");
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n;
        while (scanner.hasNext()){
            try {
                n = scanner.nextInt();
                list.add(n);
            } catch (Exception e){
                System.out.println("Invalid input. Please enter integers only.");
                break;
            }
        }
        scanner.close();
        if (list.isEmpty()){
            System.out.println("No integers were entered.");
            System.exit(-2);
        }
        int min = Integer.MAX_VALUE;
        for(int i : list){
            if (i < min){
                min = i;
            }
        }
        System.out.println("Minimum value: " + min);
    }
}
