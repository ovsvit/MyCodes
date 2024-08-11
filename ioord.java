import java.util.*;
class Node5{
    int data;
    Node5 left,right;
    Node5(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }

}

public class ioord{
    static Node5 root;
    static int maxLevel=-1;
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        String st=inp.nextLine();
        String[] values=st.split(" ");
        root=buildTree(values);
        leftView(root,0);
        ArrayList<Integer> ans=new ArrayList<>();
        rightView(root,0,ans);
        for(int i : ans){
            System.out.print(i+" ");
        }

    }
    public static void print(Node5 root){
        if(root!=null){
            print(root.left);
            System.out.print(root.data+" ");
            print(root.right);
        }
        
    }
    public static Node5 buildTree(String[] s){
        if(s[0].equals(null) && s.length<=0)
             return null;
        
        Queue<Node5> q=new LinkedList<>();
        Node5 root=new Node5(Integer.parseInt(s[0]));
        q.add(root);
        int i=1;
        String a;
        while(i<s.length && !q.isEmpty()){
            Node5 curr=q.poll();
            a=s[i];
            if(!a.equals("N")){
                 curr.left=new Node5(Integer.parseInt(a));
                 q.add(curr.left);
            }
            i++;
            if(i>=s.length)
              break;

            a=s[i];
            if(!a.equals("N")){
                curr.right=new Node5(Integer.parseInt(a));
                q.add(curr.right);
            }
            i++;

        }
        return root;


    }
    public static void leftView(Node5 root,int level){
        if(root == null){
           return;
        }
        if(maxLevel < level){
            System.out.print(root.data + " ");
            maxLevel = level;
        }
        leftView(root.left,level + 1);
        leftView(root.right,level + 1);
    }

    public static void leftView1(Node5 root,int level){
        if(root==null)
           return;

        if(maxLevel<level){
            System.out.print(root.data+" ");
            maxLevel=level;
        }
        leftView1(root.left,level+1);
        leftView1(root.right,level+1);
    }      
    public static void rightView(Node5 root,int level,ArrayList<Integer> ans){
        if(root==null)
           return ;
        if(level==ans.size()){
            ans.add(root.data);
        }
        rightView(root.right,level+1,ans);
        rightView(root.left,level+1,ans);

    } 
}