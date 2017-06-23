package SearchInsertPosition_35;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by kaorihirata on 2017-06-20.
 *
 * Given a sorted array and a target value,
 * return the index if the target is found. If not,
 * return the index where it would be if it were inserted in order.

 You may assume no duplicates in the array.

 Here are few examples.
 [1,3,5,6], 5 → 2
 [1,3,5,6], 2 → 1
 [1,3,5,6], 7 → 4
 [1,3,5,6], 0 → 0
 *
 */
public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        int target =7;

        System.out.println(searchInsert(nums,target));

    }
    public static int searchInsert(int[] nums, int target) {
            int low =0; int high=nums.length-1;  /// high=nums.length ----> number of element
            while(low<=high){
                int mid = (low+high)/2;
                if(nums[mid]==target)return mid;
                else if (nums[mid]>target){high=mid-1;}
                else {low=mid+1;}
                }
                return low;
            }



}
