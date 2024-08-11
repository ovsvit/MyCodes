class emp{
    double salary=5000;
    void print(){
        System.out.print("salary: "+salary);
    }
}
class inherit extends emp {
    int amt=100;
    public static void main(String[] args){
        inherit in=new inherit();
        System.out.print(in.salary);
        System.out.print("amount="+in.amt);
        in.print();
    }    
}
