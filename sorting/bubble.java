
import java.util.Scanner;

public class bubble {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = s.nextInt();
        int i;
        int[] arr = new int[n];
        System.out.println("Enter the array element");
        for (i = 0; i < n; i++) {
            arr[i] = s.nextInt();

        }
        for (i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array is : ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
