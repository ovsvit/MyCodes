class c1{
    static int count=0;
}
class c2 extends c1{
    public void display(){
        System.out.print(count++);
    }
}
class c3 extends c1{
    public void display(){
        System.out.print(count++);
    }
}
public class stat {
    public static void main(String[] args){
        c2 x=new c2();
        c3 y=new c3();
        x.display();
        y.display();
    }
}
