import java.util.Scanner;

public class digithighest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the array size :");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array elemnets :");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int max = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count > max) {
                max = count;
                ans = arr[i];
            }
        }
        System.out.println("max freq no is : " + ans);
    }
}
