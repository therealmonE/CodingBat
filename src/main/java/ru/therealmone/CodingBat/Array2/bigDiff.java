package Array2;

public class bigDiff {

    public static void main(String[] args) {
        System.out.println(bigDiffSolution(new int[] {10,3,5,6}));
        System.out.println(bigDiffSolution(new int[] {7,2,10,9}));
        System.out.println(bigDiffSolution(new int[] {2,10,7,2}));
    }

    public static int bigDiffSolution (int[] nums) {
        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];
            if (nums[i] < min)
                min = nums[i];
        }

        return max - min;
    }

}
