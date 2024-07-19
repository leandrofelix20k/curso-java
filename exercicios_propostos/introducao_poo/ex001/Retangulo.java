package exercicios_propostos.introducao_poo.ex001;

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo() {
    }

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area(){
        return largura * altura;
    }

    public double perimetro(){
        return 2 * (altura + largura);
    }

    public double diagonal(){
        double d = Math.pow(largura, 2.0) + Math.pow(altura, 2.0);

        return Math.sqrt(d);
    }

    @Override
    public String toString(){
        return "AREA = " + String.format("%.2f", area()) +
                "\nPERIMETRO = " + String.format("%.2f", perimetro()) +
                "\nDIAGONAL = " + String.format("%.2f", diagonal());

    }
}
