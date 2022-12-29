import java.util.*;

public class mergeTwoSorted {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the 1st array size :");
        int n = s.nextInt();
        int[] arr1 = new int[n];
        System.out.println("enter the array element in sorted order :");
        for (int i = 0; i < n; i++)
            arr1[i] = s.nextInt();
        System.out.println("enter the 2nd array size :");
        int m = s.nextInt();
        int[] arr2 = new int[m];
        System.out.println("enter the array element in sorted order :");
        for (int i = 0; i < m; i++)
            arr2[i] = s.nextInt();

        int[] ans = new int[m + n];
        int k = 0;
        int x = 0, y = 0;
        while (x < n && y < m) {
            if (arr1[x] < arr2[y]) {
                ans[k++] = arr1[x++];
            } else {
                ans[k++] = arr2[y++];
            }
        }
        while (x < n) {
            ans[k++] = arr1[x++];
        }
        while (y < m) {
            ans[k++] = arr2[y++];
        }
        for (int j : ans)
            System.out.print(j + " ");
    }
}
