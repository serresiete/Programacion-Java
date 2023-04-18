import java.util.Scanner;
public class Condicionales4 {
    public static void main(String args[]){
        Scanner lector = new Scanner (System.in);
        System.out.print("Indica un numero ");
        double a = lector.nextDouble();
        if (a < 0)
            System.out.println("Es negativo");
        else
            System.out.println("Es positivo");
    }
}
