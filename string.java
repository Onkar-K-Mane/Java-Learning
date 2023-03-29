import java.util.*;

public class string {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String arr[] = new String[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.next();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        int totalLength = 0;

        for (int i = 0; i < size; i++) {
            totalLength += arr[i].length();

        }
        System.out.println("The total length of the string is : " + totalLength);
    }

}
