public class missing {
    static boolean check(int[] ans, int num) {
        int len = ans.length;
        for (int i = 0; i < len; i++) {
            if (num == ans[i])
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] arr2 = { 1, 3, 4, 5, 8, 9, 6 };
        for (int i = 0; i < arr1.length; i++) {
            if (check(arr2, arr1[i]) == false)
                System.out.println(arr1[i] + " ");
        }
    }
}
