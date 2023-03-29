import java.util.*;

public class sumofodd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(oddsum(n));
    }

    public static int oddsum(int n) {
        if (n % 2 == 0) {
            int sum = (n / 2) * (n / 2);
            return sum;

        } else {
            int b = ((n - 1) / 2) + 1;
            // int a = n / 2;
            int sum = (b * (1 + n)) / 2;
            return sum;

        }

    }

}
