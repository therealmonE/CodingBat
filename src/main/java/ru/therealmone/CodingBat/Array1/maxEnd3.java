package Array1;

import java.util.Arrays;

public class maxEnd3 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxEnd3Solution(new int[] {1,2,3})));
        System.out.println(Arrays.toString(maxEnd3Solution(new int[] {11,5,9})));
        System.out.println(Arrays.toString(maxEnd3Solution(new int[] {2,11,3})));
    }

    public static int[] maxEnd3Solution (int[] nums) {
        int max;

        if (nums[0] > nums[nums.length - 1])
            max = nums[0];
        else
            max = nums[nums.length - 1];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = max;
        }

        return nums;
    }
}
