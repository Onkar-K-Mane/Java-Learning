import java.util.Scanner;

class circle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.print(circumference(r));
    }

    public static int circumference(int r) {
        return (2 * 22 * r) / 7;
    }
}
