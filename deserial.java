import java.io.*;  
class deserial{  
 public static void main(String args[]){  
    System.out.println("***********Deserialization**********\nName:Jumana Begum M\nReg no:21BIT0694\n");

    try{  
    ObjectInputStream in=new ObjectInputStream(new FileInputStream("test8.txt"));  
    students s=(students)in.readObject();  
    System.out.println(s.id+" "+s.name);  
    in.close();  
    }catch(Exception e){
        System.out.println(e);
    }  
 }  
}  