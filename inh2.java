interface checks{
    void disp();
}
public class inh2 implements checks{
    @Override
    public void disp(){
        System.out.println("Display");
    }
    public void d1(){
        System.out.println("D1");
    }
    public static void main(String[] args){
        inh2 i=new inh2();
        i.disp();
        i.d1();

    } 
    
}
