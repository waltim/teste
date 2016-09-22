package versão.string;

/**
 * Created by Walterlmm on 19/09/2016.
 */
public class Main {
    public static void main(String[] args) {

        AlteraString novastring = new AlteraString();

        novastring.setStr("coding");

        System.out.println(novastring.NovaVersao(novastring.getStr()));

    }
}


