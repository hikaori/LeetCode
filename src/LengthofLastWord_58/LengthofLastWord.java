package LengthofLastWord_58;

/**
 * Created by kaorihirata on 2017-06-21.
 *
 * Given a string s consists of upper/lower-case alphabets and
 * empty space characters ' ', return the length of last word in the string.

 If the last word does not exist, return 0.

 Note: A word is defined as a character sequence consists of non-space characters only.

 For example,
 Given s = "Hello World",
 return 5.
 *
 */



public class LengthofLastWord {
    public static void main(String[] args) {
        String s = "Hello world";
        lengthOfLastWord(s);
    }
    public static int lengthOfLastWord(String s) {
        String noSpace = s.trim();
        int spaceIndex = s.lastIndexOf(" ");
        return noSpace.length()-spaceIndex-1;
    }

}
