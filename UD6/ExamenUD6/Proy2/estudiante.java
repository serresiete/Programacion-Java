/*Jorge Sierra García */
package Proy2;

public class estudiante {
    // Atributos
    private String nombre;
    private String apellidos;
    private String dni;
    private int nacimiento;
    private double media;

    // Constructores
    // Hacemos un constructor que recoja los datos y se los ponga las variables
    public estudiante(String nombre, String apellidos, String dni, int nacimiento, double media) {
        setApellidos(apellidos);
        setDni(dni);
        // Creamos una condición para que si la media no está en los valores
        // establecidos de error y no se asigne la media
        if (media > 0 && media < 10) {
            setMedia(media);
        } else {
            System.out.println("Error, introduce un valor válido");
        } // Aquí hacemos los mismo, ponemos que si el valor dado no está en los valores
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
    // Creamos un metodo para mostrar
    // Nos pide un metodo de objeto por lo tanto lo hacemos estatico y le pasamos
    // los parametros
    public static void mostrar(String nombre, String apellidos, String dni, int nacimiento, double media) {
       // Creamos una variable para la edad ya que tenemos el año de nacimiento, no la
        // edad
        // Para calcular la edad de una persona le restamos al año actual el año en que
        // nació
        int edad = 2023 - nacimiento;
        System.out.println("Alumno/a" + ": " + nombre + " " + apellidos);
        System.out.println("DNI: " + dni);
        System.out.println("Edad: " + edad);
        System.out.println("Nota media: " + media);
        System.out.println("------------------------------------------------------");
        System.out.println("");
    }
}