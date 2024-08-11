import java.util.*;
public class ARRAY_2D_21BIT0694 {
    public static void main(String[] args){
            Scanner inp=new Scanner(System.in);
            int a1[][]=new int[3][3]; 
            int a2[][]=new int[3][3]; 
            System.out.println("\nName:Jumana Begum M\nReg no:21BIT0694\n");
            int res_add[][]=new int[3][3];   
            System.out.println("Enter the 1st matrix:");
            for(int i=0;i<3;i++){    
                for(int j=0;j<3;j++){    
                    a1[i][j]=inp.nextInt();   
             }       
             } 
             System.out.println("Enter the 2nd matrix:");
             for(int i=0;i<3;i++){    
                for(int j=0;j<3;j++){    
                    a2[i][j]=inp.nextInt();   
             }     
             } 
            int res_mult[][]=new int[3][3];   
            System.out.println("\nMatrix a1:");
            for(int i=0;i<3;i++){    
                for(int j=0;j<3;j++){       
                       System.out.print(a1[i][j]+" ");    
             }    
             System.out.println();   
             }  
             System.out.println("\nMatrix a2:");

             for(int i=0;i<3;i++){    
                for(int j=0;j<3;j++){        
                       System.out.print(a2[i][j]+" ");    
             }    
             System.out.println();   
             }  
             System.out.println("\nAddition result Matrix:");

            for(int i=0;i<3;i++){    
               for(int j=0;j<3;j++){    
                   res_add[i][j]=a1[i][j]+a2[i][j];     
                      System.out.print(res_add[i][j]+" ");    
            }    
            System.out.println();   
            }    

            System.out.println("\nMultiplication result matrix:");
            for(int i=0;i<3;i++){    
                for(int j=0;j<3;j++){    
                res_mult[i][j]=0;      
                for(int k=0;k<3;k++)      
                {      
                res_mult[i][j]+=a1[i][k]*a2[k][j];      
                }
                System.out.print(res_mult[i][j]+" ");   
                }
                System.out.println();   
                }    
}

}  
        
    
