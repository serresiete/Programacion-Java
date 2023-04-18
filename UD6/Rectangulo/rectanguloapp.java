package Rectangulo;

public class rectanguloapp {
    public static void main(String[] args) {
        rectangulo r1 = new rectangulo();
        rectangulo r2 = new rectangulo();
        int x1R1, x1R2, y1R1, y1R2, x2R1, x2R2, y2R1, y2R2;
        x1R1 = 0;
        y1R1 = 0;
        x2R1 = 5;
        y2R1 = 5;
        x1R2 = 7;
        y1R2 = 9;
        x2R2 = 2;
        y2R2 = 3;
        int baseR1 = 5;
        int alturaR1 = 5;
        int baseR2 = 5;
        int alturaR2 = 6;
        r1.setCoordenadas1(x1R1, y1R1, x2R1, y2R1);
        r2.setCoordenadas1(x1R2, y1R2, x2R2, y2R2);
        int perimetro1 = r1.perimetro(baseR1, alturaR1);
        int area1 = r1.area(baseR1, alturaR1);
        int perimetro2 = r2.perimetro(baseR2, alturaR2);
        int area2 = r2.area(baseR2, alturaR2);
        System.out.println("Los datos del rectangulo 1 son los siguientes");
        System.out.println("Coordenada de la esquina inferior izquierda: " + r1.getx1() + ", " + r1.getY1() + ".");
        System.out.println("Coordenada de la equina superior derecha: " + r1.getx2() + ", " + r1.getY2() + ".");
        System.out.println("El perimetro es: " + perimetro1);
        System.out.println("El area es: " + area1);
        System.out.println("---------------------------------------------");
        System.out.println("Los datos del rectangulo 2 son los siguientes");
        System.out.println("Coordenada de la esquina inferior izquierda: " + r2.getx1() + ", " + r2.getY1() + ".");
        System.out.println("Coordenada de la equina superior derecha: " + r2.getx2() + ", " + r2.getY2() + ".");
        System.out.println("El perimetro es: " + perimetro2);
        System.out.println("El area es: " + area2);
    }
}
