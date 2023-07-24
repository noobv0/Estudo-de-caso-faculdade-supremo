package program;

import java.util.ArrayList;

public class Pessoa {
    public String nome;
    public String rg;
    public String cpf;
    public int anoNasc;
    public int mesNasc;
    public int diaNasc;
    public String sexo;

    public ArrayList<Pessoa> pessoas = new ArrayList<>();

    public Pessoa() {
    }

    public Pessoa(String nome, String rg, String cpf, int anoNasc, int mesNasc, int diaNasc, String sexo) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.anoNasc = anoNasc;
        this.mesNasc = mesNasc;
        this.diaNasc = diaNasc;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public int getMesNasc() {
        return mesNasc;
    }

    public void setMesNasc(int mesNasc) {
        this.mesNasc = mesNasc;
    }

    public int getDiaNasc() {
        return diaNasc;
    }

    public void setDiaNasc(int diaNasc) {
        this.diaNasc = diaNasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void Cadastrar(Pessoa pessoa){
        pessoas.add(pessoa);
    }

    public String toString() {
        return  "\nNome: "+nome+
                "\nRG: "+rg+
                "\nCPF: "+cpf+
                "\nSexo: "+sexo+
                "\nData de Nascimento: "+diaNasc+"/"+mesNasc+"/"+anoNasc;
    }
}
