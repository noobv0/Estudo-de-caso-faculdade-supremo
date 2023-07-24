package program;

public class Salario {
    private double salarioBruto;
    private double salarioLiquido;
    private double inss = 0.14;
    private double irrf = 0.275;
    private double planoSaude = 125.0;

    private Professor professor;

    public Salario() {
    }

    public Salario(double salarioBruto, double salarioLiquido, double inss, double irrf, double planoSaude) {
        this.salarioBruto = salarioBruto;
        this.salarioLiquido = salarioLiquido;
        this.inss = inss;
        this.irrf = irrf;
        this.planoSaude = planoSaude;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public double getInss() {
        return inss;
    }

    public void setInss(double inss) {
        this.inss = inss;
    }

    public double getIrrf() {
        return irrf;
    }

    public void setIrrf(double irrf) {
        this.irrf = irrf;
    }

    public double getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(double planoSaude) {
        this.planoSaude = planoSaude;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public double calcularSalarioProfessor(Professor professor) {
        if (professor != null) {
            switch (professor.nivelProf) {
                case "I":
                    salarioBruto = 6500;
                    salarioLiquido = salarioBruto - (salarioBruto * inss) - (salarioBruto * irrf) - planoSaude;
                    return salarioLiquido;
                case "II":
                    salarioBruto = 8325.50;
                    salarioLiquido = salarioBruto - (salarioBruto * inss) - (salarioBruto * irrf) - planoSaude;
                    return salarioLiquido;
                case "III":
                    salarioBruto = 12568.43;
                    salarioLiquido = salarioBruto - (salarioBruto * inss) - (salarioBruto * irrf) - planoSaude;
                    return salarioLiquido;
                default:
                    System.out.println("Nível inválido.");
                    break;
            }

        } else {
            System.out.println("Professor não definido.");
        }

        return 0.0;
    }
    public double calcularSalarioCoordenador(Coordenador coordenador) {
        if (coordenador != null) {
            switch (coordenador.nivelProf) {
                case "I":
                    salarioBruto = 6500;
                    salarioLiquido = salarioBruto - (salarioBruto * inss) - (salarioBruto * irrf) - planoSaude;
                    return salarioLiquido;
                case "II":
                    salarioBruto = 8325.50;
                    salarioLiquido = salarioBruto - (salarioBruto * inss) - (salarioBruto * irrf) - planoSaude;
                    return salarioLiquido;
                case "III":
                    salarioBruto = 12568.43;
                    salarioLiquido = salarioBruto - (salarioBruto * inss) - (salarioBruto * irrf) - planoSaude;
                    return salarioLiquido;
                default:
                    System.out.println("Nível inválido.");
                    break;
            }

        } else {
            System.out.println("Professor não definido.");
        }

        return 0.0;
    }

}
