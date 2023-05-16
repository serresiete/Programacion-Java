package AppFarmacia;
//Importamos la clase Scanner
import java.util.Scanner;

public class trabajador {
    static Scanner tcl = new Scanner(System.in);

    // Enumeración de la jerarquía de los empleados
    public enum TipoCargo {
        jefe,
        encargado,
        operario, 
        becario;
    }

    // Creamos la variable contador estática, ya que la utilizaremos en varios
    // métodos
    public static int contTrabajadores;

    // Atributos
    private String nombre;
    private int edad;
    private int antiguedad; // número de años trabajando en la empresa
    private double salario; // cada empleado tiene un salario diferente
    private TipoCargo cargo; // jerarquía de los trabajadores dentro de la empresa (estilo boolean)

    // Constructor
    public trabajador() {
        contTrabajadores ++;
    }

    // Constructor para el array
    public trabajador(String nom, int edad, int anti, double sal, TipoCargo carg) {
        this();
        setNombre(nom);
        setEdad(edad);
        setAntiguedad(anti);
        setSalario(salario);
        setCargos(cargo);

    }

    // Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antigüedad) {
        this.antiguedad = antigüedad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public TipoCargo getCargos() {
        return cargo;
    }

    public void setCargos(TipoCargo cargos) {
        this.cargo = cargos;
    }

    // Métodos


    // Método para ver los datos de los trabajadores
    public static void ver(trabajador array[]) {

    }

    public static void contratar(trabajador array[]) {
        // Método para contratar a nuevos trabajadores
        String nombre;
        int edad;
        int antigüedad = 0; // Obviamente no se preguntará su antigüedad ya que es 0
        double salario;
        TipoCargo cargo;
        // Ponemos una condición para que solo deje crear cuentas cuando hay menos de 25
        if (contTrabajadores < 25) {
            // Pedimos los datos al usuario
            System.out.println(" Dime el nombre del nuevo trabajador: ");
            tcl.nextLine();
            nombre = tcl.nextLine();
            System.out.println(" Dime su edad: ");
            tcl.nextLine();
            edad = tcl.nextInt();
            System.out.println(" Introduce cuanto va a cobrar (salario): ");
            tcl.nextLine();
            salario = tcl.nextDouble();
            // Utilizamos el método de seleccionar el cargo
            cargo = seleccionacargo();
            array[contTrabajadores] = new trabajador(nombre, edad, antigüedad, salario, cargo);
        } 
        else {
            // Si hay 25 trabajadores mostramos un mensaje para indicarle que borre alguna
            // si quiere crear otra
            System.out.println("Número máximo de trabajadores alcanzado.");
            System.out.println("Selecciona la opción 2 y luego la 2  para despedir a alguien.");

        }
    }

    // Método para eliminar elementos del array de trabajadores
    public static void despedir(trabajador array[]) {
        // Pedimos los datos al usuario
        System.out.print("Dime el número de trabajador: ");
        int posTrabajador = tcl.nextInt();
        // Recorremos el array con un bucle
        for (int i = 0; i < array.length; i++) {
            // Adelantamos todas las posiciones a partir del número que nos ha dicho
            array[posTrabajador - 1] = array[posTrabajador];
            contTrabajadores--;
        }
    }

    public static void mediasalarios(trabajador trabajadores[]) {
        // Recorrer el array guardando los salarios y luego hacer la media de estos
        double suma;
        for (int i = 0; i < contTrabajadores; i++) {


        }
    }

    public void ascenso() {
        if (cargo == TipoCargo.becario) {
            cargo = TipoCargo.operario; // Ascenso de becario a operario
        } else {
            if (cargo == TipoCargo.operario) {
                cargo = TipoCargo.encargado; // Ascenso de operario a encargado

            } else {
                if (cargo == TipoCargo.encargado) {
                    cargo = TipoCargo.jefe; // Ascenso de encargado a jefe
                }
            }
        }
        // Cuando alcanzas el cargo de jefe, ya no puedes ascensder más.
    }

    public static TipoCargo seleccionacargo() {
        TipoCargo cargo = TipoCargo.becario; // Le damos un valor inicial aunque no sea el definitivo
        System.out.println(" Indica el número correspondiente a tu cargo en la empresa ");
        System.out.println(" -----------------------------------------------------------");
        System.out.println("1- Jefe");
        System.out.println(" 2- Encargado");
        System.out.println(" 3- Operario");
        System.out.println(" 2- Becario");
        int seleccion = tcl.nextInt(); // Esta variable guardará el número que introduzca el usuario
        boolean condicion = true;
        while (condicion == true) {
            if (seleccion <= 4) {
                switch (seleccion) {
                    case 1:
                        cargo = TipoCargo.jefe; // Le pasa a la variable cargo que es el jefe
                        condicion = false;
                        break;
                    case 2:
                        cargo = TipoCargo.encargado; // Le pasa a la variable cargo que es encargado
                        condicion = false;
                        break;
                    case 3:
                        cargo = TipoCargo.operario; // Le pasa a la variable cargo que es operario
                        condicion = false;
                        break;
                    case 4:
                        cargo = TipoCargo.becario; // Le pasa a la variable cargo que es becario
                        condicion = false;
                        break;
                }
            } else {
                System.out.println(" Valor incorrecto. Vuelva a introducirlo.");
                condicion = true; // Se vuelve a ejecutar el "while"
            }
        }
        return cargo;
    }
}