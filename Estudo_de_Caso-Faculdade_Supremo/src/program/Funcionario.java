package program;

import java.util.ArrayList;

public class Funcionario extends Pessoa{
    public int matricula;
    public String setor;
    public String cargo;
    public int nivel;

    public ArrayList<Funcionario> Funcionarios = new ArrayList<>();

    public Funcionario() {
    }

    public Funcionario(String nome, String rg, String cpf, int anoNasc, int mesNasc, int diaNasc, String sexo, int matricula, String setor, String cargo, int nivel) {
        super(nome, rg, cpf, anoNasc, mesNasc, diaNasc, sexo);
        this.matricula = matricula;
        this.setor = setor;
        this.cargo = cargo;
        this.nivel = nivel;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void cadastrarFuncionario(){
        System.out.println("Funcionario adicionado com  sucesso!");
    }
    public String exibirFuncionario(){
        return  "\n"+super.toString() +
                "\nMatriclua: "+matricula+
                "\nSetor: "+setor+
                "\nCargo: "+cargo+
                "\nNível: "+nivel;
    }
    public String toString(){
        return exibirFuncionario();
    }
}
