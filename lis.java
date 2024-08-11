import java.util.*;
public class lis {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=inp.nextInt();
        }
        int lis[]=new int[n];
        int lds[]=new int[n];
        Arrays.fill(lis,1);
        Arrays.fill(lds,1);

        for(int i=0;i<n;i++)
          System.out.print(arr[i]+" ");

        for(int i=1;i<n;i++)
          for(int j=0;j<i;j++){
              if(arr[i]>arr[j] && lis[i]<lis[j]+1)
                 lis[i]=lis[j]+1;
          }

          for(int i=n-2;i>=0;i--)
          for(int j=n-1;j>i;j--){
            if(arr[i]>arr[j] && lds[i]<lds[j]+1)
               lds[i]=lds[j]+1;
          }

          int max=0;
          for(int i=0;i<n;i++){
            if(lis[i]+lds[i]>max)
                 max=lis[i]+lds[i]-1;
          }
          System.out.println("Max: "+max);
    }
    
}
