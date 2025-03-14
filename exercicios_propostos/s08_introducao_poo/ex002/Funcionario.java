package exercicios_propostos.s8_introducao_poo.ex002;

public class Funcionario {
    private String nome;
    private double salarioBruto;
    private double impostoVulgoLeao;

    public Funcionario() {
    }

    public Funcionario(String nome, double salarioBruto, double impostoVulgoLeao) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.impostoVulgoLeao = impostoVulgoLeao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getImpostoVulgoLeao() {
        return impostoVulgoLeao;
    }

    public void setImpostoVulgoLeao(double impostoVulgoLeao) {
        this.impostoVulgoLeao = impostoVulgoLeao;
    }

    public double getSalario(){
        return salarioBruto - impostoVulgoLeao;
    }

    public void incrementarSalario(double percentual){
        this.salarioBruto += salarioBruto * percentual / 100;
    }

    @Override
    public String toString(){
        return nome
                + ", $ "
                + String.format("%.2f", getSalario());
    }
}
