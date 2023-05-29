package UD8.Figuras;

import java.util.ArrayList;

public class ProgramaFiguras {
    public static void main(String[] args) {
    ArrayList<Figura> figuras = new ArrayList<Figura>();
    figuras.add(new Circulo(10)); // Radio=10
    figuras.add(new Cuadrado(10)); // Lado=10
    figuras.add(new Triangulo(10,5)); // Base=10, Altura=5;
    figuras.add(new Rectangulo(10, 5)); // Base=10, Altura=5;
    for (Figura f: figuras)
    System.out.println("Área: " + f.area());
    }
    }
