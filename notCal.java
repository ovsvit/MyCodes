import java.util.*;
public class notCal{
    public static int calRes(int k){
        int res=k+1;
        while(true){
            String s=Integer.toBinaryString(res);
            if(s.contains("11")){
                res++;
            }
            else
              return res;

        }
        
        //return res;

    }
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int k=inp.nextInt();
        System.out.print(calRes(k));

    }
}