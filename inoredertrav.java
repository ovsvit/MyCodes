import java.util.*;
class Node4{
    int data;
    Node4 left,right;
    Node4(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

public class inoredertrav {
    static Node4 root;
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        String str=inp.nextLine();
        String values[]=str.split(" ");
        root=buildTree(values);
        print(root);
        //System.out.print(values.length); 
    }
    public static Node4 buildTree(String[] s){
        if(s[0].equals(null) && s.length<=0)
          return null;

        Queue<Node4> q=new LinkedList<>();

        Node4 root=new Node4(Integer.parseInt(s[0]));
        q.add(root);
        int i=1;
        while(!q.isEmpty() && i<s.length){
            Node4 curr=q.poll();
            String a=s[i];
            if(!a.equals("N")){
                curr.left=new Node4(Integer.parseInt(a));
                q.add(curr.left);
            }
            i++;
            if(i>=s.length){
                break;
            }

            a=s[i];
            if(!a.equals("N")){
                curr.right=new Node4(Integer.parseInt(a));
                q.add(curr.right);
            }
            i++;
        }

        return root;

    }
    public static void print(Node4 root){
        if(root!=null){
            print(root.left);
            System.out.print(root.data+" ");
            print(root.right);

        }

    }
    
}
