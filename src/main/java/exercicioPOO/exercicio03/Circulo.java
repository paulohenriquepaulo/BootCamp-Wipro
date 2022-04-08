package exercicioPOO.exercicio03;

public class Circulo implements FormaGeometrica{

    private double raio;
    private double resultado;

    @Override
    public String cor() {
        return "Azul";
    }

    @Override
    public String quantidadeDeLados() {
        return null;
    }

    @Override
    public double area(double a, double b) {
        return 0;
    }

    public double area(double raio) {
        this.raio = raio;
        resultado = raio * 3.14 * 2;
        return resultado;
    }

    @Override
    public String toString() {
        return "raio = " + raio +
                "\narea = " + resultado +
                "\ncor = " + cor();
    }

}
