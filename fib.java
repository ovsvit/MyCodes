import java.util.*;
public class fib{
    public static void fib(int n){ 
      int f[]=new int[n+1]; 
      int i; 
      f[0] = 0;   f[1] = 1;  
      for (i = 2; i <= n; i++) 
          f[i] = f[i-1] + f[i-2]; 

      for (i=0;i<n;i++){
        System.out.print(f[i]+" ");
      }
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        fib(n);
    }
}
