import java.util.*;

public class spiral {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int matrix[][] = new int[m][n];

        int rowst = 0, rowend = n - 1, colst = 0, colend = m - 1;

        // ask for matrix inputs
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }

        }

        // print the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }

        while (rowst <= rowend && colst <= colend) {

            for (int i = colst; i <= colend; i++) {
                System.out.print(matrix[rowst][i] + ", ");

            }

            rowst++;

            for (int i = rowst; i <= rowend; i++) {
                System.out.print(matrix[i][colend] + ", ");

            }
            colend--;

            for (int i = colend; i >= colst; i--) {
                System.out.print(matrix[rowend][i] + ", ");

            }
            rowend--;
            for (int i = rowend; i >= rowst; i--) {
                System.out.print(matrix[i][colst] + ", ");

            }
            colst++;

        }

    }
}
