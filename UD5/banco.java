 import java.util.Scanner;

public class banco {
    // Creamos los arrays y el contador de forma estatica para que sirva para todos
    // los metodos junto con el lector del escaner
    static String[] nombres = new String[100];
    static double[] saldo = new double[100];
    static int cont = 0;
    static Scanner lector = new Scanner(System.in);

    // Creamos un metodo para el menú
    public static int menu() {
        // Creamos una variable para guardar la opción que vamos a escoger
        int opcion;
        // Mostramos las opciones
        System.out.println("1. Ver Cuentas");
        System.out.println("2. Ingresar Dinero");
        System.out.println("3. Retirar Dinero");
        System.out.println("4. Añadir Cuenta");
        System.out.println("5. Borrar Cuenta");
        System.out.println("6. Buscar Cuenta");
        System.out.println("7. Mostrar morosos");
        System.out.println("8. Salir");
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
                ver();
                break;
            case 2: // Ingresar dinero a x cuenta
                ingresar();
                break;
            case 3: // Retirar dinero de x cuenta
                retirar();
                break;
            case 4: // Crear cuenta
                crear();
                break;
            case 5: // Eliminar cuenta
                eliminar();
                break;
            case 6: // Buscar cuenta
                buscar();
                break;
            case 7: // Mostrar morosos
                morosos();
                break;
            case 8: // Salir
                salir = salir(salir);
                break;
        }
        return salir;
    }

    public static void ver() { // Metodo para ver las cuentas que hay
        // Creamos una condición para que muestre solo el mensaje cuando hay cuentas
        if (cont != 0) {
            // Recorremos el bucle y lo mostramos por pantalla
            for (int i = 0; i < cont; i++) {
                System.out.println((i + 1) + ". " + nombres[i] + ": " + saldo[i] + " €");
            }
        } else {
            // Si no hay cuentas pedimos que muestre este mensaje
            System.out.println("No hay ninguna cuenta, pulsa la opción 4 para crear una");
        }
    }

    public static void ingresar() { // Metodo para ingresar dinero
        // Pedimos el numero de cuenta y lo que quiera ingresar para introducirlo
        System.out.print("Dime el numero de cuenta: ");
        int e = lector.nextInt();
        System.out.print("Cuanto dinero quieres ingresar en la cuenta " + e + "?");
        double x = lector.nextInt();
        // Añadimos el saldo a la cuenta (la posición es la "e-1" porque para el usuario
        // la primera cuenta es la 1 pero en el programa la primera cuenta es la 0)
        int posicion = e - 1;
        saldo[posicion] = suma(saldo[posicion], x);
    }

    public static void retirar() { // Metodo para retirar dinero
        // Este metodo es ecactamente igual que el anterior
        System.out.print("Dime el numero de cuenta: ");
        int e = lector.nextInt();
        System.out.print("Cuanto dinero quieres retirar a la cuenta " + e + "?");
        double x = lector.nextInt();
        // Aquí restamos en vez de sumar porque se quiere retirar dinero
        int posicion = e - 1;
        saldo[posicion] = suma(saldo[posicion], -x);
    }

    public static void crear() { // Metodo para crear cuentas
        // Ponemos una condición para que solo deje crear cuentas cuando hay menos de
        // 100
        if (cont < 100) {
            // Pedimos los datos al usuario y los guardamos en la posición del array
            // correspondiente
            lector.nextLine();
            System.out.print("Dime el nombre de la cuenta: ");
            nombres[cont] = lector.nextLine();
            System.out.print("Dime el saldo de la cuenta: ");
            saldo[cont] = lector.nextDouble();
            // Añadimos un numero al contador para que en la opción de mostrar solo muestre
            // las creadas y no las 100 posiciones vacias
            cont++;
        } else {
            // Si hay 100 cuentas mostramos un mensaje para indicarle que borre alguna si
            // quiere crear otra
            System.out.println("Numero máximo de cuentas alcanzado.");
            System.out.println("Selecciona el botón 5 para borrar alguna.");
        }
    }

    public static void eliminar() { // Metodo para eliminar cuentas
        // Pedimos los datos al usuario
        System.out.print("Dime el numero de cuenta que quieras eliminar: ");
        int e = lector.nextInt();
        // Recorremos el array con un bucle
        for (int i = e; i <= cont; i++) {
            // Adelantamos todas las posiciones a partir del numero que nos ha dicho
            nombres[e - 1] = nombres[e];
            saldo[e - 1] = saldo[e];
            // Le quitamos una posición al contador ya que hay una cuenta menos
            cont--;
        }
    }

    public static void buscar() { // Metodo para buscar cuentas
        // Le pedimos al usuario que nos diga el nombre que quiere buscar
        System.out.print("Dime el nombre que quieres buscar: ");
        lector.nextLine();
        String buscar = lector.nextLine();
        // Hacemos un bucle para recorrer el array
        for (int i = 0; i < cont; i++) {
            // Lo pasamos todo a mayusculas y le damos la función index of que hace que
            // compruebe si hay caracteres iguales al array de String de nombres
            if (nombres[i].toUpperCase().indexOf(buscar.toUpperCase()) != -1) {
                System.out.println("Nombre " + nombres[i] + ". Saldo: " + saldo[i]);
            } else {
                // Si no se cumple con la condición hacemos que muestre un mensaje por pantalla
                // diciendo que no coincide nada.
                System.out.println("Ninguna cuenta coincide con lo que has puesto");
            }
        }
    }

    public static void morosos() { // Metodo para mostrar los morosos
        // Hacemos una variable para guardar cuantos morosos
        int x = 0;
        // Recorremos el array con un bucle
        for (int i = 0; i <= cont; i++) {
            // Ponemos una condición para que si la cuenta tiene menos de 0 euros muestre el
            // mensaje
            if (saldo[i] < 0) {
                System.out.println(nombres[i] + " es moroso");
                x++;
            }
        }
        // Hacemos que si x = 0 ponga que no hay morosos
        if (x == 0) {
            System.out.println("No hay morosos");
        }
    }

    public static boolean salir(boolean salir) { // Metodo para salir
        System.out.println("Hasta pronto!!!");
        salir = true;
        return salir;
    }

    public static double suma(double a, double b) {
        double suma;
        suma = a + b;
        return suma;
    }

    public static void main(String args[]) {
        // Declaración de variables
        boolean salir = false;
        int opcion;
        // Creamos un bucle para que el programa se ejecute hasta que pulsemos salir
        while (!salir) {
            // Llamamos al metodo del menú y asignamos su valor a la variable opción
            opcion = menu();
            // Llamamos al metodo del switch para que lo haga con la variable opción y a
            // salir le otorgamos su valor
            salir = opciones(opcion);
        }
    }
}
