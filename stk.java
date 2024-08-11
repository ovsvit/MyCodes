import java.util.*;
public class stk {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        int n=inp.nextInt();
        int ele;
        for(int i=0;i<n;i++){
            ele=inp.nextInt();
            st.push(ele);
        }
        int delele;
        while(!st.empty()){
            delele=st.pop();
            System.out.print(delele+" ");
        }

    }
    
}
