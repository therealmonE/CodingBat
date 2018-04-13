package String1;

/**
 * Created by monE on 09.07.2017.
 */
public class helloName {

    public static void main(String[] args) {
        System.out.println(helloNameSolution("Bob"));
        System.out.println(helloNameSolution("Alive"));
        System.out.println(helloNameSolution("X"));
    }

    public static String helloNameSolution (String name) {
         return "Hello " + name + "!";
    }

}
