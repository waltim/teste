package concatenar;

/**
 * Created by Walterlmm on 21/09/2016.
 */
public class Main {

    public static void main(String[] args) {

        String hi = "Hi, ";
        String mom = "mom.";

        System.out.println(hi+mom);

        StringBuilder strings = new StringBuilder();
        strings.append("Hi, ").append("mom.");

        System.out.println(strings.toString());
    }
}
