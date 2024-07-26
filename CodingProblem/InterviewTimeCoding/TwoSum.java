package CodingProblem.InterviewTimeCoding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,25,11,7};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr,target)));

    }
    static int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> mapSum = new HashMap<>();
        int[] arr = new int[2];
        for(int i = 0; i< nums.length; i++ ){
            if(!mapSum.isEmpty() && mapSum.containsKey(nums[i])){
                arr[0] = mapSum.get(nums[i]);
                arr[1] = i;

            }
            else {
                mapSum.put(target-nums[i],i);
            }
        }
        return arr;
    }
}