import java.util.*;

public class excep2 {
public static void main(String args[]) {
    System.out.println("\nName:Jumana Begum M\nReg no:21BIT0694\n");
    try {
    String str="Jumana";
    System.out.println(str.length());
    } catch (NullPointerException e) {

         System.out.println(e);
    }

    System.out.println("hello world");
}
}

