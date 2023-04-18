public class Beta2 {
    public static void main(String args[]){
        int s = 0;
        int p = 1;
        for (int i = 1; i <= 10; i++){
            s += i;
            p *= i;
        }
        System.out.println("La suma es: " + s + " y el producto es: " + p);
        }
}