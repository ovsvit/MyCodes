import java.util.*;
public class longinseq {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
           arr[i]=inp.nextInt();
        
        int lis[]=new int[n];
        Arrays.fill(lis,1);

        for(int i=1;i<n;i++)
          for(int j=0;j<i;j++)
             if(arr[i]>arr[j] && lis[i]<lis[j]+1)
                lis[i]=lis[j]+1;

        int max=0;
        for(int i=0;i<n;i++)
        {
            if(lis[i]>max)
               max=lis[i];
        }
        System.out.print("Max: "+max);

    }
    
}
