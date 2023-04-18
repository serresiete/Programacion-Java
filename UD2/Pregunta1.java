import java.util.Scanner;
public class Pregunta1{

    public static void main(String args[]){  
        Scanner lector = new Scanner(System.in);
        System.out.print("Primera Evaluación: ");
        int prim = lector.nextInt();
        System.out.print("Segunda Evaluacion: ");
        int seg = lector.nextInt();
        System.out.print("Tercera Evaluacion: ");
        int terc = lector.nextInt();
        double fin = (prim+seg+terc)/3.0;
        System.out.println ("Nota Final: " + fin);
    }
}

