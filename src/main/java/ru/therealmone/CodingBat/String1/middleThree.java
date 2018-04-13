package String1;

/**
 * Created by monE on 10.07.2017.
 */
public class middleThree {

    public static void main(String[] args) {
        System.out.println(middleThreeSolution("Candy"));
        System.out.println(middleThreeSolution("and"));
        System.out.println(middleThreeSolution("solving"));
    }

    public static String middleThreeSolution (String a) {
        return a.substring(a.length()/2 - 1, a.length()/2 + 2);
    }

}
