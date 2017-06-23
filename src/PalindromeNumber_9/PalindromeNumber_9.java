package PalindromeNumber_9;

/**
 * Created by kaorihirata on 2017-06-19.
 * <p>
 * **********************
 * Determine whether an integer is a palindrome. Do this without extra space.
 * <p>
 * input 12321
 * output  true
 */
public class PalindromeNumber_9 {
    public static void main(String[] args) {

        System.out.println(isPalindrome(12321));
    }

//    public static boolean isPalindrome(int x) {
//        String temp = Integer.toString(x);
//        int[] newX= new int[temp.length()];
//        for(int i=0; i<temp.length();i++){
//            newX[i]=temp.charAt(i); /// charAt 49,50......?????
//        }
//        for(int j=0; j<temp.length();j++){
//            if(newX[j]!=temp.charAt(temp.length()-1)){
//                return false;
//            }
//        }
//        return true;
//    }

    public static boolean isPalindrome(int x) {
        int keepx = x;
        int reversx = 0;
        String index = Integer.toString(x);
        for (int i = 0; i < index.length(); i++) {
            reversx = reversx * 10 + x % 10;
            x = x / 10;
        }
        if (reversx == keepx) {
            return true;
        }
        return false;
    }
}
