import java.util.Scanner;
public class AppBank {
    public static void main(String args[]) {
        // Variables.
        Scanner lector = new Scanner(System.in);
        String[] nombres = new String[100];
        double[] saldo = new double[100];
        boolean salir = false;
        int opcion;
        int cont = 0;
        int i;
        // Hacemos el menu
        while (!salir) {
            System.out.println("1. Ver Cuentas");
            System.out.println("2. Ingresar Dinero");
            System.out.println("3. Retirar Dinero");
            System.out.println("4. Añadir Cuenta");
            System.out.println("5. Borrar Cuenta");
            System.out.println("6. Buscar Cuenta");
            System.out.println("7. Mostrar morosos");
            System.out.println("8. Salir");
            System.out.print("Que opción quieres hacer? ");
            opcion = lector.nextInt();
            // Le damos a cada funcion del menú su función correspondiente
            switch (opcion) {
                case 1: // Ver Cuentas
                    for (i = 0; i < cont; i++) {
                        System.out.println(i + ". " + nombres[i] + ": " + saldo[i] + " €");
                    }
                    break;
                case 2: // Ingresar dinero a x cuenta
                    System.out.print("Dime el numero de cuenta: ");
                    int e = lector.nextInt();
                    System.out.println("Cuanto dinero quieres ingresar en la cuenta " + e + "?");
                    int x = lector.nextInt();
                    saldo[e] = saldo[e] + x;
                    break;
                case 3: // Retirar dinero de x cuenta
                    System.out.print("Dime el numero de cuenta: ");
                    e = lector.nextInt();
                    System.out.println("Cuanto dinero quieres retirar a la cuenta " + e + "?");
                    x = lector.nextInt();
                    saldo[e] = saldo[e] - x;
                    break;
                case 4: // Crear cuenta
                    if (cont < 100) {
                        lector.nextLine();
                        System.out.print("Dime el nombre de la cuenta: ");
                        nombres[cont] = lector.nextLine();
                        System.out.print("Dime el saldo de la cuenta: ");
                        saldo[cont] = lector.nextDouble();
                        i = cont++;
                    } else {
                        System.out.println("Numero máximo de notas alcanzado.");
                        System.out.println("Selecciona el botón 5 para borrar alguna.");
                    }
                    break;
                case 5: // Eliminar cuenta
                    System.out.println("Dime el numero de cuenta que quieras eliminar: ");
                    e = lector.nextInt();
                    for (i = e; i <= cont; i++) {
                        nombres[e] = nombres[e + 1];
                        saldo[e] = saldo[e + 1];
                    }
                    cont--;
                    break;
                case 6: // Buscar cuenta
                    lector.nextLine();
                    System.out.println("Dime el nombre que quieres buscar: ");
                    String buscar = lector.nextLine();
                    for (i = 0; i < cont; i++) {
                        if (nombres[i].toUpperCase().indexOf(buscar.toUpperCase()) != -1) {
                            System.out.println("Nombre " + nombres[i] + ". Saldo: " + saldo[i]);
                        }
                    }
                    break;
                case 7: // Mostrar morosos
                    for (i = 0; i <= cont; i++) {
                        if (saldo[i] < 0) {
                            System.out.println(nombres[i] + " es moroso");
                        }
                    }
                    break;
                case 8: // Salir
                    salir = true;
                    System.out.println("Hasta Pronto!!!");
                    break;
            }
        }
    }
}