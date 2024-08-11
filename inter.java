interface bank{
    void deposit();
}
class SBI implements bank{
    public void deposit(){
        System.out.print("SBI");
    }
}
class RBI implements bank{
    public void deposit(){
        System.out.print("RBI");
    }
}
public class inter {
    public static void main(String[] args){
        bank s=new SBI();
        bank r=new RBI();
        s.deposit();
        r.deposit();
    }
    
}
