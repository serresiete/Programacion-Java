package UD8.Figuras;

public class Figura {
    protected double lado;

    public Figura() {
        
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    public double getLado() {
        return lado;
    }
    
    public double area(){
        double area = lado*lado;
        return area;
    }
}
