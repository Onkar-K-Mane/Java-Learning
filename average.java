import java.util.*;

class main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println(average(a, b, c));
    }

    public static int average(int a, int b, int c) {
        return (a + b + c) / 3;

    }

}