import java.util.*;

public class array {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String[] names = new String[number];

        for (int i = 0; i < number; i++) {
            names[i] = sc.nextLine();
        }

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]);
        }
    }
}
