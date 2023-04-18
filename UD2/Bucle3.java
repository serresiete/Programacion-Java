import java.util.Scanner;
public class Bucle3 {
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        int a = lector.nextInt();
        System.out.print("Dime otro numero: ");
        int b = lector.nextInt();
        for (int i = a; i <= b; i = i + 2){
            System.out.println(i);
        }
    }
}