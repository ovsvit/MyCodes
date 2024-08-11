import java.util.*;
public class toi {
    public static void toi(int n,char source,char destination,char auxillary){
        if(n==1){
            System.out.println("Move disc from "+source+" to "+destination);
            return;
        }
        toi(n-1,source,auxillary,destination);
        System.out.println("Move disk from "+source+" to "+destination);
        toi(n-1,auxillary,destination,source);

    }  
    
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        toi(n,'A','C','B');
        double move=(Math.pow(2,n))-1;
        System.out.print("Move: "+(int)move);

    }
}
