package CodingProblem.InterviewQuestions150LeedCode;

import java.util.Arrays;

public class RemoveDupulicateSortedArray11 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,3,3,4,4};
//        int r = removeDuplicates(arr);
        System.out.println(removeDuplicates(arr));

    }
    public static int  removeDuplicates(int[] nums){
        if(nums == null || nums.length == 0){
            return 0;
        }
        int temp = nums[0];
        int next = 0;
        for(int i = 0; i<nums.length; i++){
            if(i == 0 || i == 1 ){
                nums[next++] = nums[i];
            }
            else if(nums[i] != nums[next -1] || nums[i] != nums[next-2]){
                nums[next++] = nums[i];
            }
        }
        return next;
    }
}
