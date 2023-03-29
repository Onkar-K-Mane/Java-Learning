package Recursion;

public class stringreverse {
    public static void Reverse(String str, int idx) {
        char current = str.charAt(idx);

        if (idx == 0) {
            System.out.print(current);
            return;
        }

        System.out.print(current);
        Reverse(str, idx - 1);

    }

    public static void main(String args[]) {
        String str = "ABCD";
        int idx = str.length() - 1;
        Reverse(str, idx);

    }

}
