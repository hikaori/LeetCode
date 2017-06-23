package TwoSum_1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by kaorihirata on 2017-06-19.
 */
public class TwoSum {
    public static void main(String[] args) {
        int Givennums[] = {2, 7, 11, 15};
        int target = 18;
        int[] output = {0, 0};

//        output[0]=1;
//        output[1]=2;
//        System.out.println(Arrays.toString(output));
        /// OUT PUT  [1,2]


            for (int i = 0; i < Givennums.length-1; i++) {
                int a = target - Givennums[i];
                for(int j=1;j<Givennums.length;j++) {
                    if (a == Givennums[j]) {
                        output[0] = i;
                        output[1] = j;
                        System.out.println(Arrays.toString(output));
                    }
                }
        }
    }
}
