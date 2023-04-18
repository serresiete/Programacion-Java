import java.util.Scanner;
public class matriz4 {
    public static void main(String args[]){

        int alumnos = 4, asignaturas = 5;
        int[][] notas = new int[alumnos][asignaturas];
        
        Scanner in = new Scanner(System.in);
        
        for (int i = 0; i < alumnos; i++) {
            System.out.println("Dime notas alumno " + (i+1));
            for (int j = 0; j < asignaturas; j++) {
                System.out.print("Asignatura " + j + ": ");
                notas[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < alumnos; i++) {
            System.out.print("Alumno " + (i+1) + ": ");
            for (int j = 0; j < asignaturas; j++) {
                System.out.print(notas[i][j] + " ");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < alumnos; i++) {
            int total = 0;
            int min = notas[i][0];
            int max = notas[i][0];
            for (int j = 0; j < asignaturas; j++) {
                total += notas[i][j];
                min = Math.min(min, notas[i][j]);
                max = Math.max(max, notas[i][j]);
            }
            System.out.println("ALUMNO " + (i+1));
            System.out.println("Media : " + ((double)total/asignaturas));
            System.out.println("Máximo: " + max);
            System.out.println("Mínimo: " + min);
            
        }
        
    }
}
