import java.util.Scanner;
public class string2 {
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        System.out.print("Dime un texto: ");
        String str1 = lector.nextLine();
        System.out.print("Ahora dime otro: ");
        String str2 = lector.nextLine();
        if (str1.equals(str2)){
            System.out.println("Los dos textos son iguales.");
        }
        else if(str1.equalsIgnoreCase(str2)){
            System.out.println("Si no contamos mayusculas o minusculas los dos textos son iguales.");
        }
        else
            System.out.println("Los dos textos no son iguales");
    }
}
