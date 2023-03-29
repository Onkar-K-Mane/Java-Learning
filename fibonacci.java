import java.util.*;

public class fibonacci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        finb(n);

    }

    public static void finb(int n) {
        int firstnum = 0;
        int nextnum;
        int secondnum = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(firstnum + ",");
            nextnum = firstnum + secondnum;
            firstnum = secondnum;
            secondnum = nextnum;
        }

    }
}
