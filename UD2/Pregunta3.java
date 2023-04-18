import java.util.Scanner;
public class Pregunta3 {
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        System.out.print("Introduce 5 precios: ");
        double p1 = lector.nextDouble();
        double p2 = lector.nextDouble();
        double p3 = lector.nextDouble();
        double p4 = lector.nextDouble();
        double p5 = lector.nextDouble();
        double Pt = p1+p2+p3+p4+p5;
        System.out.println("El precio total es de: " + Pt + "€");
        double desc = Pt*0.1;
        System.out.println("El descuento es de: " + desc + "€");
        double Pdesc = Pt-desc;
        System.out.println("El precio final es de. " + Pdesc + "€");
        double IVA = Pdesc*0.21;
        System.out.println("El IVA tiene un valor de: " + IVA + "€");
        double Pf = Pdesc + IVA;
        System.out.println("El precio final es de: " + Pf + "€");
    }
}
