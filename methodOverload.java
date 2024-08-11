public class methodOverload {
    void display(){
        System.out.print("Method without parameter");
    }
    void display(String name,int age,String dept)
    {
        String n=name;
        int a=age;
        String d=dept;
        System.out.print("\n\nName: "+name+"\nAge: "+age+"\nDepartment: "+dept);
    }
    public static void main(String[] args){
        System.out.println("Name:Jumana Begum M\nReg no:21BIT0694\n");
        methodOverload M1=new methodOverload();
        methodOverload M2=new methodOverload();
        M1.display();
        M2.display("Jumana",20,"IT");
    }
}
