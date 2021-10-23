import java.util.ArrayList;
import java.util.List;


public class TwoSum1 {


    private TwoSum1() {
    }

    /**
     *
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     *
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     *
     * You can return the answer in any order.
     */

    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        int numberToFind;
        List<Integer> arrayList = new ArrayList<>();
        for(int i : nums) {
            arrayList.add(i);
        }

        for(int i = 0; i < nums.length; i++) {
            numberToFind = target - nums[i];
            if(arrayList.contains(numberToFind)) {
                arr[0] = arrayList.indexOf(numberToFind);
                arr[1] = i;
            }
        }
        return arr;
    }
}
