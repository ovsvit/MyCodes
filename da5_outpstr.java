import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class da5_outpstr {
    public static void main(String[] args){
        System.out.println("***********Data Output Stream**********\nName:Jumana Begum M\nReg no:21BIT0694\n");

        try{
            FileOutputStream fout =new FileOutputStream("test6.txt");
            DataOutputStream dout =new DataOutputStream(fout);
            String str="I am Jumana Begum-21Bit0694";
            byte[] b=str.getBytes();
            dout.write(b);
            dout.flush();
            dout.close();
            fout.close();

        }catch(Exception e){
            System.out.print(e);
        }
    }
    
}
