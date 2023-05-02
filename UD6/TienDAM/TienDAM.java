package TienDAM;
//Importamos la clase Scanner
import java.util.Scanner;

public class TienDAM {
    //Creamos una variable escaner estática de escaner
    static Scanner lector = new Scanner(System.in); 
    public static void main(String[] args) {
        
    }

    public static int menu() {
        // Creamos una variable para guardar la opción que vamos a escoger
        int opcion;
        // Mostramos las opciones
        System.out.println("");
        System.out.println("----------------------");
        System.out.println("1. Almacen");
        System.out.println("2. Pedido");
        System.out.println("3. Salir");
        System.out.println("");
        System.out.println("----------------------");
        // Le pedimos al usuario que escoja la opción que quiera
        System.out.print("Que opción quieres hacer? ");
        opcion = lector.nextInt();
        // Devolvemos el valor al main
        return opcion;
    }

    // Y ahora creamos un metodo para hacer el switch para hacer una opción u otra
    public static boolean opciones(int opcion) {
        boolean salir = false;
        switch (opcion) {
            case 1: // Ver Cuentas

                break;
            case 2: // Ingresar dinero a x cuenta

                break;
            case 3: // Retirar dinero de x cuenta

                break;
            case 4: // Crear cuenta
                
                break;
            case 5: // Eliminar cuenta
                
                break;
            case 6: // Buscar cuenta
                
                break;
            case 7: // Mostrar morosos
            
                break;
            case 8: // Salir

                break;
        }
        return salir;
    }
}
