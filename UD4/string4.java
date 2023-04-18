import java.util.Scanner;
public class string4 {
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        System.out.print("Dime tu nombre: ");
        String n = lector.nextLine();
        System.out.print("Dime tu primer apellido: ");
        String a1 = lector.nextLine();
        System.out.print("Dime tu segundo apellido: ");
        String a2 = lector.nextLine();
        String c1 = n.substring(0, 3);
        String c2 = a1.substring(0, 3);
        String c3 = a2.substring(0, 3);
        String c = c1 + c2 + c3;
        String cod = c.toUpperCase();
        System.out.println("Tu código és: " + cod);
    }
}
