import java.util.Scanner;

public class vote {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.print(eligiblity(age));
    }

    public static Boolean eligiblity(int age) {
        if (age < 18) {
            return false;
        } else {
            return true;
        }

    }

}
