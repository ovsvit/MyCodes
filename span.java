import java.util.*;
public class span {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){ 
            arr[i]=inp.nextInt();
        }
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
          ans[i]=1;
        
        for(int i=1;i<n;i++){
            int k=i-1;
            while(k>=0)
            {
                if(arr[i]<arr[k])
                    break;
                else
                    ans[i]+=1;                  
                k--;
            }          
        }
        for(int i=0;i<n;i++)
          System.out.println(ans[i]+" ");
    }
}
