public class method1 {
    String n,i;
    int a;
    void display(String name,int age,String id){
        n=name;
        a=age;
        i=id;
        System.out.println("Name: "+n+"\nAge: "+a+"\nId: "+i);
    }
    public static void main(String[] args){
        method1 m1=new method1();
        m1.display("Jumana",20,"21BIT0694");
             
    }
    
}
