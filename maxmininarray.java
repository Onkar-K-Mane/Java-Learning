import java.util.*;

public class maxmininarray {
    public static void main(String args[]) {
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 7, 8, 5, 4, 6, 0, 14, 2, 3, 5, 5 };

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 20; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }

        }
        System.out.println(min);
        System.out.print(max);

    }

}
