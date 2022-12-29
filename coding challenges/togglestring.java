import java.util.Scanner;

public class togglestring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // String str = "zopsmarthiring";
        // System.out.println("enter no :");
        System.out.println("enter the no:");
        int n = s.nextInt();
        String target = "";
        System.out.println("enter string: ");
        for (int i = 1; i <= n; i++) {
            String str1 = s.next();
            target = target + str1;
        }
        System.out.println(target);

    }
}
