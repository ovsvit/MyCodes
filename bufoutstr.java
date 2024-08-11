import java.util.*;
import java.io.*;
public class bufoutstr {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        try{
            FileOutputStream fout=new FileOutputStream("test2.txt");
            BufferedOutputStream bout=new BufferedOutputStream(fout);
            String str="Love is Peace";
            byte[] b=str.getBytes();
            bout.write(b);
            bout.flush();
            bout.close();
            fout.flush();
            fout.close();

        }catch(Exception e){
            System.out.print(e);
        }

    }
    
}
