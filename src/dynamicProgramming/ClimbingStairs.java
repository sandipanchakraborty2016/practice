package dynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {

    private Map<Integer, Integer> memo = new HashMap<>();

    public int climbingStairs(int n) {

        if (n <= 2) {
            return n;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int result = climbingStairs(n - 1) + climbingStairs(n - 2);
        memo.put(n, result);
        return result;
    }
}
