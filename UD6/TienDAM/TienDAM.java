package TienDAM;

import java.util.InputMismatchException;
//Importamos la clase Scanner
import java.util.Scanner;
 
public class TienDAM {
    // Creamos una variable escaner estática de escaner
    static Scanner lector = new Scanner(System.in);
    // Y otra estatica también de almacén
    static almacen almacen = new almacen();
    // Y otra boolean para manejar las excepciones´
    static boolean excepciones = false;

    public static void main(String[] args) {
        boolean salir = false;
        int opcion = 0;
        while (!salir) {
            opcion = menu();
            salir = opciones(opcion);
        }
    }

    public static int menu() {
        // Creamos una variable para guardar la opción que vamos a escoger
        int opcion;
        // Mostramos las opciones
        System.out.println("");
        System.out.println("----------------------");
        System.out.println("1. Almacen");
        System.out.println("2. Salir");
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
        switch (opcion) { // IllegalArgumentException
            case 1: // Menú de almacén
                menuAlmacen(salir);
                break;

            case 2: // Salir
                salir = salir(salir);
                break;
        }
        return salir;
    }

    public static void menuAlmacen(boolean salir) {
        // Creamos una variable para guardar la opción que vamos a escoger
        int opcion;
        // Mostramos las opciones
        System.out.println("");
        System.out.println("----------------------");
        System.out.println("1. Ver los articulos");
        System.out.println("2. Buscar un articulo");
        System.out.println("3. Añadir un articulo");
        System.out.println("4. Quitar un articulo");
        System.out.println("5. Modificar el precio de un articulo");
        System.out.println("6. Recibir un articulo");
        System.out.println("7. Devolver un articulo");
        System.out.println("----------------------");
        System.out.println("");
        // Le pedimos al usuario que escoja la opción que quiera
        System.out.print("Que opción quieres hacer? ");
        opcion = lector.nextInt();
        // Llamamos al metodo de las opciones dandole el valor a salir
        salir = opcionesAlmacen(opcion);
    }

