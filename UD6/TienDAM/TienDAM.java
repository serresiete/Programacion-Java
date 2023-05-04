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
            case 1: // Menú de almacén
                menuAlmacen(salir);
                break;
            case 2: // Menú de pedidos

                break;
            case 3: // Salir
                salir = salir(salir);
                break;
        }
        return salir;
    }

    public void menuAlmacen(boolean salir) {
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
        // Llamamos al metodo de las opciones dandole el valor a salir
        salir = opcionesAlmacen(opcion);
    }

    public boolean opcionesAlmacen(int opcion) {
        boolean salir = false;
        switch (opcion) {
            case 1: // Ver los articulos

                break;
            case 2: // Buscar un articulo
                infobuscar();
                break;
            case 3: // Añadir un articulo
                infoañadir();
                break;
            case 4: // Quitar un articulo
                infoeliminar();
                break;
            case 5: // Modificar el precio de un articulo
                infoModificarPrecio();
                break;
            case 6: // Recibir un articulo
                inforecibir();
                break;
            case 7: // Devolver un articulo
                infodevolver();
                break;
        }
        return salir;
    }

    // Creamos un metodo para pedir la información para añadir un articulo
    public void infoañadir() {
        // Pedimos la información
        System.out.print("Dime el nombre del articulo: ");
        String nombre = lector.nextLine();
        System.out.print("Dime el precio que tiene: ");
        double precio = lector.nextDouble();
        System.out.print("Dime su tipo de IVA (general si es 21%, reducido si es 10% o superreducido si es 4%): ");
        String IVA = lector.nextLine();
        // Aqui creamos la variable del enumerado y le pasamos el String a un metodo que
        // comprueba que valor le tiene que dar
        porcentajes porcentaje = iva(IVA);
        System.out.print("Dime la cantidad que hay: ");
        int cantidad = lector.nextInt();
        // A través del objeto almacén llamamos al metodo de añadir articulo
        almacen.añadirArticulo(nombre, precio, porcentaje, cantidad);
    }

    // Todos los metodos siguen la misma estructura
    public void infoeliminar() {
        System.out.println("Dime el numero del articulo: ");
        int ID = lector.nextInt();
        almacen.eliminarArticulo(ID);
    }

    public void infobuscar() {
        System.out.print("Dime el nombre de lo que quieres buscar: ");
        String info = lector.nextLine();
        almacen.buscarArticulo(info);
    }

    public void infoModificarPrecio() {
        System.out.println("Dime el numero del articulo: ");
        int ID = lector.nextInt();
        System.out.println("Dime el nuevo precio del articulo " + ID + ": ");
        double precio = lector.nextDouble();
        almacen.ModificarPrecio(precio, ID);
    }

    public void inforecibir() {
        System.out.println("Dime el numero de articulo que quieres recibir: ");
        int ID = lector.nextInt();
        System.out.println("Perfecto, dime la cantidad que quieres recibir: ");
        int cantidad = lector.nextInt();
        almacen.recibir(ID, cantidad);
    }

    public void infodevolver() {
        System.out.println("Dime el numero de articulo que quieres devolver: ");
        int ID = lector.nextInt();
        System.out.println("Perfecto, dime la cantidad que quieres devolver: ");
        int cantidad = lector.nextInt();
        almacen.devolver(ID, cantidad);
    }

    // Aquí son metodos distintos
    // Cambiamos el valor del enumerado iva dependiendo de una cosa u otra
    public porcentajes iva(String iva) {
        // Creamos la variable y le damos un valor inicial
        porcentajes porcentaje = porcentajes.ventiuno;
        // Transformamos el String a minusculas y sin espacios para no dar lugar a
        // errores
        iva.toLowerCase().trim();
        // Le damos un valor u otro al enumerado
        if (iva.equals("general")) {
            porcentaje = porcentajes.ventiuno;
        } else if (iva.equals("reducido")) {
            porcentaje = porcentajes.diez;
        } else if (iva.equals("superreducido")) {
            porcentaje = porcentajes.cuatro;
            // En el caso de que diga otra cosa mostramos un mensaje de error
        } else {
            System.out.println("Nombre no valido, asegurate de haber escrito todo bien.");
        }
        // Devolvemos el valor de porcentaje para poder usarlo en el metodo principal
        return porcentaje;
    }

    public boolean salir(boolean salir) { // Metodo para salir
        System.out.println("Hasta pronto!!!");
        // Ponemos salir = true para que el bucle acabe
        salir = true;
        // Devolvemos el valor de salir al metodo principal
        return salir;
    }
}
