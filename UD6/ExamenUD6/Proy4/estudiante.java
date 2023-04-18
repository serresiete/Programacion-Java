/*Jorge Sierra García */
package Proy4;

import java.util.Scanner;

public class estudiante {
    // Atributos
    private String nombre;
    private String apellidos;
    private String dni;
    private int nacimiento;
    private double media;
    // Creamos variables estaticas de escaner y de contador para llevar la cuenta de
    // los elementos del array
    static int cont = 0;
    static Scanner lector = new Scanner(System.in);

    // Constructores
    // Constructor para sumarle 1 al contador.
    public estudiante() {
        cont++;
    }

    // Hacemos un constructor que recoja los datos y se los ponga las variables
    public estudiante(String nombre, String apellidos, String dni, int nacimiento, double media) {
        // Este constructor se va a llamar para crear nuevos elementos del array
        // Por tanto cada vez que se llame hay que llamar al constructor que le suma 1
        // al contador.
        this();
        setApellidos(apellidos);
        setDni(dni);
        // Creamos una condición para que si la media no está en los valores
        // establecidos de error y no se asigne la media
        if (media > 0 && media < 10) {
            setMedia(media);
        } else {
            System.out.println("Error, introduce un valor válido");
        }
        // Aquí hacemos los mismo, ponemos que si el valor dado no está en los valores
        // indicados ponga un mensaje de error
        if (nacimiento > 1900 && nacimiento < 2009) {
            setNacimiento(nacimiento);
        } else {
            System.out.println("Error, introduce un dato válido");
        }
        setNombre(nombre);
    }

    // Getters Y Setters
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public double getMedia() {
        return media;
    }

