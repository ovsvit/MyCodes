import java.util.*;
public class maxsld {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=sc.nextInt();
        int i,j,max;
        int ar[]=new int[n];
        for(i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        for(i=0;i<= n-l;i++){
            max=0;
            for(j=i;j<i+l;j++){
                if(ar[j]>max)
                {
                    max=ar[j];
                }
            }
            System.out.print(max+" ");
        }
    } 
}
