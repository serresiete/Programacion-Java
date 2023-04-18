public class matriz2 {

    public static void main(String[] args) {

        // Variables
        int[][] numeros = new int[10][10];

        // Rellenamos la matriz con las tablas de multiplicar
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[0].length; j++) {
                numeros[i][j] = (i+1)*(j+1);
            }
        }

        // Mostramos la matriz
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Tabla del " + (i+1) + ": ");
            for (int j = 0; j < numeros[0].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
