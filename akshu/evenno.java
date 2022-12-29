import java.util.Scanner;

public class evenno {
    // static int even(int n) {
    // int count = 0;
    // if (n % 2 == 0)
    // count++;
    // return count;
    // }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int first = s.nextInt();
        int second = s.nextInt();
        int count = 0;
        for (int i = first; i <= second; i++) {
            if (i % 2 == 0)
                count++;
        }
        System.out.println(count);
    }
}
