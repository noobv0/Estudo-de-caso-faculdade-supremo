import program.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("                         Bem vindo ao sistema da Faculdade Saber Supremo!");
        System.out.println("                  -------------------------------------------------------------------              ");

        Salario salario = new Salario();
        Matricula matricula = new Matricula();
        Curso curso = new Curso("CC","ciencia da computacao",865.23,"01A");
        System.out.println(curso);

        Aluno aluno = new Aluno("darke","1291872","2827636",2000,10,10,"M",12291882,"CC",20);
        System.out.println(aluno);
        matricula.matricular();

        Professor professor = new Professor("zinid","12334","2029377",1989,10,12,"M",1948822,"C","Professor",3,"CC","II","CC");
        System.out.println(professor);
        System.out.printf("Salário: %.2f",salario.calcularSalarioProfessor(professor));
        System.out.println();
        professor.cadastrarProfessor();


        Coordenador coord = new Coordenador("Joao","1837671","2049272",1999,11,20,"M",12299182,"C","Coordenador",3,"CC","I","bb","A");
        System.out.print(coord);
        System.out.printf("\nSalário: R$ %.2f",salario.calcularSalarioCoordenador(coord)+coord.calcularPlusSalarioCoord(coord));
        System.out.println();
        coord.cadastrarCoordenador();

        CoordenadorAdm coordadm = new CoordenadorAdm("Roosevelt","111111","222222",10,10,1920,"M",12782661,"c","CoordADM",3,"CC","A");
        System.out.println(coordadm);
        System.out.printf("\nSalário: R$ %.2f", coordadm.calcularPlusSalarioCoordADM(coordadm));
        System.out.println();
        coordadm.cadastrarCoordenadorAdm();

        System.out.println();
        System.out.println();

        System.out.printf("Numero minimo de alunos: %.0f", curso.calcularNumMinAluno());
    }}
