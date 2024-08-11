public class constrOverload {
    constrOverload(){
        System.out.println("Default Construtor.");
    }
    constrOverload(String name,int age){
        System.out.println("\nTwo parameterized Construtor.");
        System.out.println("Name: "+name+"\nAge: "+age);
    }
    constrOverload(int marks,double percent,double cgpa){
        System.out.println("\nThree parameterized Construtor.");
        System.out.println("Mark: "+marks+"\nPercentage: "+percent+"\nCGPA: "+cgpa);
    }

    public static void main(String[] args){
        System.out.println("\nName:Jumana Begum M\nReg no:21BIT0694\n");
        constrOverload C1=new constrOverload(); 
        constrOverload C2=new constrOverload("Jumana",20); 
        constrOverload C3=new constrOverload(480,96,9.6);   
    }
    
}
