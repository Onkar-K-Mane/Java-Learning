import java.util.*;

public class ascendArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i]);

        }

        boolean isAscend = true;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                isAscend = false;
            }
        }

        if (isAscend) {
            System.out.print("The numbers are in ascending order");
        } else {
            System.out.print("The numbers are not in ascending order");
        }

    }
}
