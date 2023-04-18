import java.util.Scanner;
public class EjercicioA{
    public static void main(String args[]){
        Scanner lector  = new Scanner(System.in);
        System.out.print("Introduce un precio: ");
        int precio = lector.nextInt();
        double IVA = precio * 0.21;
        double PIVA = precio + IVA;
        System.out.println("El precio con IVA es: " + PIVA);
    }
}