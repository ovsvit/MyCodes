import java.util.*;
public class stk_prac {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
       /*Stack<Integer> st=new Stack<>();
        int n=inp.nextInt();
        for(int i=0;i<n;i++){
            int ele=inp.nextInt();
            st.push(ele);
        }
        int s=inp.nextInt();
        System.out.println(st.search(s));

        int lel;
        while(!st.isEmpty()){
            lel=st.pop();
            System.out.println("ele: "+lel);
        } */ 
        int n=inp.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=inp.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
           System.out.print(arr[i]+" ");


    }
    
}
