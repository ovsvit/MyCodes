
import java.util.*;
public class array_sort_21BIT0694 {
        public static void main(String[] args){
            Scanner inp=new Scanner(System.in);
            System.out.println("\nName:Jumana Begum M\nReg no:21BIT0694\n");

            System.out.println("Enter no.of elements in array:");
            int n=inp.nextInt();
            int arr1[]=new int[n];
            System.out.println("Enter the array elements:");
            for(int i=0;i<n;i++)
                arr1[i]=inp.nextInt();

            for(int i=0;i<n;i++)
                 System.out.print(arr1[i]+" ");


            System.out.println("\n\nSorted array(in ascending):");
            Arrays.sort(arr1);
            for(int i=0;i<n;i++)
                 System.out.print(arr1[i]+" ");

            Integer arr2[]={6,1,9,8,3};
            System.out.println("\n\nSorted array(in descending):");
            Arrays.sort(arr2,Collections.reverseOrder());
            System.out.print(Arrays.toString(arr2)+" ");


            


                   




    }
}
