import java.util.*;
public class goog {
    public static int calcRes(String s1,String s2,int m,int n,int[] p){
        int result=0;
        int i=0;
        int c=0;
        while(i<n){
            int k=p[i];
            for(int j=0;j<m;j++){
                if(s2.charAt(k)==s1.charAt(j)){
                    c++;
                    break;
                }
            }
            i++;
            if(c==m){
                return i;
            }


        }
        return result;
    }
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int m=3;
        String s1="abc";
        int n=5;
        String s2="aebtd";
        int p[]={4,1,2,3,0};
        System.out.print("Result: "+calcRes(s1,s2,m,n,p));

    }
    
}
