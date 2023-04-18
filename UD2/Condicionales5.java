import java.util.Scanner;
public class Condicionales5 {
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        System.out.print("Indica un numero ");
        double a = lector.nextDouble();
        double b = lector.nextDouble();
        if (a > b)
            System.out.println(a + ", " + b);
        else
            System.out.println(b + ", " + a);
    }
}
