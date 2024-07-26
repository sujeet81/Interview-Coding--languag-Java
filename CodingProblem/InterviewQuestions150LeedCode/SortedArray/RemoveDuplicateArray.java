package CodingProblem.InterviewQuestions150LeedCode.SortedArray;

import java.util.Arrays;

public class RemoveDuplicateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5, 6, 6};
        int r = arr.length;
        r = removeDuplicate(arr, r);
        for (int i = 0; i < r; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    static int removeDuplicate(int[] nums, int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int[] temp = new int[n];

        int j = 0;
     for(int i = 0; i<n-1; i++){
         if(nums[i] != nums[i+1]){
             temp[j++] = nums[i];
         }
     }
     temp[j++] = nums[n-1];
     for(int i = 0; i<j; i++){
         nums[i] = temp[i];
     }
     return j;
    }
}





// ...................*********888888888***************...................................................
//    public static int removeDuplicateElements(int arr[], int n){
//        if (n==0 || n==1){
//            return n;
//        }
//        int j = 0;//for next element
//        for (int i=0; i < n-1; i++){
//            if (arr[i] != arr[i+1]){
//                arr[j++] = arr[i];
//            }
//        }
//        arr[j++] = arr[n-1];
//        return j;
//    }
//
//    public static void main (String[] args) {
//        int arr[] = {10,20,20,30,30,40,50,50};
//        int length = arr.length;
//        length = removeDuplicateElements(arr, length);
//        //printing array elements
//        for (int i=0; i<length; i++)
//            System.out.print(arr[i]+" ");
//    }
//
//}

