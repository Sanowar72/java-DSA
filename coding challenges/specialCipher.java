
public class specialCipher {
    static void cipher(String str, int n) {
        int len = str.length();
        System.out.println(len);
        int count = 0;
        for (int i = 0; i < len; i++) {

            count = 0;
            for (int j = 0; j < len; j++) {
                if (str.charAt(i) == str.charAt(j))
                    count++;
            }

            if (count > 1 && str.charAt(i) != str.charAt(i - 1)) {
                char res1 = (char) (str.charAt(i) + n);

                System.out.println(res1);
            } else if (count < 2) {
                char res2 = (char) (str.charAt(i) + n);

                System.out.println(res2);
            }
        }
    }

    public static void main(String[] args) {

        cipher("AABCCC", 5);
    }
}
