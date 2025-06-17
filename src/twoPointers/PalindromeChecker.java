package twoPointers;

public class PalindromeChecker {

    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            char startChar = Character.toLowerCase(str.charAt(start));
            char endChar=Character.toLowerCase(str.charAt(end));
            if(startChar!=endChar){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isPalindrome("Gog"));
    }
}
