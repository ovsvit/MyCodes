public class excep4 {
    public static void main(String[] args){
        System.out.println("\nName:Jumana Begum M\nReg no:21BIT0694\n");

        try{
            try{
                try{
                    int[] a = {1, 2, 3, 4, 5};
                    System.out.println(a[6]);
                } catch(ArithmeticException e){
                    System.out.println(e);
                } 
            } catch(ArrayIndexOutOfBoundsException e1){
                System.out.println(e1);
            } finally {
                System.out.println("This is the exit.");
            }
        } catch(Exception e2){
            System.out.println(e2);
        }
        System.out.println("Normal flow");
    }
}

