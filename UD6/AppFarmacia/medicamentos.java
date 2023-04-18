package AppFarmacia;

//Importamos la clase Scanner para usarlo con algunos métodos
import java.util.Scanner;

public class medicamentos {

    // Creamos un enumerado para los efectos secundarios
    enum efectos {
        no,
        ligeros,
        fuertes;
    }

    // Atributos
    private int stock; // Atributo para saber cuantos medicamentos hay disponibles
    private String nombre; // El nombre del medicamento
    private double precio; // El precio de una caja del medicamento en cuestión
    private efectos secundarios; // Utilizamos el enumerado para los efectos secundarios
    private boolean tipo; // Para saber si de que tipo es el medicamento (jarabe o pastilla)

    // Hacemos una variable de escaner estatica para todos los metodos
    static Scanner lector = new Scanner(System.in);
    //Y otra para el contador que necesitaremos para recorrer el array
    static int contM = 0; 

    // Constructores
    /*
     * Creamos un constructor que contenga los setters para darles valores iniciales
     * a todos los atributos.
     */
    public medicamentos() {
        contM++;
    }

    // Constructor al que le pasamos los parametros del futuro array y les asignamos los valores
    public medicamentos(int stock, String nombre, double precio, efectos secundarios, boolean tipo) {
        this(); //Llama al constructor de arriba
        setStock(stock);
        setNombre(nombre);
        setPrecio(precio);
        setSecundarios(secundarios);
        setTipo(tipo);
    }

