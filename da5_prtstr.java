import java.io.FileOutputStream;  
import java.io.PrintStream; 
public class da5_prtstr {
    public static void main(String[] args){
        System.out.println("***********Print Stream**********\nName:Jumana Begum M\nReg no:21BIT0694\n");
        try{
            FileOutputStream fout=new FileOutputStream("test7.txt ");    
            PrintStream pout=new PrintStream(fout);    
            pout.println(2003);    
            pout.println("Jumana Begum-21BIT0694");    
            pout.println("java DA-5");    
            pout.close();    
            fout.close();    
           System.out.println("Success!!!");   
        }catch(Exception e){
            System.out.print(e);
        }
    }
    
}
