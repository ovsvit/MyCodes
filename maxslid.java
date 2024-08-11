import java.util.*;
public class maxslid {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=inp.nextInt();
        }
        int i=0;
        int max;
        System.out.println();
        while(i<n-2)
        {
            int j=i;
            {
                //System.out.print("Elements: "+arr[j]+" "+arr[j+1]+" "+arr[j+2]);
                if(arr[j]>arr[j+1] && arr[j]>arr[j+2])
                    max=arr[j];
                else if(arr[j+1]>arr[j] && arr[j+1]>arr[j+2])
                    max=arr[j+1];
                else
                    max=arr[j+2];
                System.out.println("\nmax: "+max);

                
            }
            System.out.println();
            i++;
        }
    }   
}
