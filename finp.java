import java.io.FileInputStream;
public class finp{
    public static void main(String[] args){
        System.out.println("***********File input stream**********\nName:Jumana Begum M\nReg no:21BIT0694\n");
        try{
            FileInputStream fin = new FileInputStream("test.txt");
            int i=fin.read();
            System.out.print(i);
            fin.close();

        }catch(Exception e){
            System.out.print(e);
        }

    }
}