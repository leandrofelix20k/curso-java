package exercicios_propostos.s13_heranca_e_polimorfismo.ex03;

public abstract class Pessoa {
    private String nome;
    protected Double rendaAnual;

    public Pessoa() {
    }

    public Pessoa(String nome, Double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public abstract Double calcularLeao();
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getRendaAnual() {
        return rendaAnual;
    }
    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    @Override
    public String toString() {
        return this.nome +
        ": $ " +
        String.format("%.2f", calcularLeao());
    }
}
