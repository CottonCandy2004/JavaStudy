package Class.Lesson2;

import java.io.*;
public class ex3to4 {
    public static void main(String[] args) throws IOException{
        BufferedReader buf;
        String str1, str2;
        buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please input String:");
        str1 = buf.readLine();
        System.out.println("Your input String is " + str1);
        System.out.print("Please input a float:");
        str2 = buf.readLine();
        float num = Float.parseFloat(str2);
        System.out.println(num + " times 10 to int:" + (int)(10*num));
    }
}
