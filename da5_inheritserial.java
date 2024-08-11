import java.io.*;    
class Person implements Serializable{    
    int id;    
    String name;    
    Person(int id, String name) {    
    this.id = id;    
    this.name = name;    
    }    
}    
class Stu extends Person{    
    String course;    
    int fee;    
    public Stu(int id, String name, String course, int fee) 
    {    
        super(id,name);    
        this.course=course;    
        this.fee=fee;    
    }    
}    
public class da5_inheritserial 
{    
 public static void main(String args[])  
 {    
        System.out.println("***********Inheritance**********\nName:Jumana Begum M\nReg no:21BIT0694\n");

    try{    
        Stu s1 =new Stu(694,"Jumana Begum","IT",50000);        
        FileOutputStream fout=new FileOutputStream("test9.txt");    
        ObjectOutputStream out=new ObjectOutputStream(fout);    
        out.writeObject(s1);    
        out.flush();       
        out.close();    
        System.out.println("Output stream executed!");    
    }catch(Exception e){System.out.println(e);}    
    try{    
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("test9.txt"));    
        Stu s=(Stu)in.readObject();    
        System.out.println("id="+s.id+"\nName= "+s.name+"\nCourse= "+s.course+"\nfee= "+s.fee);    
        in.close();    
    }catch(Exception e){System.out.println(e);}    
 }    
}  