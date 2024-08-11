import java.util.*;
import java.io.*;
public class budinpstr {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        try{
            FileInputStream fin = new FileInputStream("test2.txt");
            BufferedInputStream bin=new BufferedInputStream(fin);
            int i=0;
            while((i=bin.read())!=-1){
                System.out.print((char)i);
            }
            bin.close();
        }catch(Exception e){
            System.out.print(e);
        }

    }
    
}
