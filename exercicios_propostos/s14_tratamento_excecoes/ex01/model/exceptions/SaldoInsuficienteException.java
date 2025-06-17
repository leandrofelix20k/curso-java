package exercicios_propostos.s14_tratamento_excecoes.ex01.model.exceptions;

public class SaldoInsuficienteException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public SaldoInsuficienteException(String msg) {
        super(msg);
    }
}
