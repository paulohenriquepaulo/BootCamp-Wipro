package exercicioPOO.exercicio03;

public class Triangulo implements FormaGeometrica{

    private double base = 0.0;
    private double altura = 0.0;
    private double resultado = 0.0;

    @Override
    public String cor() {
        return "Verde";
    }

    @Override
    public String quantidadeDeLados() {
        return null;
    }

    @Override
    public double area(double base, double altura) {
        this.base =base;
        this.altura = altura;
        resultado = base * altura;
        return  resultado;
    }

    @Override
    public String toString() {
        return "area = " + resultado +
                "\nbase = " + base +
                "\naltura = " + altura +
                "\ncor = " + cor();
    }
}
