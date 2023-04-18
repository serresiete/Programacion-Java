/*Jorge Sierra García */
package Proy3;

import java.util.Scanner;

public class InstiApp {
    // Creamos una variable scanner estatica
    static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {
        // Creamos las variables necesarias.
        boolean salir = false;
        int opcion;
        // Creamos los dos objetos de tipo array que pide el ejercicio

        // Cada uno tendrá un máximo de 30 elementos
        estudiante[] DAM1 = new estudiante[30];
        estudiante[] DAM2 = new estudiante[30];
        // Creamos un bucle con salir para que se haga hasta que el usuario ponga salir
        while (!salir) {
            // Llamamos al metodo menú y le asignamos a opción el valor que haya dado el
            // usuario
            opcion = menu();
            salir = opciones(opcion, DAM1, DAM2);
        }
    }

    // Primero creamos un metodo con un menú para saber si quiere modificar 1º de
    // DAM o 2º
    public static int menu() {
        // Creamos una variable para que el usario introduzca la opción que quiera
        int opcion;
        // Imprimimos el menú
        System.out.println("1. 1º de DAM");
        System.out.println("2. 2º de DAM");
        System.out.println("3. Salir");
        // Pedimos datos
        System.out.println("A que curso quieres entrar? ");
        opcion = lector.nextInt();
        // Devolvemos el valor opción
        return opcion;
    }

    // Hacemos un metodo que nos devuelva el valor de salir y haga un switch con las
    // opciones
    public static boolean opciones(int opcion, estudiante DAM1[], estudiante DAM2[]) {
        // Hacemos que salir sea falso desde un principio
        boolean salir = false;
        // Hacemos el switch
        switch (opcion) {
            case 1: // Menú de 1º de DAM
                menuPrimero(DAM1);
                break;
            case 2: // Menú de 2º de DAM
                menuSegundo(DAM2);
                break;
            case 3: // Salir
                salir = salir(salir);
                break;
        }
        // Devolvemos el valor de salir
        return salir;
    }

    // Creamos un metodo menú para que el usuario elija la opción que quiera
    // Tenemos que crear un menú para primero y otro para segundo para hacerlo mas
    // fácil
    public static void menuPrimero(estudiante array[]) {
        // Creamos una variable para que el usario introduzca la opción que quiera
        int opcion;
        // Imprimimos el menú
        System.out.println("1. Ver datos");
        System.out.println("2. Añadir alumno/a");
        System.out.println("3. Expulsar alumno");
        System.out.println("4. Editar datos de un alumno");
        System.out.println("5. Mostrar datos de un alumno");
        // Pedimos datos
        System.out.println("Que opción quieres hacer? ");
        opcion = lector.nextInt();
        // Llamamos al metodo de opciones de este submenú
        opcionesPrimero(opcion, array);
    }

    // Hacemos un metodo que nos devuelva el valor de salir y haga un switch con las
    // opciones
    public static void opcionesPrimero(int opciones, estudiante array[]) {
        switch (opciones) {
            case 1:
                // Aquí de momento no ponemos nada ya que este metodo aun no está
                System.out.println("Aun no está disponible esta opcion, intentalo mas tarde");
                break;
            case 2: // Crear un estudiante
                estudiante.crear(array);
                break;
            case 3: // Eliminar un estudiante
                estudiante.eliminar(array);
                break;
            case 4: // Editar los datos de un estudiante
                estudiante.editar(array);
                break;
            case 5: // Mostrar los datos de un estudiante especifico
                estudiante.unalumno(array);
                break;
        }
    }

    public static void menuSegundo(estudiante array[]) {
        // Creamos una variable para que el usario introduzca la opción que quiera
        int opcion;
        // Imprimimos el menú
        System.out.println("1. Ver datos");
        System.out.println("2. Añadir alumno/a");
        System.out.println("3. Expulsar alumno");
        System.out.println("4. Editar datos de un alumno");
        System.out.println("5. Mostrar datos de un alumno");
        // Pedimos datos
        System.out.println("Que opción quieres hacer? ");
        opcion = lector.nextInt();
        // Llamamos al metodo de las opciones del submenú
        opcionesSegundo(opcion, array);
    }

    // Hacemos un metodo que nos devuelva el valor de salir y haga un switch con las
    // opciones
    public static void opcionesSegundo(int opciones, estudiante array[]) {
        switch (opciones) {
            case 1:
                // Aquí de momento no ponemos nada ya que este metodo aun no está
                System.out.println("Aun no está disponible esta opcion, intentalo mas tarde");
                break;
            case 2: // Crear un estudiante
                estudiante.crear(array);
                break;
            case 3: // Eliminar un estudiante
                estudiante.eliminar(array);
                break;
            case 4: // Editar los datos de un estudiante
                estudiante.editar(array);
                break;
            case 5: // Mostrar los datos de un estudiante especifico
                estudiante.unalumno(array);
                break;
        }
    }

    public static boolean salir(boolean salir) { // Metodo para salir
        // Mensaje de despedida y devolvemos salir igual a true
        System.out.println("Hasta pronto!!!");
        salir = true;
        return salir;
    }
}
