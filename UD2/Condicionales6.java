import java.util.Scanner;
public class Condicionales6 {
    public static void main(String args[]){
        System.out.println("Dime dos numeros: ");
        Scanner lector = new Scanner (System.in);
        int a = lector.nextInt();
        int b = lector.nextInt();
        if (a > b)
            System.out.println("El mayor es: " + a);
        else if (a < b)
            System.out.println("El mayor es: " + b);
        else if (a == b)
            System.out.println("Son iguales");
            
    }
}
