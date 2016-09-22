package versão.string;

/**
 * Created by Walterlmm on 19/09/2016.
 */
public class AlteraString {

    private String str;

    public void setStr(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public String NovaVersao(String str){

     String modificada = str.substring(0, str.length() - 1);
     modificada = modificada.substring(1);
     return modificada;
    }

}
