import java.io.DataInputStream;
import java.io.FileInputStream;

public class da5_inpstr{
    public static void main(String[] args){
        System.out.println("***********Data Input Stream**********\nName:Jumana Begum M\nReg no:21BIT0694\n");

        try{
            FileInputStream fin = new FileInputStream("test5.txt");  
            DataInputStream din = new DataInputStream(fin);  
            int count = din.available();  
            byte[] b = new byte[count];  
            din.read(b);  
            for (byte k : b) {  
            System.out.print((char)k);  
            }  
            fin.close();
            din.close();
        }catch(Exception e){
            System.out.print(e);
        }   
    } 
}