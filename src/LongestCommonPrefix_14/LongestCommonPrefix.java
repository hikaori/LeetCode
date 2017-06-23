package LongestCommonPrefix_14;

/**
 * Created by kaorihirata on 2017-06-19.
 *
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * input  {"leet","leecode","leets","leeds"}
 * output  lee
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String input[]={"leet","leecode","leets","leeds"};
//        longestCommonPrefix(input);

        System.out.println(longestCommonPrefix(input));
    }

    public static String longestCommonPrefix(String[] strs){
        if(strs.length==0){return "";}
        String prefix = strs[0];
        for(int i=1; i<strs.length;i++){
//            int k=strs[i].indexOf(prefix);
//            System.out.println(k);  /// 1st k=-1   2nd k=0 (go out while)?????
            while (strs[i].indexOf(prefix)!=0){
                prefix =prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }


}
