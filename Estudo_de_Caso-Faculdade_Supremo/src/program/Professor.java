package program;

public class Professor extends Funcionario{
    public String formacao;
    public String nivelProf;
    public String disciplina;

    Salario salario = new Salario();
    public Professor() {
    }

    public Professor(String nome, String rg, String cpf, int anoNasc, int mesNasc, int diaNasc, String sexo, int matricula, String setor, String cargo, int nivel, String formacao, String nivelProf, String disciplina) {
        super(nome, rg, cpf, anoNasc, mesNasc, diaNasc, sexo, matricula, setor, cargo, nivel);
        this.formacao = formacao;
        this.nivelProf = nivelProf;
        this.disciplina = disciplina;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getNivelProf() {
        return nivelProf;
    }

    public void setNivelProf(String nivelProf) {
        this.nivelProf = nivelProf;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public void cadastrarProfessor() {
        System.out.println("Professor adicionado com sucesso!");
    }
    public String exibirProfessor(){
        return super.toString()+
                "\nFormação: "+formacao+
                "\nNível: "+nivelProf+
                "\nDisciplina: "+disciplina;
    }
    public String toString(){
        return exibirProfessor();
    }
}
