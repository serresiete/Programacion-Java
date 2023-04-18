public class Gamma4 {
    public static void main(String args[]){
        for(int n = 1; n<=10; n++){
            System.out.println("Tabla del: " + n);
            for (int i = 1; i<=10;i++){
                int res = n*i;
                System.out.println(n + " x " + i + " = " + res);
            }
        }
    }
}
