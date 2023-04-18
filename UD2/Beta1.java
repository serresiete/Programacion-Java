import java.util.Scanner;
public class Beta1{
    public static void main(String args[]){
        try (Scanner lector = new Scanner(System.in)) {
            System.out.print("Dime un número:");
            int n = lector.nextInt();
            int i = 10;
            while (i >= 0){
                int mult = i * n;
                System.out.println(mult);
                i = i-1;
            }
        }
    }
}