
// package ArrayList;
import java.util.*;

public class basic {
    static void swap(ArrayList<Integer> arr, int index1, int index2) {
        int temp = arr.get(index1);
        arr.set(index1, arr.get(index2));
        arr.set(index2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(6);
        arr.add(3);
        arr.add(7);
        arr.add(1);
        arr.add(4);
        arr.add(5);

        // System.out.println(arr);
        // for (Integer ele : arr) {
        // System.out.print(ele + " ");
        // }
        // for (int i = 0; i < arr.size(); i++) {
        // System.out.print(arr.get(i) + " ");
        // }
        // System.out.println();

        // arr.remove(2);
        // for (int i = 0; i < arr.size(); i++) {
        // System.out.print(arr.get(i) + " ");
        // }

        arr.set(3, 15);
        // System.out.println();
        // for (int i = 0; i < arr.size(); i++) {
        // System.out.print(arr.get(i) + " ");
        // }

        arr.add(3, 25);
        arr.add(75);
        // System.out.println();
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        // System.out.println(arr.contains(5));
        System.out.println();

        // int max = Integer.MIN_VALUE;
        // for (int i = 0; i < arr.size(); i++) {
        // if (arr.get(i) > max)
        // max = arr.get(i);
        // }
        // System.out.println("max element in array is: " + max);
        // 6,3,7,25,15,4,5,75

        int index1 = 2;
        int index2 = 5;
        swap(arr, index1, index2);

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }

    }
}
