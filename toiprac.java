import java.util.*;
import java.lang.*;
public class toiprac {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int n;
        n=inp.nextInt();
        toi(n,'A','C','B');
    }
    public static void toi(int n,char source,char destination,char auxillary){
          if(n==1){
            System.out.println("Move disk 1 from "+source+" to "+destination);
            return;
          }
          toi(n-1,source,auxillary,destination);
          System.out.println("Move disk "+n+" from " +source+" to "+destination);
          toi(n-1,auxillary,destination,source);

    }
}
