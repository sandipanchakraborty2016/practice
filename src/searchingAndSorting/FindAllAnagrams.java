package searchingAndSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagrams {

    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> res = new ArrayList<>();
        int[] pCount = new int[26];
        int[] sCount = new int[26];

        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        int left = 0;
        int right = 0;
        int windowSize = p.length();

        while (right < s.length()) {
            sCount[s.charAt(right) - 'a']++;
            if (right - left + 1 > windowSize) {
                sCount[s.charAt(left) - 'a']--;
                left++;
            }
            if (Arrays.equals(pCount, sCount)) {
                res.add(left);
            }
            right++;
        }

        return res;
    }
}
