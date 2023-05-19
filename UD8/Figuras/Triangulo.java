package UD8.Figuras;

public class Triangulo extends Figura{
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        setAltura(altura);
        setBase(base);
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double area() {
        double area = (base*altura)/2;
        return area;
    }
}
