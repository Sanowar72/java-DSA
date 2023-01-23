import java.util.Scanner;

public class MDtoMD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter row and column");
        int m = s.nextInt();
        int n = s.nextInt();
        int[][] arr = new int[m][n];
        int[] newar = new int[m * n];
        int k = 0;
        System.out.println("enter array values");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.nextInt();
                newar[k++] = arr[i][j];
            }
        }
        System.out.println("enter modify");
        int r = s.nextInt();
        int c = s.nextInt();
        int a = 0;
        int[][] ansar = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ansar[i][j] = newar[a++];
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(ansar[i][j] + " ");
            }
            System.out.println();
        }
    }
}
