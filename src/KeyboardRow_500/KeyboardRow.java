package KeyboardRow_500;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by kaorihirata on 2017-06-22.
 */
public class KeyboardRow {

    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(Arrays.toString(findWords(words)));
    }

    public static String[] findWords(String[] words) {

        String row1 = "QWERTYUIOPqwertyuiop";
        String row2 = "ASDFGHJKLasdfghjkl";
        String row3 = "ZXCVBNMaxcvbnm";
        String temp = "";
        ArrayList<String> arrayOutput=new ArrayList<>();

        for (int i = 0; i < words.length; i++) {

            if (row1.indexOf(words[i].substring(0, 1)) >= 0) {
                for (int k = 0; k < words[i].length(); k++) {
                    if (row1.indexOf(words[i].charAt(k)) >= 0) {
                        temp += words[i].charAt(k);
                    } else {
                        temp = "";
                        break;
                    }
                }

            } else if (row2.indexOf(words[i].substring(0, 1)) >= 0) {
                for (int k = 0; k < words[i].length(); k++) {
                    if (row2.indexOf(words[i].charAt(k)) >= 0) {
                        temp += words[i].charAt(k);
                    } else {
                        temp = "";
                        break;
                    }
                }

            } else if (row3.indexOf(words[i].substring(0, 1)) >= 0) {
                for (int k = 0; k < words[i].length(); k++) {
                    if (row3.indexOf(words[i].charAt(k)) >= 0) {
                        temp += words[i].charAt(k);
                    } else {
                        temp = "";
                        break;
                    }
                }
            }
//            System.out.println(temp);
            if(temp!=""){
            arrayOutput.add(temp);
            temp = "";}
        }
        String[] output = new String[arrayOutput.size()];
        arrayOutput.toArray(output);
        return output;
    }


}

