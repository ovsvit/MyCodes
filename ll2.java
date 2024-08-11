import java.util.*;
public class ll2 {
    static class Node{
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    Node head;
    //Stack<Integer> st=new Stack<>();
    void push(int data,Stack st){
        //System.out.print(head);
        Node current=head;
        if(head==null)
        {
            Node newNode=new Node(data);
            head=newNode;
        }
        else{
            Node newNode=new Node(data);
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;

        }
        st.push(data);

       /* Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        System.out.println("head dta: "+head.data);*/ 
    }
    void printll(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
    }
    public static void main(String[] args){
        Stack<Integer> st=new Stack<>();
        Scanner inp=new Scanner(System.in);
         ll2 ll=new ll2();
         int n=inp.nextInt();
         int ele;
         for(int i=0;i<n;i++)
            {
                ele=inp.nextInt();
                ll.push(ele,st);
            }
         //ll.push(10);
         ll.printll();
         int dele;
         while(!st.empty()){
            dele=st.pop();
            System.out.print(dele+" ");

         }
    }    
}
