import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class mergeToSortList {
    Node head=null;

    void push(int ele){       
        Node nw=new Node(ele);
        if(head==null){
            head=nw;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=nw;
        }
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static mergeToSortList mergeList(mergeToSortList l1,mergeToSortList l2,mergeToSortList l){
        
        //Node headr=null;
        Node temp1=l1.head;
        Node temp2=l2.head;
        while(temp1!=null && temp2!=null){
            if(temp1.data<=temp2.data){
                l.push(temp1.data);
                temp1=temp1.next;
            } 
            else{
                l.push(temp2.data);
                temp2=temp2.next;
            }      
        }
        while(temp1!=null){
            l.push(temp1.data);
            temp1=temp1.next;
        }
        while(temp2!=null){
            l.push(temp2.data);
            temp2=temp2.next;
        }
        return l;
    }
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        mergeToSortList ll1=new mergeToSortList();
        mergeToSortList ll2=new mergeToSortList();
        mergeToSortList l=new mergeToSortList();
        ll1.push(1);
        ll1.push(3);
        ll1.push(4);
        ll2.push(2);
        ll2.push(4);
        ll1.display();
        ll2.display();
        System.out.println();
        mergeToSortList ll=mergeList(ll1,ll2,l);
        ll.display();




    }
    
}
