import java.util.Scanner;
public class string3 {
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        System.out.print("Dime un texto: ");
        String str1 = lector.nextLine();
        System.out.print("Dime otro texto: ");
        String str2 = lector.nextLine();
        int a = str1.compareToIgnoreCase(str2);
        if (a < 0){
            System.out.println(str1 + ", " + str2);
        }
        else if (a > 0){
            System.out.println(str2 + ", " + str1);
        }
        else if (a == 0){
            System.out.println("Son iguales en orden alfabetico.");
        }
    }
}
