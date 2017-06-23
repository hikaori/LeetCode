package AddBinary_67;

/**
 * Created by kaorihirata on 2017-06-21.
 *
 * Given two binary strings, return their sum (also a binary string).

 *For example,
 *a = "11"
 *b = "1"
 * Return "100".
 *
 *
 * *********** WAY TO SOLUTION **************
 *  pattern   ①       ②       ③
 *      A  1101     1101    1000
 *      B  1011     1010    0100
 *      --------------------------
 *      ①
 *      ②　ADDBINALY(A,B)+"1"
 *      ③　ADDBINALY(A,B)+"0"
 */


public class AddBinary {
    public static void main(String[] args) {
        String a ="1100";
        String b ="0011";

        System.out.println(addBinary(a,b));
    }

    public static String addBinary(String a, String b) {
        if(a.length()==0)return b;
        if(b.length()==0)return a;

        if (a.substring(a.length()-1,a.length()).equals("1")&&
                b.substring(b.length()-1,b.length()).equals("1")){
            return addBinary(addBinary(a.substring(0,a.length()-1),b.substring(0,b.length()-1)),"1")+0;
        }
        if(a.substring(a.length()-1,a.length()).equals("0")&&
        b.substring(b.length()-1,b.length()).equals("1")){
            return addBinary(a.substring(0,a.length()-1),b.substring(0,b.length()-1))+"0";
        }
        else {
            return addBinary(a.substring(0,a.length()-1),b.substring(0,b.length()-1))+"1";
        }

    }


}
