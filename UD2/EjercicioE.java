import java.util.Scanner;
public class EjercicioE {
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        System.out.print("Dime un numero de horas: ");
        int horas = lector.nextInt();
        int sem = (horas/24)/7;
        int dias = (horas/24)%7;
        System.out.println(horas + " horas son: " + sem + " semana/s + " + dias + " dia/s");
    }
}