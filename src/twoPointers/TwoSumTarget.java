package twoPointers;

import java.util.Arrays;

public class TwoSumTarget {

    public static int[] twoSum(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        Arrays.sort(nums);
        while(left<right){
            int sum=nums[left]+nums[right];
            if(sum==target){
                return new int[]{left, right};
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(twoSum(new int[]{1, 1, 3, 5}, 6)));
    }
}
