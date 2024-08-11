import java.io.FileOutputStream;
public class fouts {
    public static void main(String[] args){
        try{
            FileOutputStream fout=new FileOutputStream("test1.txt");
            String str="Jumana Begum";
            byte[] b=str.getBytes();
            fout.write(b);
            fout.flush();
            fout.close();

        }catch(Exception e){
            System.out.print(e);
        }

    }
}
