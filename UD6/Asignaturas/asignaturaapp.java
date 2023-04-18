package Asignaturas;
import java.util.Scanner;
public class asignaturaapp {
    public static void main(String[] args) {
        asignatura datos[] = new asignatura[5];
        Scanner lector = new Scanner(System.in);
        String nombre;
        int horas;
        double nota;
        for (int i = 0; i < datos.length; i++) {
            if(i > 0){
                lector.nextLine();
            }
            System.out.print("Dime el nombre de la asignatura " + (i+1) + " : ");
            nombre = lector.nextLine();
            System.out.print("Dime el numero de horas de la asignatura " + (i+1) + " : ");
            horas = lector.nextInt();
            System.out.print("Dime la nota de la asignatura " + (i+1) + " : ");
            nota = lector.nextDouble();
            datos[i] = new asignatura(nombre, horas, nota);
            System.out.println("Nombre de la asignatura " + (i+1) + " : " + datos[i].getNombre());
            System.out.println("Horas por semana de la asignatura " + (i+1) + " : " + datos[i].getHoras());
            System.out.println("Nota de la asignatura " + (i+1) + " : " + datos[i].getNota());
        }
    }
}
