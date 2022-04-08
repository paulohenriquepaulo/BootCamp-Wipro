package exercicioPOO.exercicio03;

public class Quadrado implements  FormaGeometrica{

    private double lado1 = 0.00;
    private double lado2 = 0.00;
    private double resultado = 0.0;


    @Override
    public String cor() {
        return "Vermelho";
    }

    @Override
    public String quantidadeDeLados() {
        return null;
    }


    @Override
    public double area(double lado1, double lado2) {
         return resultado = lado1 * lado2;
    }

    @Override
    public String toString() {
        return "area = " + resultado +
                "\nlado1 = " + lado1 +
                "\nlado2 = " + lado2 +
                "\ncor = " + cor();
    }
}
