import java.io.*;
import java.util.*;
public class bufout{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.println("***********Buffered output stream (write sentences)**********\nName:Jumana Begum M\nReg no:21BIT0694\n");
        try{
            FileOutputStream fout = new FileOutputStream("test2.txt");
            BufferedOutputStream bout=new BufferedOutputStream(fout);
            //String S="This is buffered output stream program.";
            System.out.print("Enter the sting: ");
            String S=inp.nextLine();
            byte[] b=S.getBytes();
            bout.write(b);
            bout.flush();
            bout.close();
            fout.close();
        }catch(Exception e){
            System.out.print(e);
        }

    }
}

