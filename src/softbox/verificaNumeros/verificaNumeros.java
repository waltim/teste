package softbox.verificaNumeros;

/**
 * Created by Walterlmm on 18/09/2016.
 */
public class verificaNumeros {

    public boolean verificaNumero(int num, int num2){
        //ultimo caracter do primeiro numero.
        String intStringNum = String.valueOf(num);
        int posicaoUltimoCaractereNum = intStringNum.length() - 1;
        int tamanhoStringNum = intStringNum.length();
        int ultimoCaractereNum = Integer.parseInt(intStringNum.substring(posicaoUltimoCaractereNum, tamanhoStringNum));
        //ultimo caracter do segundo numero.
        String intStringNum2 = String.valueOf(num2);
        int posicaoUltimoCaractereNum2 = intStringNum2.length() - 1;
        int tamanhoStringNum2 = intStringNum2.length();
        int ultimoCaractereNum2 = Integer.parseInt(intStringNum2.substring(posicaoUltimoCaractereNum2, tamanhoStringNum2));

        if(ultimoCaractereNum == ultimoCaractereNum2)
            return true;
        else{
            return false;
        }
    }

}
