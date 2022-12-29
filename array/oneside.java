import java.util.Scanner;

public class oneside {
    public static void main(String[] args) {
        System.out.println("enter the array size :");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array elements in 0 and 1 :");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int[] ans = new int[n];
        int l = 0, h = n - 1;
        int k = 0, m = 0;
        while (l <= h) {
            if (arr[k] == 0) {
                ans[l] = arr[k];
                // m++;
                k++;
                l++;

            } else {
                ans[h] = arr[k];
                k++;
                h--;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
