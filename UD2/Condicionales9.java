import java.util.Scanner;
public class Condicionales9 {
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        System.out.print("Dime dos numeros: ");
        int a = lector.nextInt();
        int b = lector.nextInt();
        if (b % a == 0)
            System.out.println("A es multiplo de B");
        else if (a % b == 0)
            System.out.println("B es multiplo de A");
        else if (a % b != 0 && b % a != 0 )
            System.out.println("Ni A ni B son multiplos uno del otro");
    }
}

