import java.util.*; 
public class segeveodd {
    public static void main(String[] args){
        Scanner inp =new Scanner(System.in);
        int n;
        //int n1,n2;
        n=inp.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=inp.nextInt();
        }
        
        int a2len=0,a3len=0;
        for(int i=0;i<n;i++){
            if(arr1[i]%2==0)
                a2len++;
            else
                 a3len++;    
        }
        int j=0;
        int k=0;
        int arr2[]=new int[a2len];
        int arr3[]=new int[a3len];
        for(int i=0;i<n;i++){
            if(arr1[i]%2==0)
                arr2[j++]=arr1[i];
            else
                 arr3[k++]=arr1[i];    

        }
        for(int i=0;i<a2len;i++)
            System.out.print(arr2[i]+" ");
        for(int i=0;i<a3len;i++)
            System.out.print(arr3[i]+" ");       
    }
    
}
