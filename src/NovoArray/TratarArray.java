package NovoArray;

/**
 * Created by Walterlmm on 19/09/2016.
 */

public class TratarArray {

   private int tamanhoVetor;

    public void setTamanhoVetor(int tamanhoVetor) {
        this.tamanhoVetor = tamanhoVetor;
    }

    public int getTamanhoVetor() {
        return tamanhoVetor;
    }

    public static int [] isArray(int array[]){
        for (int i = 0; i < array.length; i++){
            array[i] = array[i];
        }
        int valorultposic =  array[array.length-1];
        int valorprimposic = array[0];
        array[array.length-1] = valorprimposic;
        array[0] = valorultposic;
        return array;
    }
}
