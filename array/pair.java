import java.util.Arrays;
import java.util.Scanner;

public class pair {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i = i + 2) {
            if (i + 1 < n) {
                if (arr[i] != arr[i + 1]) {
                    System.out.println(false);
                    return;
                }
            }
        }
        System.out.println(true);
    }
}
