import java.util.*;//arrays sort
public class arr{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=inp.nextInt();

        }
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
        Arrays.sort(arr);
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("Minimum stack : "+arr[0]);
    }
}
