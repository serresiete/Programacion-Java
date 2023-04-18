import java.util.Scanner;
public class Condicionales12 {
    public static void main(String  args[]){
        Scanner lector = new Scanner(System.in);
        System.out.print("Dime un numero del 1 al 12: ");
        int mes = lector.nextInt();
        switch (mes){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("Este mes tiene 31 dias");
            break;
            case 4: case 6: case 9: case 11:
                System.out.println("Este mes tiene 30 dias");
            break;
            case 2:
                System.out.println("Febrero tiene 28 dias");
        }
    }    
}
