import java.util.Scanner;

public class insertAtPosition {

    // static void insertAtPosition(int[] arr, int n, int pos, int num) {

    // for (int i = n - 2; i >= pos - 1; i--) {
    // arr[i + 1] = arr[i];
    // }
    // arr[pos - 1] = num;
    // n++;
    // }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[100];
        System.out.println("Enter how many elements u wanna insert :");
        int n = s.nextInt();
        System.out.println("enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter the no u wanna insert");
        int num = s.nextInt();
        System.out.println("enter the position u wanna insert:");
        int pos = s.nextInt();
        for (int i = n - 1; i >= pos - 1; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos - 1] = num;
        n++;
        // insertAtPosition(arr, n, pos, num);
        System.out.println("array after inserting elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
