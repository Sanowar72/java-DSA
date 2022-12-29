import java.util.Arrays;
import java.util.Scanner;

public class removeduplicateitem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the array size :");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array element  :");
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        Arrays.sort(arr);
        int k = 1;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[k++] = arr[i + 1];
            }
        }
        for (int i = 0; i < k; i++)
            System.out.print(arr[i] + " ");
    }
}
