import java.util.*;
public class celeb {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++)
          for(int j=0;j<n;j++){
              arr[i][j]=inp.nextInt();
          }

          for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
  
            }
             System.out.println();
          }
          int count=0;
          int flag=0;
          int col;
          for(int i=0;i<n;i++)
          {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]==0)
                {
                    count++;
                }
            }
            if(count==n)
            {
                flag++;
                col=i;
                
            }    
            else{
                col=10;
            }   
            count=0;
           // System.out.println("col: "+col);
          }
          System.out.println("Flag: "+flag);
          int f=0;
          if(flag==1)
          {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(j!=col)
                     {
                        if(arr[i][col]==1)
                           f++;
                     }
                }
                 if(f==n-1){
                    System.out.println("Celebrity: "+i);
                }
           }
           
          }
          else{
            System.out.println("No celebrity.");
          }         
    }
}


    