    // Getters y Setters
    public int getStock() {
        return stock;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public efectos getSecundarios() {
        return secundarios;
    }

    public boolean getTipo() {
        return tipo;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setSecundarios(efectos secundarios) {
        this.secundarios = secundarios;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    // Métodos

    public static void ver(medicamentos array[]) { // Metodo para visualizar el array
         for (int i = 0; i < array.length; i++) {
            array[i].mostrar(i);
         }
    }

    public static medicamentos[] crear(medicamentos array[]) { // Metodo para contratar trabajadores
        // Creamos variables locales de este metodo que son necesarias
        String nombre;
        double precio;
        int stock;
        efectos secundarios;
        boolean tipo;
        // Ponemos una condición para que solo deje crear cuentas cuando hay menos de
        // 100
        if (contM < 50 && contM > 0) {
            // Pedimos los datos al usuario
            System.out.print("Dime el nombre del medicamento: ");
            lector.nextLine();
            nombre = lector.nextLine();
            System.out.print("Dime el precio: ");
            precio = lector.nextDouble();
            System.out.print("Dime el stock que hay: ");
            stock = lector.nextInt();
            tipo = comprobacionJoP();
            secundarios = comprobacionES();
            array[contM] = new medicamentos(stock, nombre, precio, secundarios, tipo);
            contM++;
        } else if (contM >= 50){
            // Si hay 50 medicamentos mostramos un mensaje para indicarle que borre alguno
            // si
            // quiere crear otra
            System.out.println("Numero máximo de medicamentos alcanzado.");
            System.out.println("Selecciona la opcion 2 y luego otra vez la 2 para borrar alguno.");
        }
        return array;
    }

    public static void eliminarMedicamentos(medicamentos array[]) { // Metodo para eliminar elementos del array de trabajadores
        // Pedimos los datos al usuario
        System.out.print("Dime el numero de trabajador: ");
        int M = lector.nextInt();
        // Recorremos el array con un bucle
        for (int i = 0; i < array.length; i++) {
            // Adelantamos todas las posiciones a partir del numero que nos ha dicho
            array[M - 1] = array[M];
        }
        contM--;
    }

    // Creamos un metodo para comprar medicamentos y otro para vender
    public static void comprar(medicamentos array[], double dinero) {
        // Creamos la variable del escaner para pedir datos
        // Creamos las variables que vayamos a usar en el metodo
        double precio;
        int cantidad;
        // Otras variables que necesitamos para el correcto funcionamiento del metodo
        double total;
        // Le pedimos los datos al usuario
        System.out.println("Bienvenido a la tienda del proveedor de medicamentos.");
        System.out.print("Dime el numero de la lista en la cual está medicamento que quieres comprar (si no sabes cual es selecciona la opción 1 para mirarlo.): ");
        lector.nextLine();
        int numero = lector.nextInt();
        precio = array[numero].precio;
        System.out.println("Su precio es de " + precio + "€");
        System.out.print("Ahora dime cuantas cajas quieres: ");
        cantidad = lector.nextInt();
        total = PrecioTotal(precio, cantidad);
        /*
         * Creamos bucles y condiciones para saber cuales son los efectos secundarios y
         * que lo haga solo si el usuario pone datos correctos
         */
        System.out.println("Te va a costar un total de: " + total + "€");
        if (dinero >= total) {
            array[numero].stock += 1;
            System.out.println("Gracias por su compra, venda los medicamentos con responsabilidad.");
            dinero -= total;
        } else {
            System.out.println(
                    "No tiene dinero para comprar, seleccione menos cantidad o trabaje más para comprar este medicamento.");
        }
    }

    // Creamos un metodo para mostrar los medicamentos sin stock
    public static void SinStock(medicamentos array[]) {
        // Creamos un contador para que cuente si hay sin stock o no
        int cont = 0;
        // Creamos un bucle para recorrer el array y comprobar si no hay stock
        for (int i = 0; i < contM; i++) {
            if (array[i].stock == 0) {
                array[i].mostrar(cont);
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("No hay medicamentos sin stock");
        } else {
            System.out.println("Hay un total de " + cont + " medicamentos sin stock.");
        }
    }

    public void mostrar(int i){
        if(contM > 0){
            System.out.print("El medicamento " + (i+1) + " es: " + nombre); // Nombre y numero
            System.out.print("El stock total de " + nombre + " es de: " + stock + " cajas."); // Stock de cajas
            System.out.print("Cada caja vale " + precio + "€"); // Precio por caja
            efectosSecundarios(secundarios);// Efectos secundarios
            JarabeoPastilla(tipo);; // Jarabe o pastilla
        }else {
            System.out.println("No hay medicamentos, pulsa la opción 2 y luego la 1 para agregar alguno.");
        }
    }

    // Metodo para calcular el precio total de un producto
    private static double PrecioTotal(double precio, int cantidad) {
        double total = precio * cantidad;
        return total;
    }

    // Metodo para comprobar si es jarabe o pastilla
    private static boolean comprobacionJoP() {
        boolean comprobar = false;
        String japas;
        boolean tipos = false;
            while (comprobar == false) {
                System.out.print("Dime si lo tienes en formato pastilla o jarabe. ");
                lector.nextLine();
                japas = lector.nextLine();
                japas.toUpperCase();
                if (japas == "PASTILLA" || japas == "PASTILLAS") {
                    tipos = false;
                    comprobar = true;
                } else if (japas == "JARABE" || japas == "JARABES") {
                    tipos = true;
                    comprobar = true;
                } else {
                    System.out.println(
                            "Nombre no válido, asegurate de no haber introducido espacios o haber puesto alguna letra mal y vuelve a introducirlo.");
                }
            }
        return tipos;
    }

    // Metodo para comprobar si tiene efectos secundarios (fuertes o debiles) o no
    private static efectos comprobacionES() {
        boolean comprobar = false;
        String efecto;
        String fuerte;
        efectos secundario = efectos.no;
        while (comprobar == false) {
            System.out.print("Tiene efectos secundarios? ");
            lector.nextLine();
            efecto = lector.nextLine();
            efecto.toUpperCase();
            if (efecto == "SI") {
                while (comprobar == false) {
                    System.out.print("Son fuertes? ");
                    lector.nextLine();
                    fuerte = lector.nextLine();
                    fuerte.toUpperCase();
                    if (fuerte == "SI") {
                        System.out.println("Vale, gracias por la información.");
                        comprobar = true;
                        secundario = efectos.fuertes;
                    } else if (fuerte == "NO") {
                        System.out.println("Vale, gracias por la información.");
                        comprobar = true;
                        secundario = efectos.ligeros;
                    } else {
                        System.out.println(
                                "Nombre no válido, asegurate de no haber introducido espacios o haber puesto alguna letra mal y vuelve a introducirlo.");
                    }
                }
            } else if (efecto == "NO") {
                System.out.println("Vale, gracias por la información.");
                comprobar = true;
                secundario = efectos.no;
            } else {
                System.out.println(
                        "Nombre no válido, asegurate de no haber introducido espacios o haber puesto alguna letra mal y vuelve a introducirlo.");
            }
        }
        return secundario;
    }
    //Metodo para que imprima una cosa u otra dependiendo del valor de secundario.
    private static void efectosSecundarios(efectos secundario) {
        //Creamos una condición para que imprima una cosa o la otra
        if (secundario == efectos.no) {
            System.out.println("Este medicamento no tiene efectos secundarios.");
        } else if (secundario == efectos.ligeros) {
            System.out.println("Este medicamento tiene algunos efectos secundarios que no suponen un gran problema.");
        } else if (secundario == efectos.fuertes) {
            System.out.println("Este medicamento tiene efectos secundarios fuertes, hay que avisar de ello cuando se venda.");
        }
    }
    //Metodo para que imprima una cosa u otra dependiendo del valor de tipo
    private static void JarabeoPastilla(boolean japas) {
        //Creamos una condición para que imprima una cosa o la otra
        if (japas == true) {
            System.out.println("Este medicamento es en jarabe. Al venderse se tiene que indicar la cantidad a beber.");
        }else if (japas == false) {
            System.out.println("Este medicamento es en pastilla.");
        }
    }
}
