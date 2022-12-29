import java.util.Scanner;

public class evenfactorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the no :");
        int n = s.nextInt();
        int a = 0;
        int b = 1;
        int count = 0;
        if (n > 0)
            System.out.print(a + " ");
        if (n > 1) {
            System.out.print(b + " ");
            count++;
        }
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            if (c % 2 != 0) {
                count++;
            }
            a = b;
            b = c;
        }
        System.out.println("\n" + count);
    }
}
