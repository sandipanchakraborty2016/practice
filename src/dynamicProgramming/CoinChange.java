package dynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class CoinChange {

    private Map<Integer, Integer> memo = new HashMap<>();

    public int coinChange(int[] coins, int amount) {
        if (amount < 0) {
            return -1;
        }
        if (amount == 0) {
            return 0;
        }
        if (memo.containsKey(amount)) {
            return memo.get(amount);
        }

        int min = Integer.MAX_VALUE;
        for (int coin : coins) {
            int result = coinChange(coins, amount - coin);
            if (result >= 0 && result <= min) {
                min = 1 + result;
            }
        }
        int result = (min == Integer.MAX_VALUE) ? -1 : min;
        memo.put(amount, result);
        return result;
    }
}
