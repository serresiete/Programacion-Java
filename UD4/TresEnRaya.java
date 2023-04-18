import java.util.Scanner;
public class TresEnRaya {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char t[][] = new char[5][6];
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                t[i][j] = '_';
            }
        }
        int turno = 1;
        int fila = 0, col = 0;
        int ganador = 0;
        while ((turno < 10) && (ganador == 0)) {
            System.out.println("TABLERO CONECTA 4");
            System.out.println("  0 1 2 3 4 5");
            for (int i = 0; i < t.length; i++) {
                System.out.print(i + " ");
                for (int j = 0; j < t[i].length; j++) {
                    System.out.print(t[i][j]);
                    System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println("");
            if ((turno % 2) == 1) {
                System.out.println("TURNO: HUMANO");
                boolean valido = false;
                while (!valido) {
                    System.out.print("Fila? ");
                    fila = in.nextInt();
                    System.out.print("Columna? ");
                    col = in.nextInt();

                    if (fila >= 0 && fila <= 5 && col >= 0 && col <= 6 && t[fila][col] == '_') {
                        valido = true;
                        t[fila][col] = 'X';
                    } else
                        System.out.println("Coordenadas incorrectas.");
                }
            }
            else {
                System.out.println("TURNO: CPU");
                boolean valido = false;
                while (!valido) {

                    fila = (int) (Math.random() * 3);
                    col = (int) (Math.random() * 3);

                    if (fila >= 0 && fila <= 2 && col >= 0 && col <= 2 && t[fila][col] == '_') {
                        valido = true;
                        t[fila][col] = 'O';
                    }
                }
            }
            System.out.println("Pone ficha en " + fila + "," + col);
            System.out.println();
            for (int i = 0; i < t.length; i++) {
                if (t[i][0] == 'X' && t[i][1] == 'X' && t[i][2] == 'X') {
                    ganador = 1;
                    break;
                }
                if (t[0][i] == 'X' && t[1][i] == 'X' && t[2][i] == 'X') {
                    ganador = 1;
                    break;
                }
            }
            if ((t[0][0] == 'X' && t[1][1] == 'X' && t[2][2] == 'X') ||
                    (t[2][0] == 'X' && t[1][1] == 'X' && t[0][2] == 'X')) {
                ganador = 1;
                break;
            }
            for (int i = 0; i < t.length; i++) {

                if (t[i][0] == 'O' && t[i][1] == 'O' && t[i][2] == 'O') {
                    ganador = -1;
                    break;
                }
                if (t[0][i] == 'O' && t[1][i] == 'O' && t[2][i] == 'O') {
                    ganador = -1;
                    break;
                }
            }
            if ((t[0][0] == 'O' && t[1][1] == 'O' && t[2][2] == 'O') ||
                    (t[2][0] == 'O' && t[1][1] == 'O' && t[0][2] == 'O')) {
                ganador = -1;
                break;
            }
            turno++;
        }
        System.out.println();
        if (ganador == 1)
            System.out.println("¡¡¡GANA EL JUGADOR HUMANO!!!");
        else if (ganador == -1)
            System.out.println("¡¡¡GANA EL JUGADOR CPU!!!");
        else
            System.out.println("NO HA GANADO NADIE... :(((");
        in.close();
    }
}