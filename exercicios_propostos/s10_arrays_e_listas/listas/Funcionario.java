package exercicios_propostos.s10_arrays_e_listas.listas;

import java.text.Format;

public class Funcionario {
    private long id;
    private String nome;
    private double salario;

    public Funcionario(long id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentarSalario(double porcentagem) {
        this.salario = (this.salario * (porcentagem/100)) + this.salario;
    }

    @Override
    public String toString(){
        return getId() +
                ", " +
                getNome() +
                ", " +
                String.format("%.2f", getSalario()) +
                "\n";
    }
}
