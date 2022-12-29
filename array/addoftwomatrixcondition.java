import java.util.Scanner;

public class addoftwomatrixcondition {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the size of 1st array : ");
        int n1 = s.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the element of 1st array :");
        for (int i = 0; i < n1; i++) {
            arr1[i] = s.nextInt();
        }

        System.out.println("Enter the size of second array : ");
        int n2 = s.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the element of second matrix : ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = s.nextInt();
        }

        int[] ans = new int[n1 + n2];
        int k = 0;
        if (n1 > n2) {
            for (int i = 0; i < n1; i++) {
                ans[k] = arr1[i];
                k++;
                if (i < n2) {
                    ans[k] = arr2[i];
                    k++;
                }
            }
        } else {
            for (int i = 0; i < n2; i++) {
                if (i < n1) {
                    ans[k] = arr1[i];
                    k++;
                }
                ans[k] = arr2[i];
                k++;
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}
