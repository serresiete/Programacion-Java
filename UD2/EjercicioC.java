import java.util.Scanner;
public class EjercicioC{
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        System.out.print("Dime un numero de horas: ");
        int horas = lector.nextInt();
        int seg = horas * 3600;
        System.out.print(horas + " horas son igual a " + seg + " segundos");
    } 
}