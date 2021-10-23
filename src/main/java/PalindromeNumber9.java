public class PalindromeNumber9 {


    /**
     * Given an integer x, return true if x is palindrome integer.
     * <p>
     * An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.
     */

    public static void main(String[] args) {

        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(11));


    }

    public static boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber/10;
    }

}