    public static boolean opcionesAlmacen(int opcion) {
        boolean salir = false;
        switch (opcion) { // IllegalArgumentException
            case 1: // Ver los articulos
                infover();
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

    // Creamos un metodo para llamar al metodo mostrar de almacen.
    public static void infover() {
        System.out.println("Aqui tienes todos los articulos por el momento: ");
        System.out.println("");
        almacen.imprimir();
    }

    // Creamos un metodo para pedir la información para añadir un articulo
    public static void infoañadir() {
        String nombre = "";
        double precio = 0;
        String IVA = "";
        porcentajes porcentaje = porcentajes.ventiuno;
        int cantidad = 0;
        // Pedimos la información
        System.out.print("Dime el nombre del articulo: ");
        lector.nextLine();
        nombre = lector.nextLine(); // InputMissMatchException
        excepciones = true;
        excepciones = false;
        while (!excepciones) {
            try {
                System.out.print("Dime el precio que tiene: ");
                precio = lector.nextDouble(); // InputMissMatchException
                excepciones = true;
            } catch (InputMismatchException e) {
                System.err.println("Dato no válido. Escriba solo números.");
                lector.nextLine(); // Limpiamos el búfer del scanner
            }
        }
        excepciones = false;
        System.out.print("Dime su tipo de IVA (general si es 21%, reducido si es 10% o superreducido si es 4%): ");
        lector.nextLine();
        IVA = lector.nextLine(); // InputMissMatchException
        // Aqui creamos la variable del enumerado y le pasamos el String a un metodo que
        // comprueba que valor le tiene que dar
        porcentaje = iva(IVA);
        while (!excepciones) {
            try {
                System.out.print("Dime la cantidad que hay: ");
                cantidad = lector.nextInt(); // InputMissMatchException
                excepciones = true;
            } catch (InputMismatchException e) {
                System.err.println("Dato no válido. Escriba solo números.");
                lector.nextLine(); // Limpiamos el búfer del scanner
            }
        }
        excepciones = false;

        // A través del objeto almacén llamamos al metodo de añadir articulo
        almacen.añadirArticulo(nombre, precio, porcentaje, cantidad);
    }

    // Todos los metodos siguen la misma estructura
    public static void infoeliminar() {
        // Hacemos un bucle para repetir el metodo en caso de error
        while (!excepciones) {
            try {
                System.out.print("Dime el número del artículo: ");
                int ID = lector.nextInt();
                lector.nextLine(); // Limpiamos el búfer del scanner

                almacen.eliminarArticulo(ID);

                excepciones = true;
            } catch (InputMismatchException e) {
                System.err.println("Dato no válido. Escriba solo números.");
                lector.nextLine(); // Limpiamos el búfer del scanner
            }
        }
        excepciones = false;
    }

    public static void infobuscar() {
        while (!excepciones) {
            try {
                System.out.print("Dime el nombre de lo que quieres buscar: ");
                lector.nextLine(); // Limpiamos el búfer del scanner
                String info = lector.nextLine();

                almacen.buscarArticulo(info);

                excepciones = true;
            } catch (InputMismatchException e) {
                System.err.println("Dato no válido. Escriba solo texto.");
                lector.nextLine(); // Limpiamos el búfer del scanner
            }
        }
        excepciones = false;
    }

    public static void infoModificarPrecio() {
        int ID = 0;

        while (!excepciones) {
            try {
                System.out.print("Dime el número del artículo: ");
                ID = lector.nextInt();
                excepciones = true;
            } catch (InputMismatchException e) {
                System.err.println("Dato no válido. Escriba solo números.");
                lector.nextLine(); // Limpiamos el búfer del scanner
            }
        }

        excepciones = false;

        while (!excepciones) {
            try {
                System.out.print("Dime el nuevo precio del artículo " + ID + ": ");
                double precio = lector.nextDouble();
                lector.nextLine(); // Limpiamos el búfer del scanner

                almacen.ModificarPrecio(precio, ID);

                excepciones = true;
            } catch (InputMismatchException e) {
                System.err.println("Dato no válido. Escriba solo números (pueden ser decimales).");
                lector.nextLine(); // Limpiamos el búfer del scanner
            }
        }
        excepciones = false;
    }

    public static void inforecibir() {
        int ID = 0;

        while (!excepciones) {
            try {
                System.out.print("Dime el número de artículo que quieres recibir: ");
                ID = lector.nextInt();
                excepciones = true;
            } catch (InputMismatchException e) {
                System.err.println("Dato no válido. Escriba solo números.");
                lector.nextLine(); // Limpiamos el búfer del scanner
            }
        }

        excepciones = false;

        while (!excepciones) {
            try {
                System.out.print("Perfecto, dime la cantidad que quieres recibir: ");
                int cantidad = lector.nextInt();
                lector.nextLine(); // Limpiamos el búfer del scanner

                almacen.recibir(ID, cantidad);

                excepciones = true;
            } catch (InputMismatchException e) {
                System.err.println("Dato no válido. Escriba solo números (pueden ser decimales).");
                lector.nextLine(); // Limpiamos el búfer del scanner
            }
        }
        excepciones = false;
    }

    public static void infodevolver() {
        int ID = 0;

        while (!excepciones) {
            try {
                System.out.print("Dime el número de artículo que quieres devolver: ");
                ID = lector.nextInt();
                excepciones = true;
            } catch (InputMismatchException e) {
                System.err.println("Dato no válido. Escriba solo números.");
                lector.nextLine(); // Limpiamos el búfer del scanner
            }
        }

        excepciones = false;

        while (!excepciones) {
            try {
                System.out.print("Perfecto, dime la cantidad que quieres devolver: ");
                int cantidad = lector.nextInt();
                lector.nextLine(); // Limpiamos el búfer del scanner

                almacen.devolver(ID, cantidad);

                excepciones = true;
            } catch (InputMismatchException e) {
                System.err.println("Dato no válido. Escriba solo números (pueden ser decimales).");
                lector.nextLine(); // Limpiamos el búfer del scanner
            }
        }
        excepciones = false;

    }

    // Aquí son metodos distintos
    // Cambiamos el valor del enumerado iva dependiendo de una cosa u otra
    public static porcentajes iva(String iva) {
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
            System.err.println("Nombre no valido, asegurate de haber escrito todo bien.");
        }
        // Devolvemos el valor de porcentaje para poder usarlo en el metodo principal
        return porcentaje;
    }

    public static boolean salir(boolean salir) { // Metodo para salir
        System.out.println("Hasta pronto!!!");
        // Ponemos salir = true para que el bucle acabe
        salir = true;
        // Devolvemos el valor de salir al metodo principal
        return salir;
    }
}
