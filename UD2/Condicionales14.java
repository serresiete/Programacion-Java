import java.util.Scanner;
public class Condicionales14 {
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        System.out.print("Dime cuantos hombres hay: ");
        int h = lector.nextInt();
        System.out.print("Dime cuantas mujeres hay: ");
        int m = lector.nextInt();
        double s = h + m;
        double ph = h / s;
        double pm = m / s;
        if (h > m)
            System.out.println("El porcentaje de hombres es: " + ph + "% y el de mujeres es: " + pm + "% y hay mas hombres que  mujeres");
        else if (h < m)
            System.out.println("El porcentaje de hombres es: " + ph + "% y el de mujeres es: " + pm + "% y hay mas mujeres que  hombres");
        else if (h == m)
            System.out.println("El porcentaje de hombres es: " + ph + "% y el de mujeres es: " + pm + "% y hay los mismos hombres que  mujeres");
    }
}
