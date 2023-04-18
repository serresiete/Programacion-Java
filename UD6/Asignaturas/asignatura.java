package Asignaturas;

public class asignatura {
    //Atributos
    public String nombre;
    public int horas;
    public double nota;
    //Constructor
    public asignatura(String nombre, int horas, double nota) {
        setHoras(horas);
        setNombre(nombre);
        setNota(nota);
    }
    //Getters y Setters
    public void setHoras(int horas) {
        this.horas = horas;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
    public int getHoras() {
        return horas;
    }
    public String getNombre() {
        return nombre;
    }
    public double getNota() {
        return nota;
    }
    //Metodos
}
