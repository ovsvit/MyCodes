import java.util.*;
import java.lang.*;
public class tree {
    Node root;
    class Node{
        String data;
        Node next;
        Node prev;
        Node(String data){
            this.data=data;
            next=prev=null;

        }
    }
    public void insert(String[] nodes){
        root =new Node(nodes[0]);
        int n=nodes.length;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int i=1;
        while(i<n && !q.isEmpty()){
            Node curr=q.poll();
        }




    }
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        String n=inp.nextLine();
        String nodes[]=n.split(" ");
        //for(String element : arr)
        //System.out.println(element);
        tree bt = new tree();
        bt.insert(nodes);


    }
    
}
