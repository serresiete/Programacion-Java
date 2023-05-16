package AppFarmacia;

//Importamos la clase Scanner
import java.util.Scanner;
//Importamos las clases del proyecto correspondientes
import AppFarmacia.medicamentos;

public class menu {
    static Scanner lector = new Scanner(System.in);
    static int contM = 0;
    // Creamos un metodo para el menú
    public int Menu() {
        // Creamos una variable para guardar la opción que vamos a escoger
        int opcion;
        // Mostramos las opciones
        System.out.println("1. Menú de trabajadores");
        System.out.println("2. Menú de medicamentos");
        System.out.println("3. Mirar dinero de la cuenta");
        System.out.println("4. Salir");
        // Le pedimos al usuario que escoja la opción que quiera
        System.out.print("Que opción quieres hacer? ");
        opcion = lector.nextInt();
        // Devolvemos el valor al main
        return opcion;
    }

    // Y ahora creamos un metodo para hacer el switch para hacer una opción u otra
    public boolean opciones(int opcion, double dinero, medicamentos array[]) {
        boolean salir = false;
        switch (opcion) {
            case 1: // Menú de trabajadores
                menuTrabajadores(salir, array);
                break;
            case 2: // Menú de medicamentos
                menuMedicamentos(salir, dinero, array);
                break;
            case 3: // Mostrar el dinero
                dinero(dinero);
                break;

            case 4: // Salir
                salir = salir(salir);
                break;
        }
        return salir;
    }

    public void menuTrabajadores(boolean salir, medicamentos array[]) {
        // Estos dos metodos son iguales que el primer menú con alguna pequeña
        // diferencia
        // Creamos una variable para guardar la opción que vamos a escoger
        int opcion;
        // Mostramos las opciones
        System.out.println("1. Ver datos");
        System.out.println("2. Contratar o despedir a alguien");
        System.out.println("3. Ascender a alguien");
        System.out.println("4. ");
        System.out.println("5. Salir");
        // Le pedimos al usuario que escoja la opción que quiera
        System.out.print("Que opción quieres hacer? ");
        opcion = lector.nextInt();
        // Llamamos al metodo de opciones correspondiente
        salir = opcionesTrabajador(opcion, array);
    }

    public void menuMedicamentos(boolean salir, double dinero, medicamentos array[]) {
        // Creamos una variable para guardar la opción que vamos a escoger
        int opcion;
        // Mostramos las opciones
        System.out.println("1. Ver datos");
        System.out.println("2. Añadir o suprimir medicamentos");
        System.out.println("3. Comprar medicamentos");
        System.out.println("4. Mostrar medicamentos sin stock");
        System.out.println("5. Salir");
        // Le pedimos al usuario que escoja la opción que quiera
        System.out.print("Que opción quieres hacer? ");
        opcion = lector.nextInt();
        // Llamamos al metodo de opciones correspondiente
        salir = opcionesMedicamentos(opcion, dinero, array);
    }

    // Metodo para las opciones del primer menú (trabajadores)
    public boolean opcionesTrabajador(int opcion, medicamentos array[]) {
        boolean salir = false;
        switch (opcion) {
            case 1: // Caso 1
                break;
            case 2: // Caso 2
                SubmenuTrabajadores(array);
                break;
            case 3: // Caso 3

                break; 
            case 4: // Caso 4

                break;
            case 5: // Salir
                salir = salir(salir);
                break;
        }
        return salir;
    }

    // Metodo para las opciones del segundo menú (medicamentos)
    public boolean opcionesMedicamentos(int opcion, double dinero, medicamentos array[]) {
        boolean salir = false;
        switch (opcion) {
            case 1: // Mostrar los datos del array
                medicamentos.ver(array);
                break;
            case 2: // Submenú para agregar o quitar un elemento del array
                SubmenuMedicamentos(array);
                break;
            case 3: // Comprar medicamentos
                medicamentos.comprar(array, dinero);
                break;
            case 5: // Mostrar los medicamentos sin stock
                medicamentos.SinStock(array);
                break;
            case 4: // Salir
                salir = salir(salir);
                break;
        }
        return salir;
    }

    // Método para mostrar el dinero de la cuenta
    public void dinero(double dinero) {
        System.out.println("El dinero total de la cuenta es: " + dinero);
    }

    // Metodos para un submenú para saber si agregar o eliminar algún elemento de
    // medicamentos
    public void SubmenuMedicamentos(medicamentos array[]) {
        // Creamos una variable para guardar la opción que vamos a escoger
        int opcion;
        // Mostramos las opciones
        System.out.println("1. Añadir un nuevo medicamento");
        System.out.println("2. Suprimir un medicamento");
        // Le pedimos al usuario que escoja la opción que quiera
        System.out.print("Que opción quieres hacer? ");
        opcion = lector.nextInt();
        // Llamamos al metodo de opciones correspondiente
        opcionesSubMedicamentos(opcion, array);
    }

    // Metodo para las opciones del submenú de medicamentos
    public void opcionesSubMedicamentos(int opcion, medicamentos array[]) {
        switch (opcion) {
            case 1: // Agregar un elemento al array
                medicamentos.crear(array);
                break;
            case 2: // Eliminar un elemento del array
                medicamentos.eliminarMedicamentos(array);
                break;
        }
    }

    // Metodos para un submenú para saber si agregar o eliminar algún elemento de
    // trabajadores
    public void SubmenuTrabajadores(medicamentos array[]) {
        // Creamos una variable para guardar la opción que vamos a escoger
        int opcion;
        // Mostramos las opciones
        System.out.println("1. Contratar a un trabajador");
        System.out.println("2. Despedir a un trabajador");
        // Le pedimos al usuario que escoja la opción que quiera
        System.out.print("Que opción quieres hacer? ");
        opcion = lector.nextInt();
        // Llamamos al metodo de opciones correspondiente
        opcionesSubTrabajadores(opcion, array);
    }

    // Metodo para las opciones del submenú de medicamentos
    public void opcionesSubTrabajadores(int opcion, medicamentos array[]) {
        switch (opcion) {
            case 1: // Agregar un elemento al array

                break;
            case 2: // Eliminar un elemento del array

                break;
        }
    }
    public boolean salir(boolean salir) { // Metodo para salir
        System.out.println("Hasta pronto!!!");
        salir = true;
        return salir;
    }
}