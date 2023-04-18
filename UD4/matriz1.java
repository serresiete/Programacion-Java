public class matriz1 {
    public static void main(String args[]){
        int[][] numeros = new int[5][5];
        int num = 1;
        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros.length; j++){
                numeros[i][j] = num;
                num++;
            }
        }
        for (int f = 0; f < numeros.length; f++){
            for (int c = 0; c < numeros.length; c++){
                System.out.print(numeros[f][c] + " \t");
            }
            System.out.println("");
        }
    }
}
