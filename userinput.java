import java.util.Scanner;

public class userinput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int countzero = 0, countpositive = 0, countnegative = 0;
        char choice;

        do {
            System.out.print("Enter a number: ");

            int n = sc.nextInt();
            if (n == 0) {
                countzero++;
            } else if (n > 0) {
                countpositive++;
            } else {
                countnegative++;
            }

            System.out.println("Do you wish to countinue? (y/n)");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y'

        );
        System.out.println("number of zeroes : " + countzero);
        System.out.println("nummber of positive numbers : " + countpositive);
        System.out.println("number of negative numbers: " + countnegative);

    }

}
