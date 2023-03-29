import java.util.*;

public class stringUserName {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String email = sc.next();
        String userName = "";

        for (int i = 0; i < email.length(); i++) {

            if (email.charAt(i) == '@') {
                System.out.print(userName);
            } else {
                userName += email.charAt(i);
            }
        }

    }

}
