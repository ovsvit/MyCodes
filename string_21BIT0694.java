import java.util.*;
public class string_21BIT0694{
    public static void main(String[] args)
    {
        System.out.println();

        String str1="Jumana";
        System.out.println(str1);
        System.out.println("Printing characters:");
        for(int i=0;i<str1.length();i++)
            System.out.print(str1.charAt(i)+" ");

        String str2="jumana";
        System.out.println("\n\nPrinting string in uppercase:");
        System.out.println(str1.toUpperCase());

        String str3=new String("JUMANA");
        System.out.println("\nPrinting string in lowercase:");
        System.out.println(str1.toLowerCase());

        System.out.println("\nlength of the string:");
        System.out.println(str1.length());

        System.out.println("\nString equals:");
        System.out.println(str1.equals(str2));
        System.out.println(str1==str2);
        System.out.println(str1.compareTo(str3));

        System.out.println("\nString concatenation:");
        System.out.println(str1+str2);

        System.out.println("\nSubstring:");
        System.out.println(str1.substring(0));
        System.out.println(str1.substring(3));

        String s1=" Jumana Begum ";
        System.out.println("\nTrim:");
        System.out.println(s1.trim());
        
        int a=10;
        System.out.println("\nType casting:");
        String s2=String.valueOf(a);
        System.out.println(s2+"10");

        System.out.println("\nStartswith and endswith:");
        System.out.println(str1.startsWith("J"));
        System.out.println(str1.startsWith("M"));
        System.out.println(str1.endsWith("M"));


        System.out.println("\nReplace:");
        String str4="My name is Jumana";
        System.out.println(str4.replace("Jumana","Pearl"));

        System.out.println("\nBytes:");
        String s4="Jumana Begum";
        byte []b=s4.getBytes();
        for(int i=0;i<b.length;i++)
           System.out.print(b[i]+" ");

        String s5="Welcome";
        System.out.println("\n");
        System.out.println(s5.join("-","to","Java","Programming"));

        System.out.println("\nGet chars:");
        char []ch=new char[20];
        str4.getChars(3,11,ch,0);
        System.out.println(ch);

        System.out.println("\nIndex:");
        String s6="Java is interesting";
        System.out.println(s6.indexOf("i"));
        System.out.println(s6.lastIndexOf("i"));

        System.out.println("\nString Case:");
        System.out.println(str1.equalsIgnoreCase(str2));

        System.out.println("\nSplit strings:");
        String []s7=s6.split("\\s");
        for(String k:s7)
            System.out.println(k);

        
        













    }
}