package Recursion;

public class fibannoci {
    public static void Fib(int a, int b, int n) {

        if (n == 0) {
            return;
        }

        System.out.println(a);

        Fib(b, a + b, n - 1);

    }

    public static void main(String args[]) {

        Fib(1, 1, 5);

    }

}
