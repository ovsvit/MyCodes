import java.util.*;

public class toi1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt(); // Number of disks
        if (n % 2 == 0)
            towerOfHanoi(n, 'A', 'C', 'B');
        else
            towerOfHanoi1(n, 'A', 'C', 'B');
    }

    public static void towerOfHanoi1(int n, char source, char destination, char auxiliary) {
        if (n == 1) 
        {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        towerOfHanoi1(n - 1, source, auxiliary, destination);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        towerOfHanoi1(n - 1, auxiliary, destination, source);
    }

    public static void towerOfHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) 
        {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        towerOfHanoi(n - 1, source, auxiliary, destination);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        towerOfHanoi(n - 1, auxiliary, destination, source);
    }
}
