package program;

public class Coordenador extends Professor{

    Funcionario funcionario = new Funcionario();
    public String area;

    public Coordenador() {
    }

    public Coordenador(String nome, String rg, String cpf, int anoNasc, int mesNasc, int diaNasc, String sexo, int matricula, String setor, String cargo, int nivel, String formacao, String nivelProf, String disciplina, String area) {
        super(nome, rg, cpf, anoNasc, mesNasc, diaNasc, sexo, matricula, setor, cargo, nivel, formacao, nivelProf, disciplina);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void cadastrarCoordenador(){
        System.out.println("Coordenador adicionado com sucesso!");
    }
    public double calcularPlusSalarioCoord(Coordenador coordenador){
        double salarioBruto;
        if (coordenador != null) {
            switch (coordenador.nivelProf) {
                case "I":
                    salarioBruto = 6500;
                    return salarioBruto*0.15;

                case "II":
                    salarioBruto = 8325.50;
                    return salarioBruto*0.15;

                case "III":
                    salarioBruto = 12568.43;
                    return salarioBruto*0.15;
                default:
                    System.out.println("Nível inválido.");
                    break;
            }
        }
        return 0;
    }
    public String exibirCoordenador(){
        return super.toString()+
                "\nÁrea: "+area;
    }

    public String toString() {
        return exibirCoordenador();
    }
}
