import java.util.Scanner;
public class Beta4 {
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        int i = 1;
        int d = 0;
        int s = 0;
        double m = 0;
        double c  = 0;
        do{
            System.out.print("Dime una nota del 1 al 10: ");
            i = lector.nextInt();
            if (i >= 0){
                c++;
                if (i == 10);
                    d = 1;
                s += i;
            }
            else if (i < -1)
            System.out.println("Introduce un numero valido");
            if (i > 10)
            System.out.println("Introduce un numero valido");
        }while (i != -1);
        m = s/c;
        if (d == 1)
            System.out.println( "La media es: " + m + ", ha habido algún 10 y la suma de todas las notas es: " + s);
        else if (d == 0)
        System.out.println( "La media es: " + m + ",  no ha habido ningún 10 y la suma de todas las notas es: " + s);
    }
}
