package program;

public class Matricula extends Aluno{
    public int id;
    public int mesMatricula;
    public int anoMatricula;

    public Matricula() {
    }

    public Matricula(String nome, String rg, String cpf, int anoNasc, int mesNasc, int diaNasc, String sexo, int codigo, String interesse, double desconto, int id, int mesMatricula, int anoMatricula) {
        super(nome, rg, cpf, anoNasc, mesNasc, diaNasc, sexo, codigo, interesse, desconto);
        this.id = id;
        this.mesMatricula = mesMatricula;
        this.anoMatricula = anoMatricula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMesMatricula() {
        return mesMatricula;
    }

    public void setMesMatricula(int mesMatricula) {
        this.mesMatricula = mesMatricula;
    }

    public int getanoMatricula() {
        return anoMatricula;
    }

    public void setanoMatricula(int anoMatricula) {
        this.anoMatricula = anoMatricula;
    }
    public void matricular(){
        System.out.println("Matriculado!");

    }
}
