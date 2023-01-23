
import java.util.*;

public class letteroccurance {

    static void check(String str) {
        int n = str.length();
        int[] freq = new int[26];
        boolean[] res = new boolean[26];
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            int index = ch - 'a';
            freq[index]++;

        }
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            int index = ch - 'a';
            // if (res[index] == false) {
            // System.out.println(ch + "=" + freq[index]);
            // res[index] = true;
            // }
            if (freq[index] != 0) {
                System.out.println(ch + "=" + freq[index]);
                freq[index] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the string :");
        String str = s.next();
        check(str);
    }
}
