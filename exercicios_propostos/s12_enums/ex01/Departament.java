package exercicios_propostos.s12_enums.ex01;

public class Departament {
    private String name;

    public Departament() {
    }

    public Departament(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
