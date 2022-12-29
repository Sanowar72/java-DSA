import java.util.Scanner;

// package akshu;

public class array {

    static int search(int[] arr, int key, int n) {
        for (int i = 0; i < n; i++) {
            if (key == arr[i])
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int key = s.nextInt();
        int index = search(arr, key, n);
        // System.out.println(index);
        if (index < 0) {
            System.out.println("invalid key :");
            return;
        }
        for (int i = index; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        n--;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
