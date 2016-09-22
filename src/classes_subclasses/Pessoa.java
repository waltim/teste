package classes_subclasses;

import java.util.Date;

/**
 * Created by Walterlmm on 21/09/2016.
 */
public class Pessoa {

    private String CPF;
    private String nome;
    protected String sexo;
    private Date datanascimento;

    public Pessoa() {

    }

    public Pessoa(String CPF) {
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }

    protected boolean verificaSexo(String sexo) {

        if (sexo == "feminino") {
            return true;
        } else {
            return false;
        }
    }


}
