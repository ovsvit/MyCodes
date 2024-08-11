public class constr{
    String nname;
    int n;
    constr(){
        System.out.print("\nJumana");
    }
    constr(String name,int num){
        System.out.print("\n"+name+" "+num);
    }
    constr(int n,String nname){
        this.n=n;
        System.out.print("\n"+n+" "+nname);
    }
    constr(constr c0,String name){
        this.nname=name;
        //this.n=c0.n;
        System.out.print("\n"+nname+" "+c0.n);

    }
    public static void main(String[] args) {
        constr c=new constr();//Default constr
        constr c1=new constr("JumanaBegum",7);
        constr c2=new constr(10,"Pearl");
        constr c3=new constr(c2,"Begum");
        
    }
}