package TienDAM;

//Importamos la clase Scanner
import java.util.Scanner;

public class TienDAM {
    // Creamos una variable escaner estática de escaner
    static Scanner lector = new Scanner(System.in);
    // Y otra estatica también de almacén
    static almacen almacen = new almacen();

    public static void main(String[] args) {

    }

    public int menu() {
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
    public boolean opciones(int opcion) {
        boolean salir = false;
        switch (opcion) {
            case 1: // Ver Cuentas

                break;
            case 2: // Ingresar dinero a x cuenta

                break;
            case 3: // Retirar dinero de x cuenta
                salir = salir(salir);
                break;
        }
        return salir;
    }

    public void menuAlmacen() {
        // Creamos una variable para guardar la opción que vamos a escoger
        int opcion;
        // Mostramos las opciones
        System.out.println("");
        System.out.println("----------------------");
        System.out.println("1. Ver");
        System.out.println("2. Buscar");
        System.out.println("3. Añadir");
        System.out.println("4. Quitar");
        System.out.println("5. Modificar");
        System.out.println("6. Recibir");
        System.out.println("7. Devolver");
        System.out.println("");
        System.out.println("----------------------");
        // Le pedimos al usuario que escoja la opción que quiera
        System.out.print("Que opción quieres hacer? ");
        opcion = lector.nextInt();
    }

    public boolean opcionesAlmacen(int opcion) {
        boolean salir = false;
        switch (opcion) {
            case 1: // Ver los articulos
                
                break;
            case 2: // Buscar un articulo
                
                break;
            case 3: // Añadir un articulo
                infoañadir();
                break;
            case 4: // Quitar un articulo

                break;
            case 5: // Modificar un articulo

                break;
            case 6: // Recibir un articulo

                break;
            case 7: // Devolver un articulo

                break;
        }
        return salir;
    }

    public void infoañadir() {
        System.out.print("Dime el nombre del articulo: ");
        String nombre = lector.nextLine();
        System.out.print("Dime el precio que tiene: ");
        double precio = lector.nextDouble();
        System.out.print("Dime su tipo de IVA (general si es 21%, reducido si es 10% o superreducido si es 4%): ");
        String IVA = lector.nextLine();
        porcentajes porcentaje = iva(IVA);
        System.out.print("Dime la cantidad que hay: ");
        int cantidad = lector.nextInt();
        almacen.añadirArticulo(nombre, precio, porcentaje, cantidad);
    }

    public void infobuscar() {
        System.out.print("Dime el nombre de lo que quieres buscar: ");
        String info = lector.nextLine();
        almacen.buscarArticulo(info);
    }

    public porcentajes iva(String iva) {
        porcentajes porcentaje = porcentajes.ventiuno;
        iva.toLowerCase().trim();
        if(iva.equals("general")){
            porcentaje = porcentajes.ventiuno;
        } else if(iva.equals("reducido")){
            porcentaje = porcentajes.diez;
        }else if (iva.equals("superreducido")){
            porcentaje = porcentajes.cuatro;
        }else{
            System.out.println("Nombre no valido, asegurate de haber escrito todo bien.");
        }
        return porcentaje;
    }

    public boolean salir(boolean salir) { // Metodo para salir
        System.out.println("Hasta pronto!!!");
        salir = true;
        return salir;
    }
}
