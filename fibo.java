import java.util.*;
public class fibo {
    static void fib(int n){
        int f[]=new int[n];
        f[0]=0;
        f[1]=1;
        for(int i=2;i<n;i++){
            f[i]=f[i-1]+f[i-2];
        }
        for(int i=0;i<n;i++)
          System.out.print(f[i]+" "); 
     /* int c,a=0;
          int b=1;
           System.out.print(a+" "+b+" ");
          for(int i=0;i<n;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
          }*/   
    }
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        fib(n);
    }
    
}
