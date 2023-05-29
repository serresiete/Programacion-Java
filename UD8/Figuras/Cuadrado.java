package UD8.Figuras;

public class Cuadrado extends Figura{
    private double lado;

    public Cuadrado(double lado) {
        setLado(lado);
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    public double getLado() {
        return lado;
    }

    @Override
    public double area(){
        double area = lado*lado;
        return area;
    }

    
}
