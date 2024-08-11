
import java.util.*;
public class valisIp {
    public static Boolean isValid(String ip){
        String[] valport=ip.split(":");
        if(valport.length==2){
            /*for(int i=0;i<2;i++){
                System.out.print(valport[i]+" ");
            }*/
            String ipadd=valport[0];
            String[] values=ipadd.split("\\.");
            /*for(int i=0;i<4;i++){
                System.out.print(values[i]+" ");
            }*/
            //System.out.println(values.length);
            if(values.length==4){
                for(int i=0;i<4;i++){
                    //System.out.print("Inside for loop");
                    if(Integer.parseInt(values[i])<0 || Integer.parseInt(values[i])>255){
                        return false;

                    }
                }
                int port=Integer.parseInt(valport[1]);
                if(port<0 || port>65535)
                   return false;
                return true;

            }
            else{
                System.out.print("Inside length 4");
                return false;
            }
               

        }
        else{
            System.out.print("Inside length 2");
            return false;

        }
        

    } 
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        String ip=inp.nextLine();
        System.out.print(isValid(ip));

    }
    
}
