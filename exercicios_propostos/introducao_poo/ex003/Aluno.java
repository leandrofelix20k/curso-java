package exercicios_propostos.introducao_poo.ex003;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public Aluno() {
    }

    public Aluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double notaFinal(){
        return nota1 + nota2 + nota3;
    }

    public String situacaoAluno(){
        if(notaFinal() >= 60.0){
            return "\nPASS";
        }
        double notaRestante = 60 - notaFinal();
        return "\nFAILED\nMISSING " + notaRestante + " POINTS";
    }

    @Override
    public String toString(){
        return "FINAL GRADE = "
                + String.format("%.2f", notaFinal())
                + situacaoAluno();
    }
}
