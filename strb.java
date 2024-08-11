import java.util.*;
import java.lang.*;
public class strb {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        String str1=inp.nextLine();
        StringBuilder str2=new StringBuilder();
        System.out.print("str: "+str1);
        str2.append(str1);
        str2.reverse();
        System.out.print("inp: "+str2);
        int x=str1.length();
        int y=str2.length();
        int dp[][]=new int[x+1][y+1];
        for(int i=0;i<=x;i++){
            for(int j=0;j<=y;j++){
                if(i==0 || j==0)
                   dp[i][j]=0;
                else if(str1.charAt(i-1)==str2.charAt(j-1))
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        System.out.print("res: "+dp[x][y]);

        



    }
    
}
