package Array2;

public class countEvens {

    public static void main(String[] args) {
        System.out.println(countEvenSolution(new int[] {2,1,2,3,4}));
        System.out.println(countEvenSolution(new int[] {2,2,0}));
        System.out.println(countEvenSolution(new int[] {1,3,5}));
    }


    public static int countEvenSolution (int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0)
                count++;
        }

        return count;
    }

}
