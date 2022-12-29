// package akshu;

public class countnoofdigit {
    public static void main(String[] args) {
        String str = "ab1c4d6e";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9')
                count++;
        }
        System.out.println(count);
    }
}
