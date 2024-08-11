import java.util.*;
public class celeb1 {
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
          int col=0;
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
                //System.out.println("Flag1: "+flag);
                for(int k=0;k<n;k++)
                {
                    //System.out.println("i: "+i);
                    
                    if(arr[k][i]==1 && arr[k][k]==0){
                        col++;            

                        //System.out.println("col: "+col);

                    }
                        
                }
                if(col==n-1){
                    System.out.println("Celeberity: "+i);

                }
                
            }      
            count=0;
           // System.out.println("col: "+col);
          }
          //System.out.println("Flag: "+flag);
                 
    }
}


    

