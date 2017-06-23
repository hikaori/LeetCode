package RemoveDuplicatesfromSortedArray_26;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by kaorihirata on 2017-06-20.
 *
 * Given a sorted array,
 * remove the duplicates in place such
 * that each element appear only once and return the new length.

 *Do not allocate extra space for another array,
 * you must do this in place with constant memory.

 *For example,
 *Given input array nums = [1,1,2],

 *Your function should return length = 2,
 * with the first two elements of nums being 1 and 2 respectively.
 * It doesn't matter what you leave beyond the new length.
 */


public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] input ={1,1,2};
        removeDuplicate(input);
        System.out.println(removeDuplicate(input));
    }


    public static int removeDuplicate(int[] nums) {
        int  length = 0;

        Set<Integer> hashset =new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            hashset.add(nums[i]);
        }
        System.out.println(hashset);
        length= hashset.size();
        return length;
    }


}

