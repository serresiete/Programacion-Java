import java.util.Scanner;
public class Beta3 {
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        int i = 1;
        int p = 0;
        int n = 0;
        do {
            System.out.print("Dime un numero: ");
             i = lector.nextInt();
             if (i > 0)
                p++;
            else if (i < 0)
                n++;
        }while(i != 0 );
        System.out.println("El numero de numeros positivos es: " + p);
        System.out.println("El numero de numeros negativos es: " + n);
    }
}
