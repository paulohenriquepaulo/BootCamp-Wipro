package exercicioPOO.exercicio03;

public class Retangulo implements FormaGeometrica{

    private double lado1 = 0.00;
    private double lado2 = 0.00;
    private double resultado = 0.00;

    @Override
    public String cor() {
        return "Rosa";
    }

    @Override
    public String quantidadeDeLados() {
        return null;
    }

    @Override
    public double area(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        resultado = lado1 * lado2;
        return resultado;
    }

    @Override
    public String toString() {
        return "area = " + resultado +
                "\nlado1 = " + lado1 +
                "\nlado2 = " + lado2 +
                "\ncor = " + cor();
    }
}
