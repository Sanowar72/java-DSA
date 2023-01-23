import java.util.Scanner;
import java.util.Stack;

public class printReverseNo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str = "";
        str = n + "";
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            st.push(ch);
        }
        System.out.println(convertNum(st));
        s.close();
    }

    static int convertNum(Stack<Character> st) {
        int num = 0;
        while (!st.isEmpty()) {
            int n = st.pop() - '0';
            num = num * 10 + n;
        }
        return num;
    }
}