    public int getNacimiento() {
        return nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    // Metodos
    // Creamos un metodo para mostrar tan solo un elemento del array
    public void mostrar() {
        // Creamos una variable para la edad ya que tenemos el año de nacimiento, no la
        // edad
        // Para calcular la edad de una persona le restamos al año actual el año en que
        // nació
        int edad = 2023 - nacimiento;
        System.out.println("********* ALUMNO/A " + (cont+1) + " *********");
        System.out.println("Alumno/a" + ": " + nombre + " " + apellidos);
        System.out.println("DNI: " + dni);
        System.out.println("Edad: " + edad);
        System.out.println("Nota media: " + media);
        System.out.println("------------------------------------------------------");
        System.out.println("");
    }

    public static void crear(estudiante array[]) { // Metodo para contratar trabajadores
        // Creamos variables locales de este metodo que son necesarias
        String nombre;
        String apellidos;
        String dni;
        int nacimiento;
        double media;
        // Ponemos una condición para que solo deje crear cuentas cuando hay menos de
        // 100
        if (cont < 50) {
            // Pedimos los datos al usuario
            System.out.print("Dime el nombre del alumno/a: ");
            nombre = lector.nextLine();
            System.out.print("Dime sus apellidos: ");
            apellidos = lector.nextLine();
            System.out.print("Dime el DNI del alumno: ");
            dni = lector.nextLine();
            System.out.print("Dime la fecha de nacimiento (solo el año en formato AAAA): ");
            nacimiento = lector.nextInt();
            System.out.print("Dime su nota media: ");
            media = lector.nextDouble();
            // Le pasamos los metodos al constructor que a su vez llamará al otro
            // constructor para sumarle uno al contador
            array[cont] = new estudiante(nombre, apellidos, dni, nacimiento, media);
        } else if (cont >= 50) {
            // Si hay 30 estudiantes mostramos un mensaje para indicarle que borre alguno
            // si
            // quiere crear otro
            System.out.println("Numero máximo de estudiantes alcanzado.");
            System.out.println("Selecciona la opción 3 para borrar alguno.");
        }
    }

    public static void eliminar(estudiante array[]) { // Metodo para eliminar elementos del array de medicamentos
        // Pedimos los datos al usuario
        System.out.print("Dime el numero del estudiante que deseas expulsar: ");
        int e = lector.nextInt();
        // Recorremos el array con un bucle
        for (int i = 0; i < cont; i++) {
            // Adelantamos todas las posiciones a partir del numero que nos ha dicho
            array[e - 1] = array[e];
        }
        // Le restamos uno al contador ya que el array tiene un elemento menos
        cont--;
    }

    public static void editar(estudiante array[]) {
        // Creamos una variable boolean para un bucle
        boolean comprobar = false;
        int e = 0;
        // Lo metemos dentro de un bucle para que si el usuario mete un dato incorrecto
        // se repita
        while (!comprobar) {
            // Le pedimos al usuario el numero del estudiante
            System.out.println("Dime el numero del estudiante del cual deseas editar sus datos: ");
            e = lector.nextInt();
            // Le restamos 1 a e porque el array empieza por 0
            e = e - 1;
            // Creamos una condición para si pone un numero mayor que el contador mostar un
            // mensaje de error
            if (e < cont) {
                // Acabamos el bucle poniendo el valor de comprobar en true
                comprobar = true;
                System.out.println("Perfecto, vamos a modificar sus datos");
            } else {
                // Mostramos el mensaje de error
                System.out.println("Numero no válido, por favor, introduce un numero de alumno existente");
            }
        }
        // Pedimos los datos al usuario que se desean modificar
        System.out.print("Dime el nombre del alumno/a: ");
        array[e - 1].nombre = lector.nextLine();
        System.out.print("Dime sus apellidos: ");
        array[e - 1].apellidos = lector.nextLine();
        System.out.print("Dime el DNI del alumno: ");
        array[e - 1].dni = lector.nextLine();
        System.out.print("Dime la fecha de nacimiento: ");
        array[e - 1].nacimiento = lector.nextInt();
        System.out.print("Dime su nota media: ");
        array[e - 1].media = lector.nextDouble();
    }

    // Hacemos un metodo para ver los datos de un alumno, tiene que ser visible
    // desde otras clases
    public static void unalumno(estudiante array[]) {
        // Pedimos los datos
        System.out.print("Dime el numero de alumno que quieres mostrar: ");
        int e = lector.nextInt();
        // Creamos una variable para la edad ya que tenemos el año de nacimiento, no la
        // edad
        // Para calcular la edad de una persona le restamos al año actual el año en que
        // nació
        int edad = 2023 - array[e - 1].nacimiento;
        // Imprimimos los datos
        System.out.println("Alumno/a" + " " + e + ": " + array[e - 1].nombre + " " + array[e - 1].apellidos);
        System.out.println("DNI: " + array[e - 1].dni);
        System.out.println("Edad: " + edad);
        System.out.println("Nota media: " + array[e - 1].media);
    }

    // Creamos el metodo que nos muestre toda la información
    public static void MostrarInfoClase(estudiante array[]) {
        // Le mostramos por pantalla al usuario cuantos alumnos hay
        System.out.println("La clase tiene " + cont + " alumnos");
        // Llamamos a cada metodo para calcular e imprimir lo que se nos pide
        ver(array); // Ver los datos del array
        mediaClase(array); // Mostrar la media de la clase
        Aprobados(array); // Mostrar los aprobados
        Suspendidos(array); // Mostrar los suspendidos
    }

    // Hacemos un metodo para mostrar todos los elementos del array utilizando el
    // que muestra solo uno
    private static void ver(estudiante array[]) {
        // Creamos un bucle que recorra el array
        for (int i = 0; i < cont; i++) {
            // Llamamos al metodo mostrar por cada valor del array
            array[i].mostrar();
        }
    }

    private static void mediaClase(estudiante array[]) {
        // Recorremos el array guardando las notas de los alumnos y luego hacer la media
        // de estos
        double suma = 0;
        //Recorremos el array
        for (int i = 0; i < cont; i++) {
            //Le damos a suma su valor anterior mas la media
            //Así obtenemos la suma total
            suma = suma + array[i].media;
        }
        // Calculamos la media total
        double media = suma / cont;
        // Imprimimos los datos
        System.out.println(" La media de todos los alumnos de la clase es de: " + media);
    }

    private static void Aprobados(estudiante array[]) {
        // Creamos una variable para contar los aprobados
        int aprobado = 0;
        // Recorremos el array
        for (int i = 0; i < array.length; i++) {
            // Le sumamos uno a el contador de aprobados si la media es = 5
            if (array[i].media >= 5) {
                aprobado++;
            }
        }
        // Imprimimos un mensaje diciendo los aprobados que hay
        if (aprobado > 0) {
            System.out.println("Hay " + aprobado + " en la clase");
        } // Si no hay aprobados ponemos otro mensaje
        else {
            System.out.println("No hay ningún aprobado.");
        }
    }

    private static void Suspendidos(estudiante array[]) {
        // Creamos una variable para contar los suspendidos
        int suspendido = 0;
        // Recorremos el array
        for (int i = 0; i < array.length; i++) {
            // Le sumamos uno a el contador de suspendidos si la media es < 5
            if (array[i].media < 5) {
                suspendido++;
            }
        }
        // Imprimimos un mensaje diciendo los suspendidos que hay
        if (suspendido > 0) {
            System.out.println("Hay " + suspendido + " en la clase");
        } // Si no hay suspendidos ponemos otro mensaje
        else {
            System.out.println("No hay ningún suspendido.");
        }
    }
}