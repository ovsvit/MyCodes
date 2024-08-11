import java.util.*;
public class treeprac{
static Node root;
static class Node{
    int data;
    Node left,right;
    Node(int data){
    this.data = data;
    this.left = null;
    this.right = null;
}
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String values[] = s.split(" ");
    root = buildTree(values);
    print(root);
}
public static Node buildTree(String[] s){
    if(s[0].equals(null) || s.length == 0){
    return null;
    }
    Node root = new Node(Integer.parseInt(s[0]));
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    int i = 1;
    while(!q.isEmpty() && i < s.length){
        Node curr = q.poll();
        String a = s[i];
        if(!a.equals("N")){
        curr.left = new Node(Integer.parseInt(a));
        q.add(curr.left);
        }
        i++;
        if(i >= s.length){
        break;
        }
        a = s[i];
        if(!a.equals("N")){
        curr.right = new Node(Integer.parseInt(a));
        q.add(curr.right);
        }
        i++;
    }
    return root;
}
public static void print(Node root){
    if(root != null){
    print(root.left);
    System.out.print(root.data + " ");
    print(root.right);
}
}
}