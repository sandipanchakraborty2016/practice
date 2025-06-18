package dynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class HouseRobber {

    private Map<Integer, Integer> memo = new HashMap<>();

    public int rob(int[] nums) {
        return robFrom(0, nums);
    }

    private int robFrom(int i, int[] nums) {
        if (i >= nums.length) {
            return 0;
        }
        if (memo.containsKey(i)) {
            return memo.get(i);
        }

        int robCurrent = nums[i] + robFrom(i + 2, nums);
        int skipCurrent = robFrom(i + 1, nums);

        int result = Math.max(robCurrent, skipCurrent);
        memo.put(i, result);
        return result;
    }
}
