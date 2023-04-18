import java.util.Scanner;
public class Condicionales13 {
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        System.out.print("Dime cuantos grados hace: ");
        int temp = lector.nextInt();
        if (temp < 10)
            System.out.println("Frio");
        else if (temp >= 10 && temp <= 19)
            System.out.println("Templado");
        else if (temp > 19 && temp <= 29)
            System.out.println("Caluroso");
        else if (temp > 29)
            System.out.println("Tropical");
    }
}
