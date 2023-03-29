import java.util.*;

public class stringreplace {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String result = "";

        for (int i = 0; i < input.length(); i++) {

            char check = input.charAt(i);

            if (check == 'e') {
                result += 'i';
            } else {
                result += input.charAt(i);
            }
        }
        System.out.print(result);

    }

}
