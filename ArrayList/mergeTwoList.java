import java.util.*;

public class mergeTwoList {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        // for (int i = 0; i < 5; i++) {
        // arr1.add(i + 1);
        // }
        arr1.add(10);
        arr1.add(11);
        arr1.add(12);
        arr1.add(13);
        arr1.add(14);
        arr1.add(15);
        System.out.println(arr1);
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            arr2.add(i + 2);
        }
        System.out.println(arr2);
        ArrayList<Integer> arr3 = new ArrayList<>();
        if (arr1.size() > arr2.size()) {
            for (int i = 0; i < arr1.size(); i++) {
                arr3.add(arr1.get(i));
                if (i < arr2.size()) {
                    arr2.add(arr2.get(i));
                }
            }
        } else {
            for (int i = 0; i < arr2.size(); i++) {
                if (i < arr1.size()) {
                    arr3.add(arr1.get(i));
                }
                arr3.add(arr2.get(i));
            }
        }
        System.out.println(arr3);
    }
}