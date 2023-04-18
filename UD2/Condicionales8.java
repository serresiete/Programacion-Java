import java.util.Scanner;
public class Condicionales8 {
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        System.out.print("Dime dos numeros: ");
        int a = lector.nextInt();
        int b = lector.nextInt();
        if (b % a == 0)
            System.out.println("A es multiplo de B");
        else
            System.out.println("A no es multiplo de B");
    }
}
