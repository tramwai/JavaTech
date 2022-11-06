package practice.arrayListPractices;

import java.util.ArrayList;
import java.util.Arrays;

public class FindCommonElements {
    public static void main(String[] args) {
       ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(10, 20, 30, 50, 70));
       ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(20, 50, 70, 100, 300));
       printCommonElements(nums1,nums2);
    }
    /**
    Create a public static method which will take two arraylists, and it will find the common
    elements between them then print it
    Test data 1:
        numbers1 = {10, 20, 30, 50, 70};
        numbers2 = {20, 50, 70, 100, 300};
    Expected output 1:
        20
        50
        70
    Test data 2:
       numbers1 = {30, 50, 70};
       numbers2 = {20, 100, 300};
    Expected output 2:
        There is no matching elements
     */
    public static void printCommonElements(ArrayList<Integer> nums1, ArrayList<Integer> nums2){
        ArrayList<Integer> commons = new ArrayList<>();
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {

                // get the element from the first and second array and compare them
                // !commons.contains(nums1.get(i)) -> if you already checked this element, then skip it
                if (nums1.get(i).equals(nums2.get(j)) && !commons.contains(nums1.get(i))) commons.add(nums1.get(i));
            }
            System.out.println();
        }
        if (commons.isEmpty()) System.out.println("There are no matching elements");
        else System.out.println(commons);
    }
}
