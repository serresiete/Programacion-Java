package Punto;

public class puntoapp {
    public static void main(String[] args) {
        // Instanciamos los tres puntos
        punto p1 = new punto();
        punto p2 = new punto();
        punto p3 = new punto();

        p1.x = 5;
        p1.y = 0;
        p2.x = 10;
        p2.y = 10;
        p3.x = -3;
        p3.y = 7;
        System.out.println("Las coordenadas de el punto 1 son: " + p1.x + ", " + p1.x);
        System.out.println("Las coordenadas de el punto 1 son: " + p2.x + ", " + p2.x);
        System.out.println("Las coordenadas de el punto 1 son: " + p3.x + ", " + p3.x);
    }
}
