
// import java.util.Scanner;
import java.util.*;

public class stringcount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = s.next();
        }
        String[] ans = new String[n];
        int a = 0;

        // for (int i = 0; i < n; i++) {
        // System.out.println(str[i]);
        // }
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (str[i].equals(str[j]))
                    count++;
            }
            if (count == 1) {
                // System.out.println(str[i]);
                ans[a] = str[i];
                // System.out.println(ans[i]);
                a++;
            }
        }
        System.out.println(ans[k - 1]);
    }
}
