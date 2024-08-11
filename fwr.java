import java.io.FileWriter;
import java.util.*;
public class fwr {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.println("***********File Writer**********\nName:Jumana Begum M\nReg no:21BIT0694\n");
        try{
            System.out.print("Enter the string: ");
            String str=inp.nextLine();
            FileWriter fw=new FileWriter("test4.txt");
            fw.write(str);
            fw.flush();
            fw.close();
        }catch(Exception e){
             System.out.print(e);
        }

    }
    
}
