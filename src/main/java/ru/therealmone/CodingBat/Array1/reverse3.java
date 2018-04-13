package Array1;

import java.util.Arrays;

public class reverse3 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse3Solution(new int[] {1,2,3})));
        System.out.println(Arrays.toString(reverse3Solution(new int[] {5,11,9})));
        System.out.println(Arrays.toString(reverse3Solution(new int[] {7,0,0})));
    }

    public static int[] reverse3Solution (int[] nums) {
        int[] newArray = new int[3];
        for (int i = 0; i < nums.length; i++) {
            newArray[2 - i] = nums[i];
        }
        return newArray;
    }
}
