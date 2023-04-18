import java.util.Scanner;
public class string1{
    public static void main(String args[]){
        System.out.print("Dime un texto: ");
        Scanner lector = new Scanner(System.in);
        String str1 = lector.nextLine();
        String mayus = str1.toUpperCase();
        String minus = str1.toLowerCase();
        System.out.println("En mayúsculas: " + mayus + " y en minusculas: " + minus); 
    }
}