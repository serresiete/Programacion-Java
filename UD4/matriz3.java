import java.util.Scanner;
public class matriz3 {
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        System.out.print("Dime el numero de filas de la matriz: ");
        int n = lector.nextInt();
        System.out.print("Dime el numero de columnas de la matriz: ");
        int m = lector.nextInt();
        int [][] numeros = new int [n] [m];
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Dime el valor [" + i + "][" + j + "]:");
                numeros[i][j] = lector.nextInt();
                if (numeros[i][j] == 0){
                    a1++;
                }
                else if (numeros[i][j] < 0){
                    a2++;
                }
                else if (numeros[i][j] > 0){
                    a3++;
                }
            }
        }
        for (int k = 0; k < n; k++){
            for (int l = 0; l < m; l++){
                System.out.print(numeros[k][l] + "\t");
            }
            System.out.println("");
        }
        System.out.println("Hay " + a1 + " numeros que son iguales que 0");
        System.out.println("Hay " + a2 + " numeros que son menores que 0");
        System.out.println("Hay " + a3 + " numeros que son mayores que 0");
    }
}
