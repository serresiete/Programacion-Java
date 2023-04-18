import java.util.Scanner;
public class EjercicioB{
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        System.out.print("Cual es el radio del circulo? ");
        int radio = lector.nextInt();
        double area = (radio * radio) * 3.14159;
        System.out.println("El area del circulo es: " + area + " metros cuadrados");
    }
    
}