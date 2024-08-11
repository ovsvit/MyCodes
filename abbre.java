import java.util.*;
public class abbre {
    static void calAbb(String str){
        String[] s=str.split(" ");
        for(String x:s){
            System.out.print(x.charAt(0)+" ");
        }


    }
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in); 
        String str=inp.nextLine();
        calAbb(str);
        String num=inp.nextLine();
        int x=Integer.valueOf(num);
        System.out.print(x);
        

    }
    
}
