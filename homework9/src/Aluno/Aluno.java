package Aluno;

public class Aluno {

    private String nome;
    private int codigo;
    private double nota1;
    private double nota2;

    //Método Construtor
    public Aluno(String nome, int codigo, double nota1, double nota2) {
        this.nome = nome;
        this.codigo = codigo;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    //Métodos de acesso a minha classe

    // Nome dos Alunos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    //Código Aluno
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return this.codigo;
    }

    //Primeira Nota
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota1() {
        return this.nota1;
    }

    //Segunda Nota
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota2() {
        return this.nota2;
    }

    //Média
    public double mediaNotas(){
        double media = (this.nota1 + this.nota2) / 2;
        return media;
    }
}








