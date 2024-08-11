import java.util.*;
public class paramConstr {
    paramConstr(String name,int age,String dept)
    {
        System.out.println("\nParametrized constuctor:\n");
        String n=name;
        int a=age;
        String d=dept;
        System.out.println("Name:"+name+"\nAge: "+age+"\nDepatment: "+dept+"\n");

    }
    public static void main(String[] args){
        System.out.println("\nName:Jumana Begum M\nReg no:21BIT0694\n");
        paramConstr C=new paramConstr("Jumana",20,"B.Tech IT");   
    }
}
