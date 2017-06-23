package PlusOne_66;

import java.util.Arrays;

/**
 * Created by kaorihirata on 2017-06-21.
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

 *You may assume the integer do not contain any leading zero, except the number 0 itself.

 *The digits are stored such that the most significant digit is at the head of the list.
 *
 * note
 * input {1,2,3,4}    output ---> {1,2,3,4,5}
 * input {1,2,3,9}    output ---->{1,2,4,0}
 *  add 1 to input array, show the answer of the array.
 */
public class PlusOne {
    public static void main(String[] args) {
        String a ="abcd";
        System.out.println(a.substring(1,2));

        int[] digits={1,2,3,9};
        plusOne(digits);
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        String str = "";
        for(int i:digits){
            str+=i;
        }
        int intdegits = Integer.parseInt(str);
        int addOnedegits = intdegits +1;
        str=Integer.toString(addOnedegits);

        int[] result= new int[str.length()];
        for(int i=0;i<str.length();i++){
            result[i]=Integer.parseInt(str.substring(i,i+1));
        }
        return result;
    }
}
