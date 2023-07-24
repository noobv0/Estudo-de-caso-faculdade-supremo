package program;
public class CoordenadorAdm extends Funcionario{
    Funcionario funcionario = new Funcionario();
    public String area;
    public String nivelTecnico;


    public CoordenadorAdm() {
    }

    public CoordenadorAdm(String nome, String rg, String cpf, int anoNasc, int mesNasc, int diaNasc, String sexo, int matricula, String setor, String cargo, int nivel, String area,String nivelTecnico) {
        super(nome, rg, cpf, anoNasc, mesNasc, diaNasc, sexo, matricula, setor, cargo, nivel);
        this.area = area;
        this.nivelTecnico = nivelTecnico;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }


    public void cadastrarCoordenadorAdm(){
        System.out.println("Coordenador Adm adicionado com sucesso!");
    }
    public double calcularPlusSalarioCoordADM(CoordenadorAdm x){
        double salarioBruto;
        if (x != null) {
            switch (x.nivelTecnico) {
                case "A":
                    salarioBruto = 1520.25;
                    return salarioBruto-(salarioBruto*0.09)+(salarioBruto*0.135)-125;

                case "B":
                    salarioBruto = 2362.67;
                    return salarioBruto-(salarioBruto*0.075)-(salarioBruto*0.09)+(salarioBruto*0.135)-125;

                case "C":
                    salarioBruto = 2988.92;
                    return salarioBruto-(salarioBruto*0.15)-(salarioBruto*0.12)+(salarioBruto*0.135)-125;

                case "D":
                    salarioBruto = 3572.77;
                    return salarioBruto-(salarioBruto*0.15)-(salarioBruto*0.12)+(salarioBruto*0.135)-125;

                case "E":
                    salarioBruto = 4878.67;
                    return salarioBruto-(salarioBruto*0.225)-(salarioBruto*0.14)+(salarioBruto*0.135)-125;
                default:
                    System.out.println("Nível inválido.");
                    break;
            }
        }
        return 0;
    }
    public String exibirCoordenadorAdm(){
        return super.toString() +
                "\nNivel do Tecnico: "+ nivelTecnico;

    }

    @Override
    public String toString() {
        return exibirCoordenadorAdm();
    }
}
