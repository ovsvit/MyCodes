import java.util.*;

public class excep3 {
public static void main(String args[]) {
    System.out.println("\nName:Jumana Begum M\nReg no:21BIT0694\n");
    try {
        int a[]=new int[5];  
        a[1]=50;
    } catch (ArrayIndexOutOfBoundsException e) {

         System.out.println(e);
    }

    System.out.println("hello world");
}
}

