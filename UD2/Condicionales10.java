import java.util.Scanner;
public class Condicionales10 {
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        System.out.print("Dime dos numeros: ");
        double a = lector.nextDouble();
        double b = lector.nextDouble();
        double mult = a*b;
        double suma = a+b;
        double rest = a-b;
        double div = a/b;
        if (b == 0)
            System.out.println("Suma: " + suma + " Resta: " + rest + " Multiplicación: " + mult + " División: No se puede hacer");
        else
        System.out.println(" Suma: " + suma + " Resta: " + rest + " Multiplicación: " + mult + " División: " + div);
    }
}
