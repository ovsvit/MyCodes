import java.util.Stack;
public class stck {
    public static boolean isstackper(int[] original,int[] target){
        Stack<Integer> stack=new Stack<>();
        int i=0;
        for(int element : original){
            stack.push(element);
            while(!stack.isEmpty() && stack.peek()==target[i]){
                stack.pop();
                i++;
            }
            

        }
        return stack.isEmpty();


    }
    public static void main(String[] args){
        int[] orig={1,3,2}; 
        int[] targ={2,1,3};
        boolean result=isstackper(orig,targ);
        System.out.println("bb:"+result);

    }
    
}
