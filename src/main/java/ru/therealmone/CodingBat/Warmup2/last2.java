package Warmup2;

/**
 * Created by monE on 09.07.2017.
 */
public class last2 {

    public static void main(String[] args) {
        System.out.println(last2Solution("hixxhi"));
        System.out.println(last2Solution("xaxxaxaxx"));
        System.out.println(last2Solution("axxxaaxx"));
    }

    public static int last2Solution (String s) {
        String subS = s.substring(s.length() - 2);
        int count = 0;

        for (int i = 0; i < s.length() - 2; i++) {
            String tempS = s.substring(i, i + 2);
            if (tempS.equals(subS))
                count++;
        }
        return count;
    }
}
