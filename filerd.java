import java.io.FileReader;
public class filerd {
    public static void main(String[] args){
        System.out.println("***********File Reader**********\nName:Jumana Begum M\nReg no:21BIT0694\n");
        try{
            FileReader fr=new FileReader("test4.txt");
            int i;
            while((i=fr.read())!=-1){
                System.out.print((char)i);
 
            }
            fr.close();
        }catch(Exception e){
             System.out.print(e);
        }
    }
    
}


