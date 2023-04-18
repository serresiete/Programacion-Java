import java.util.Scanner;
public class string5 {
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        System.out.print("Dime un texto: ");
        String str = lector.nextLine();
        char a,e,i,o,u;
        int contA = 0;
        int contE = 0;
        int contI = 0;
        int contO = 0;
        int contU = 0;
        for (int f = 0; f < str.length(); f++){
            a = str.charAt(f);
            e = str.charAt(f);
            i = str.charAt(f);
            o = str.charAt(f);
            u = str.charAt(f);
            if (a == 'a' || a == 'A'){
                contA++;
            }
            else if (e == 'e' || e == 'E'){
                contE++;
            }
            else if (i == 'i' || i == 'I'){
                contI++;
            }
            else if (o == 'o' || o == 'O'){
                contO++;
            }
            else if (u == 'u' || u == 'U'){
                contU++;
            }
        }
        System.out.println("Hay " + contA + " A, hay " + contE + " E, hay " + contI + " I, hay " + contO + " O y hay " + contU + " U.");
    }
}
