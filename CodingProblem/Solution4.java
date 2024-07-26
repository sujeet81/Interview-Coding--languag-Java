//238. Product of Array Except Self
//        Medium
//Topics
//        Companies
//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//
//You must write an algorithm that runs in O(n) time and without using the division operation.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3,4]
//Output: [24,12,8,6]
//Example 2:
//
//Input: nums = [-1,1,0,-3,3]
//Output: [0,0,9,0,0]

package CodingProblem;

import java.util.Arrays;

public class Solution4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println((Arrays.toString(productExceptSelf(arr))));

    }
    public static int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int[] output = new int[n];
        for(int i = 0, temp = 1; i < n; i++){
            output[i] = temp;
            temp *= nums[i];
        }
        for(int i = n-1, temp = 1; i>=0; i--){
            output[i]  *= temp;
            temp *= nums[i];
        }
        return output;
    }
}
