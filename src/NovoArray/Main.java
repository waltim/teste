package NovoArray;

/**
 * Created by Walterlmm on 19/09/2016.
 */
public class Main {

    public static void main(String[] args) {

        TratarArray novoarray = new TratarArray();

        for(int numeros : novoarray.isArray(new int[]{1,2,3,4,5,6})){
            System.out.println(numeros);
        }

    }
}
