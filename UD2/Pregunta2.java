import java.util.Scanner;
public class Pregunta2{
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        System.out.print("Introduce un valor A: ");
        double a = lector.nextDouble();
        System.out.print("Introduce un valor B: ");
        double b = lector.nextDouble();
        int entA = (int) Math.round(a);
        int entB = (int) Math.round(b);
        System.out.println("El numero entero más proximo a A es: " + entA + " y el numero entero mas cercano a B es: " + entB);
        double maxAB = Math.max(a,b);
        double minAB = Math.min(a,b);
        System.out.println("El mayor de A y B es: " + maxAB + " y el menor es: " + minAB);
        int aleAB = (int) (Math.random()*(b - a + 1) + a);
        System.out.print("Un numero aleatorio entre A y B es: " + aleAB);
    } 
}
