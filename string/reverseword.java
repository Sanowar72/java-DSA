import java.util.Scanner;

public class reverseword {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the string :");
        String[] str = s.nextLine().split(" ");
        int l = str.length;
        // System.out.println(l);
        String res = "";
        for (int i = str.length - 1; i >= 0; i--) {
            // System.out.println(str[i]);
            res += str[i] + " ";
        }
        // str = str.split(" ");
        System.out.println(res);
    }
}
