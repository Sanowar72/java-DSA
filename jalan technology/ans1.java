public class ans1 {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 7, 4, 6 };
        int p = 3, d = 0;
        int len = arr.length;
        if (d == 0) {
            for (int i = len - p; i < len; i++) {
                System.out.print(arr[i] + " ");
            }
            for (int i = 0; i < len - p; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            for (int i = 0; i < len - p; i++) {
                System.out.print(arr[i] + " ");
            }
            for (int i = len - p; i < len; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
// time complexity will be O(n)  and space complexity will be O(1);
