import java.util.Scanner;

public class searchInsert {
    static int search(int[] arr, int key, int n) {
        for (int i = 0; i < n; i++) {
            if (key == arr[i])
                return i;
        }
        int j = n - 1;
        while (j > -1 && key < arr[j]) {
            j--;
        }
        return j + 1;
        // return -1;
    }

    static int searchPos(int[] arr, int key, int n) {
        int j = n - 1;
        while (j > -1 && key < arr[j]) {
            j--;
        }
        return j + 1;
    }

    public static void main(String[] args) {
        System.out.println("Enter the array size :");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array elements in sorted position :");
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        System.out.println("enter the element :");
        int key = s.nextInt();
        int val = search(arr, key, n);
        if (val > -1) {
            System.out.println(val);
        }
        // else {
        // System.out.println(searchPos(arr, key, n));
        // }
    }
}
