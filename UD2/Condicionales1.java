import java.util.Scanner;
public class Condicionales1 {
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        System.out.print("Dime tu edad: ");
        int edad = lector.nextInt();
        if (edad >= 18)
            System.out.println("Eres mayor de edad");
    }
}
