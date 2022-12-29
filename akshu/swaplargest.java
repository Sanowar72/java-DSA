// package akshu;

// import java.util.Scanner;
import java.util.*;

// package akshu;

public class swaplargest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        int[] ans = new int[n];
        ans[0] = arr[index];
        for (int i = 1; i <= index; i++) {
            ans[i] = arr[i - 1];
        }
        for (int i = index + 1; i < n; i++) {
            ans[i] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}
