package Array1;

public class firstLast6 {

    public static void main(String[] args) {
        System.out.println(firstLast6Sulotion(new int[] {1,2,6}));
        System.out.println(firstLast6Sulotion(new int[] {6,1,2,3}));
        System.out.println(firstLast6Sulotion(new int[] {13,6,1,2,3}));
    }

    public static boolean firstLast6Sulotion (int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }
}
