import java.util.Scanner;
public class Condicionales15 {
    public static void main(String args[]){  
        Scanner lector = new Scanner(System.in);
        System.out.print("Primera Evaluación: ");
        int prim = lector.nextInt();
        System.out.print("Segunda Evaluacion: ");
        int seg = lector.nextInt();
        System.out.print("Tercera Evaluacion: ");
        int terc = lector.nextInt();
        double f = (prim+seg+terc)/3.0;
        int fin = (int) Math.round(f);
        if ((prim < 5 || seg < 5 || terc < 5) && fin > 4)
            System.out.println ("Nota final: 4");
        else
            System.out.println ("Nota Final: " + fin);
    }
}