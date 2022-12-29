import java.util.Scanner;

public class insertion {

    static void insertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int x = arr[i];
            while (j > -1 && arr[j] > x) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = x;
        }

    }

    static void display(int[] arr, int n) {
        System.out.println("array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the array size :");
        int n = s.nextInt();
        System.out.println("Enter the array element :");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        insertionSort(arr, n);
        display(arr, n);
    }

}
