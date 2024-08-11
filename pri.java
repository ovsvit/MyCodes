import java.util.*;
public class pri {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        String[] str1=new String[3];
        int[] prio=new int[3];

        for(int i=0;i<3;i++){
            str1[i]=inp.nextLine();
            prio[i] = Integer.parseInt(inp.nextLine());

        }
        int temp1;
        String temp2;
        for(int i=0;i<3;i++) 
           for(int j=i+1;j<3;j++)
           {
                if(prio[i]>prio[j])
                {
                   temp1=prio[i];
                   prio[i]=prio[j];
                   prio[j]=temp1;

                   temp2=str1[i];
                   str1[i]=str1[j];
                   str1[j]=temp2;

                }
           }
           for(int i=0;i<3;i++){
            System.out.print(prio[i]+" ");
        }
        for(int i=0;i<3;i++){
            System.out.print(str1[i]+" ");
        }        
    }
}
