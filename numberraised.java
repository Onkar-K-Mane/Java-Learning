import java.util.Scanner;

public class numberraised {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.print(power(a, b));
    }

    public static int power(int a, int b) {
        int product = 1;
        for (int i = 1; i <= b; i++) {

            product *= a;
        }
        return product;
    }
}
