import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class mergeK {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        ArrayList<LinkedList<Integer>> arr=new ArrayList<>();
        int k=inp.nextInt();
        for(int i=0;i<k;i++){
            LinkedList ll=new LinkedList();
            System.out.print("Enter no.of elements in the "+i+"th linked list:");
            int n=inp.nextInt();
            for(int j=0;j<n;j++){
                int ele=inp.nextInt();
                ll.add(ele);
            }
            arr.add(ll);
        }/* for(int i=0;i<k;i++){
            System.out.print(arr.get(i)+" ");
        } */

        TreeSet<Integer> treeset=new TreeSet();
        for(int i=0;i<k;i++){
            LinkedList<Integer> l=arr.get(i);
            for(int j=0;j<l.size();j++){
                System.out.print(l.get(j)+" ");
                treeset.add(l.get(j));
            }
        }
        for(Integer ele:treeset){
            System.out.print(ele+" ");
        }
    }
    
}
