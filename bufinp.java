import java.io.BufferedInputStream;
import java.io.FileInputStream;
public class bufinp{
    public static void main(String[] args){
        System.out.println("***********Buffered input stream (read sentences)**********\nName:Jumana Begum M\nReg no:21BIT0694\n");
        try{
            FileInputStream fin = new FileInputStream("test3.txt");
            BufferedInputStream bin=new BufferedInputStream(fin);
            int i=0;
            while((i=(bin.read()))!=-1){
                System.out.print((char)i);
            }
            bin.close();

        }catch(Exception e){
            System.out.print(e);
        }

    }
}
