package dynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class LongestCommonSubsequence {

    private Map<String, Integer> memo = new HashMap<>();

    public int lcs(String s1, String s2) {
        return helper(s1, s2, 0, 0);
    }

    private int helper(String s1, String s2, int i, int j) {
        if (i == s1.length() || j == s2.length()) {
            return 0;
        }
        String key = i + ", " + j;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        int result = 0;
        if (s1.charAt(i) == s2.charAt(j)) {
            result = 1 + helper(s1, s2, i + 1, j + 1);
        } else {
            result = Math.max(helper(s1, s2, i + 1, j), helper(s1, s2, i, j + 1);
        }
        memo.put(key, result);
        return result;
    }
}
