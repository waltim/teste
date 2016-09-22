package operador.incremento;

/**
 * Created by Walterlmm on 18/09/2016.
 */
public class Main {

    public static void main(String[] args) {

        int i = 10;

        int n = ++i%5;

        System.out.println(i);

        System.out.println(n);
    }
}

//1.1)
//    int i = 10;
//
//    int n = i++%5;
//
//     System.out.println(i);
//
//     System.out.println(n);
//resultados
// 11
//  0

//1.2)
//    int i = 10;
//
//    int n = ++i%5;
//
//     System.out.println(i);
//
//     System.out.println(n);

//resultados
// 11
//  1

// quando é i++, n faz o calculo e só depois i recebe o incremento e ++i é ao contrário.