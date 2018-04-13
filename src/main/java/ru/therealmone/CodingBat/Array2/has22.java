package Array2;

public class has22 {

    public static void main(String[] args) {
        System.out.println(has22Solution(new int[] {1, 2, 2}));
        System.out.println(has22Solution(new int[] {1, 2, 1, 2}));
        System.out.println(has22Solution(new int[] {2, 1, 2}));
    }

    public static boolean has22Solution (int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2)
                return true;
        }

        return false;

    }
}
