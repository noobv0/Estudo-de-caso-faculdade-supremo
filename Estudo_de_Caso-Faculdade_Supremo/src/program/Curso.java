package program;

import java.util.ArrayList;

public class Curso {
    public String titulo;
    public String descricao;
    public double valor = 865.23;
    public String sala;

    public ArrayList<Curso> cursos = new ArrayList<>();


    public Curso() {
    }

    public Curso(String titulo, String descricao, double valor, String sala) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.valor = valor;
        this.sala = sala;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
    public void cadastrarCurso(Curso curso){
        cursos.add(curso);
    }
    public double calcularNumMinAluno(){
        return 12568.43/valor;
    }
    public String exibirCurso(){
        return    "Detalhes do Curso: "+
                "\nTitulo: "+titulo+
                "\nDescricao: "+descricao+
                "\nValor: "+valor+
                "\nSala: "+sala;
    }

    @Override
    public String toString() {
        return exibirCurso();
    }
}
