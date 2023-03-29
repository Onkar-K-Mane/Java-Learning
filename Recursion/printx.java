package Recursion;

public class printx {

    public static int PrintX(int x, int n) {

        if (n == 0) {
            return 1;
        }

        int a = PrintX(x, n - 1);
        int b = a * x;
        return b;

    }

    public static void main(String args[]) {
        int n = 5;
        int x = 2;
        System.out.println(PrintX(x, n));

    }

}
