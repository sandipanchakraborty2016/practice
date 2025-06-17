package twoPointers;

import java.util.Arrays;

public class SortedSquares {

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int pos = n - 1;
        Arrays.sort(nums);
        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[pos--] = nums[left] * nums[left];
                left++;
            }else{
                result[pos--]=nums[right]*nums[right];
                right--;
            }
        }
        return result;
    }
}
