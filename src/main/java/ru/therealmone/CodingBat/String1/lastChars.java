package String1;

/**
 * Created by monE on 10.07.2017.
 */
public class lastChars {

    public static void main(String[] args) {
        System.out.println(lastCharsSolution("last", "chars"));
        System.out.println(lastCharsSolution("yo", "java"));
        System.out.println(lastCharsSolution("hi", ""));
    }

    public static String lastCharsSolution(String a, String b) {
        String result = "";

        if(a.length() != 0)
            result += Character.toString(a.charAt(0));
        else
            result += '@';


        if(b.length() != 0)
            result += Character.toString(b.charAt(b.length() - 1));
        else
            result += '@';

        return result;
    }

}
