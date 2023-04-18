import java.util.Scanner;
public class EjercicioD{
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        System.out.print("Dime un numero de horas: ");
        int horas = lector.nextInt();
        int dias = horas/24;
        int sem = dias/7;
        System.out.println(horas + " horas son " + dias + " dias y " + sem + " semanas");
    }
    
}