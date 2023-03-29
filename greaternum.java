import java.util.Scanner;

public class greaternum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.print(greater(a, b));

    }

    public static int greater(int a, int b) {
        if (a < b) {
            return b;
        } else if (a > b) {
            return a;
        } else {
            return a = b;
        }
    }
}
