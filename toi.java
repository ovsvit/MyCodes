import java.util.*;
import java.lang.*;
public class toi{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n =inp.nextInt(); // Number of disks
        towerOfHanoi(n, 'A', 'C', 'B');
        double mov=(Math.pow(2,n))-1;
        System.out.println("No of required: "+(int)mov);
    }
    public static void towerOfHanoi(int n, char source, char destination, char auxiliary) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        towerOfHanoi(n - 1, source, auxiliary, destination);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        towerOfHanoi(n - 1, auxiliary, destination, source);
    }
}
