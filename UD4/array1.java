import java.util.Scanner;
import java.util.Arrays;
public class array1 {
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        System.out.print("Dime 10 numeros: ");
        int i = 0;
        int[] n = new int[10];
        do{
            n[i] = lector.nextInt();
            i++;
        }while(i < 10);
        for (int r = 0; r < n.length; r++){
            System.out.println("Numero " + r + ": " + n[r]);
        }
    }
}
