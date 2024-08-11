
import java.io.FileOutputStream;
public class filoutstream {
    public static void main(String[] args){
        System.out.println("***********File Output stream**********\nName:Jumana Begum M\nReg no:21BIT0694\n");
        try{
            FileOutputStream fout=new FileOutputStream("test0.txt");
            fout.write('A');
            fout.flush();
            fout.close();
        }catch(Exception e){
             System.out.print(e);
        } 


    }
    
}
