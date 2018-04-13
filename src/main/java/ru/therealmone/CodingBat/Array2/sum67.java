package Array2;

public class sum67 {

    public static void main(String[] args) {
        System.out.println(sum67Solution(new int[] {1,2,2}));
        System.out.println(sum67Solution(new int[] {1,2,2,6,99,99,7}));
        System.out.println(sum67Solution(new int[] {1,1,6,7,2}));
    }


    public static int sum67Solution (int[] nums) {
        boolean flag = false;
        int sum = 0;

        for (int take: nums) {

            if (take == 6) {
                flag = true;
            } else if (flag && take == 7) {
                flag = false;
            } else if (!flag) {
                sum += take;
            }

        }

        return sum;
    }
}
