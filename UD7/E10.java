package UD7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean continuar = false;
        int [] vector = new int[5];
        int valor;
        while(!continuar) {
            for (int i = 0; i < vector.length; i++) {
                System.out.print("Dime el valor del espacio " + (i+1) + ": ");
                try{
                    valor = lector.nextInt();
                    vector[i] = valor;
                    continuar = true;
                } catch(ArrayStoreException e) {
                    System.out.println("Valor incorrecto, introduce otro valor válido.");
                    continuar = false;
                } catch(InputMismatchException e) {
                    System.out.println("Introduce un valor que coincida con lo que se te ha pedido");
                    continuar = false;
                }
            }
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + ", ");
        }
    }
}
