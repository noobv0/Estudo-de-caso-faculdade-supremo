package program;

import java.util.ArrayList;

public class Aluno extends Pessoa{
    public int codigo;
    public String interesse;
    public double desconto;

    public ArrayList<Aluno> Alunos = new ArrayList<>();

    public Aluno() {
    }

    public Aluno(String nome, String rg, String cpf, int anoNasc, int mesNasc, int diaNasc, String sexo, int codigo, String interesse, double desconto) {
        super(nome, rg, cpf, anoNasc, mesNasc, diaNasc, sexo);
        this.codigo = codigo;
        this.interesse = interesse;
        this.desconto = desconto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getInteresse() {
        return interesse;
    }

    public void setInteresse(String interesse) {
        this.interesse = interesse;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void cadastrarAluno(){
        System.out.println("Aluno cadastrado com sucesso!");;
    }
    public String exibirAluno(){
        return super.toString() +
                "\nCodigo: "+getCodigo()+
                "\nInteresse: "+getInteresse()+
                "\nDesconto: "+getDesconto()+"%";
    }

    public String toString() {
        return exibirAluno();
    }
}
