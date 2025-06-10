package exercicios_propostos.s13_heranca_e_polimorfismo.ex03;

public class PessoaJuridica extends Pessoa{
    private int numeroFuncionarios;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, Double rendaAnual, int numeroFuncionarios) {
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public Double calcularLeao() {
        if(numeroFuncionarios > 10) {
            return (rendaAnual * 0.14);
        } else {
            return (rendaAnual * 0.16);
        }
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }
    
}
