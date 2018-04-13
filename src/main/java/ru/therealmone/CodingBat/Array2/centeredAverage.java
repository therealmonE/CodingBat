package Array2;

public class centeredAverage {

    public static void main(String[] args) {
        System.out.println(centeredAverageSolution(new int[] {1,2,3,4,100}));
        System.out.println(centeredAverageSolution(new int[] {1,1,5,5,10,8,7}));
        System.out.println(centeredAverageSolution(new int[] {-10,-4,-2,-4,-2,0}));
    }

    public static int centeredAverageSolution (int[] nums) {
        if (nums.length % 2 != 0)
            return nums[nums.length / 2];
        else
            return (nums[nums.length / 2] + nums[nums.length/2 + 1]) / 2;
    }
}
