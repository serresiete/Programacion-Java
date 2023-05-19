package UD8.Figuras;

public class Circulo extends Figura{
    private double radio;
    private final double pi = Math.PI;

    public Circulo(double radio) {
        setRadio(radio);
    }

    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double area() {
        double area = pi*(radio*radio);
        return area;
    }
}
