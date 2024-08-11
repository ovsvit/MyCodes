import java.io.*;    
class serial{    
 public static void main(String args[]){    
    System.out.println("***********Serialization**********\nName:Jumana Begum M\nReg no:21BIT0694\n");
    try{    
            students s1 =new students(694,"Jumana");    
            FileOutputStream fout=new FileOutputStream("test8.txt");    
            ObjectOutputStream out=new ObjectOutputStream(fout);    
            out.writeObject(s1);    
            out.flush();       
            out.close();    
            System.out.println("success!!!");    
    }catch(Exception e){
    System.out.println(e);
   }    
 }    
}    