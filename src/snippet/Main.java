package snippet;

/**
 * Created by Walterlmm on 21/09/2016.
 */
public class Main {
    public static void main(String[] args) {

        int aNumber = 3;

        System.out.println((aNumber >= 0) ? (aNumber == 0) ? "first string" : "second string" : "third string");

    }
}

//9.1) second string

//9.2)

//        int aNumber = 3;
//
//        if (aNumber >= 0) {
//
//            if (aNumber == 0) {
//
//                System.out.println("first string");
//
//            } else {
//                System.out.println("second string");
//            }
//        }
//        System.out.println("third string");

//9.3)

// System.out.println((aNumber >= 0) ? (aNumber == 0) ? "first string" : "second string" : "third string");