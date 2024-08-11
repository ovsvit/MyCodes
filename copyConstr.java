public class copyConstr {
    String name,n,id;
    int age,a;
    copyConstr(String name,int age){
        this.name=name;
        this.age=age;
    }
    copyConstr(copyConstr C,String id){
        n= C.name;
        a=C.age;
        this.id=id;
        System.out.println("Name: "+n+"\nAge: "+a+"\nid: "+id+"\n");
    }
    public static void main(String[] args){
        System.out.println("\nName:Jumana Begum M\nReg no:21BIT0694\n");
        copyConstr C1=new copyConstr("Jumana",20); 
        copyConstr C2=new copyConstr(C1,"21BIT0694");   
    }
    
}
