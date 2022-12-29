
// import java.util.Scanner;
import java.util.*;

public class eachwordoccurence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the string :");
        String[] str = s.nextLine().split(" ");
        int len = str.length;
        boolean[] freq = new boolean[len];
        for (int i = 0; i < str.length; i++) {
            int count = 1;
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j]))
                    count++;
            }
            if (freq[i] == false) {
                System.out.println(str[i] + "=" + count);
                freq[i] = true;
            }
        }

    }
}
