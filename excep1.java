import java.util.*;
public class excep1 {
public static void main(String args[]) {
    System.out.println("\nName:Jumana Begum M\nReg no:21BIT0694\n");
    try {
        int a = 15;
        int b = 5;
        int c = a / b;
        System.out.println(c);
    } catch (ArithmeticException e) {
           System.out.println(e);
        }
    System.out.println("hello world! ");
   }
}

