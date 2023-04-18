import java.util.Scanner;
public class Condicionales7 {
    public static void main(String args[]){
        System.out.println("Dime tres numeros: ");
        Scanner lector = new Scanner (System.in);
        int a = lector.nextInt();
        int b = lector.nextInt();
        int c = lector.nextInt();
        if (a > b && a > c)
            System.out.println("El mayor es: " + a);
        else if (b > c)
            System.out.println("El mayor es: " + b);
        else if (c > b)
            System.out.println("El mayor es: " + c);
        else if (a == b && b== c)
            System.out.println("Son iguales");
        else if ((a < b && a < c) && b == c)
            System.out.println("El mayor es: " + b);
    }
}
