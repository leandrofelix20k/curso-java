package exercicios_propostos.s13_heranca_e_polimorfismo.ex03;

public class PessoaFisica extends Pessoa {
    private Double gastosSaude;

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public Double calcularLeao() {
        if(rendaAnual < 20000) {
            return (rendaAnual * 0.15) - (gastosSaude * 0.25);
        } else {
            return (rendaAnual * 0.25) - (gastosSaude * 0.25);
        }
    }
}
