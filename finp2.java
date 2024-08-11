import java.io.FileInputStream;
public class finp2{
    public static void main(String[] args){
        System.out.println("***********File input stream (read sentences)**********\nName:Jumana Begum M\nReg no:21BIT0694\n");
        try{
            FileInputStream fin = new FileInputStream("test1.txt");
            int i=0;
            while((i=(fin.read()))!=-1){
                System.out.print((char)i);
            }
            //int i=fin.read();
            //System.out.print((char)i);
            fin.close();

        }catch(Exception e){
            System.out.print(e);
        }

    }
}
