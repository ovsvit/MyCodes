import java.util.*;
public class array_search_21BIT0694 {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.println("\nName:Jumana Begum M\nReg no:21BIT0694\n");
        int arr1[]={55,77,24,1,89,34};
        System.out.println("Enter the search element:");
        int search=inp.nextInt();
        int flag=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==search)
                flag=1;
        }
        if(flag==0)
          System.out.print("Search element not found");

        else
           System.out.print("Search element found");


           for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                int temp = 0;
                if (arr1[j] < arr1[i]) {
                    temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }   
        }

        System.out.println("\n\nMinimum element: "+arr1[0]);
        System.out.println("\nMaximum element: "+arr1[arr1.length-1]);

    }
}
