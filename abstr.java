abstract class shape{
    abstract double getarea();
}
class rect extends shape{
    double length,breadth;
    rect(double l,double b){
         length=l;
         breadth=b;
    }
    public double getarea(){
        return length*breadth;
    }
}
public class abstr{
    public static void main(String[] args){
        rect r=new rect(2,5);
        System.out.print(r.getarea());
    }
}