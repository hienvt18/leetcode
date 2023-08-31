public class PalindromeNumber {
    public static void main(String[] args) {

    }

    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        String chuoiDao = new StringBuilder(s).reverse().toString();
        if (s.equals(chuoiDao))
            return true;
        return false;
    }
}
