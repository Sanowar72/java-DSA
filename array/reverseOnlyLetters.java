import java.util.Scanner;

public class reverseOnlyLetters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string with - ");
        String str = sc.nextLine();

        int n = str.length();

        int[] ind = new int[n];

        int j = 0;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                ind[j] = i;
                j++;
            }
        }

        int low = 0;
        int high = j - 1;

        char[] arr = str.toCharArray();

        while (low < high) {

            int ind1 = ind[low];
            int ind2 = ind[high];

            char temp = arr[ind1];
            arr[ind1] = arr[ind2];
            arr[ind2] = temp;

            low++;
            high--;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}
