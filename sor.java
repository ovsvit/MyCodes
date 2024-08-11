import java.util.*;
public class sor {
    public static void main(String[] args){
          Scanner inp=new Scanner(System.in);
          int arr[]=new int[5];
          for(int i=0;i<5;i++){
             arr[i]=inp.nextInt();
          }
          Arrays.sort(arr);
          for(int i=0;i<5;i++){
             System.out.println(arr[i]+" ");
         }
    }
    
}
