package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    // BruteForce Approach
    public boolean containsDuplicateBruteForce(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) { // if any two elements are the same, return true
                    return true;
                }
            }
        }
        return false; // if no duplicates are found, return false
    }


    // Using HashSet
    public static boolean containsDuplicateUsingSet(int[] nums) {
        Set<Integer> unique_set = new HashSet<>(); // Use HashSet to store unique elements
        for (int x : nums) {
            if (!unique_set.add(x)) // If the set already contains the current element, return true
                return true;
        }
        return false; // Return false if no duplicates found
    }

    // Sorting
    public boolean containsDuplicateUsingSorting(int[] nums) {
        Arrays.sort(nums); // sort the array
        // use a loop to compare each element with its next element
        for (int i = 0; i < nums.length - 1; i++) {
            // if any two elements are the same, return true
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false; // if no duplicates are found, return false
    }

    public static void main(String[] args) {


        int[] nums1 = {1, 2, 3, 4};
        System.out.println(containsDuplicateUsingSet(nums1)); // Expected output: false

        int[] nums2 = {1, 2, 3, 1};
        System.out.println(containsDuplicateUsingSet(nums2)); // Expected output: true

        int[] nums3 = {};
        System.out.println(containsDuplicateUsingSet(nums3)); // Expected output: false

        int[] nums4 = {3, 2, 6, -1, 2, 1};
        System.out.println(containsDuplicateUsingSet(nums4)); // Expected output: true
    }
}
