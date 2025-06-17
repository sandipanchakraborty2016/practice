package twoPointers;

public class ReverseString {

    public static String reverse(String str) {

        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length - 1;

        while(start<end){
            char temp= arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return String.valueOf(arr);
    }

    public static void main(String[] args){
        System.out.println(reverse("Hello, how are you?"));
    }
}
