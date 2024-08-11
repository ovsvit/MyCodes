class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class palList {
    Node head=null;
    public int getSize(palList list){
        int size=0;
        Node temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }

        return size;
    }
    public Boolean isPal(palList list){
        int size=getSize(list);
        System.out.print("size"+size);
        Node start=head;
        for(int i=0;i<size/2;i++){
            Node temp=head;
            int j=0;
            while(j<size-i-1){
                temp=temp.next;
                j++;
            }
            if(start.data==temp.data)
               start=start.next;
            else
              return false;

        }
        return true;
    }
    
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
            System.out.print(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args){
        palList ll=new palList();
        ll.push(1);
        ll.push(2);
      //  ll.push(3);
        ll.push(2);
        ll.push(1);
        ll.display();
        System.out.print(ll.isPal(ll));
        
    }
    
}
