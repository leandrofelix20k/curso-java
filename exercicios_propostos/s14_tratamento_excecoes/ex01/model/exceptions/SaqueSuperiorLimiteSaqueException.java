package exercicios_propostos.s14_tratamento_excecoes.ex01.model.exceptions;

public class SaqueSuperiorLimiteSaqueException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public SaqueSuperiorLimiteSaqueException(String msg) {
        super(msg);
    }
}
