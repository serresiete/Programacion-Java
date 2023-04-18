import java.util.Scanner;
public class Calculadora {
    public static void main(String args[]) {
        Scanner lector = new Scanner(System.in);
        double x, y;
        double resultado;
        double cos;
        double tan;
        boolean salir = false;
        int opcion;
        boolean correcto = false;
        while (!salir) {
            System.out.println("CALCULADORA");
            System.out.println("1. Suma de dos numeros");
            System.out.println("2. Resta de dos numeros");
            System.out.println("3. Multiplicación de dos numeros");
            System.out.println("4. Division de dos numeros");
            System.out.println("5. Area de un rectangulo");
            System.out.println("6. Area de un triangulo equilatero");
            System.out.println("7. Area de un circulo");
            System.out.println("8. Seno, Coseno y Tangente de un angulo");
            System.out.println("9. Salir");
            System.out.print("Que opción quieres elegir? ");
            opcion = lector.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce dos numeros: ");
                    x = lector.nextDouble();
                    y = lector.nextDouble();
                    resultado = suma(x, y);
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 2:
                    System.out.println("Introduce dos numeros: ");
                    x = lector.nextDouble();
                    y = lector.nextDouble();
                    resultado = suma(x, -y);
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 3:
                    System.out.println("Introduce dos numeros: ");
                    x = lector.nextDouble();
                    y = lector.nextDouble();
                    resultado = multiplicacion(x, y);
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 4:
                    System.out.println("Introduce dos numeros: ");
                    x = lector.nextDouble();
                    y = lector.nextDouble();
                    resultado = division(x, y);
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 5:
                    while (!correcto) {
                        System.out.println("Introduce la base del rectangulo (máximo 1.000.000): ");
                        x = lector.nextDouble();
                        System.out.println("Introduce la altura del rectangulo (máximo 1.000.000): ");
                        y = lector.nextDouble();
                        if (x > 0 || x < 1000000 || y > 0 || y < 1000000) {
                            resultado = multiplicacion(x, y);
                            System.out.println("El resultado es: " + resultado);
                            correcto = true;
                        } else {
                            System.out.println("NUMERO NO VALIDO, INTRODUCE OTROS VALORES");
                        }
                    }
                    correcto = false;
                    break;
                case 6:
                    while (!correcto) {
                        System.out.println("Introduce la base del triangulo (máximo 1.000.000): ");
                        x = lector.nextDouble();
                        System.out.println("Introduce la altura del triangulo (máximo 1.000.000): ");
                        y = lector.nextDouble();
                        if (x > 0 || x < 1000000 || y > 0 || y < 1000000) {
                            resultado = (multiplicacion(x, y)) / 2;
                            System.out.println("El resultado es: " + resultado);
                            correcto = true;
                        } else {
                            System.out.println("NUMERO NO VALIDO, INTRODUCE OTROS VALORES");
                        }
                    }
                    correcto = false;
                    break;
                case 7:

                    while (!correcto) {
                        System.out.println("Dime el radio del circulo");
                        x = lector.nextDouble();
                        y = Math.PI;
                        x = x * x;
                        if (x > 0 || x < 1000000) {
                            resultado = multiplicacion(x, y);
                            System.out.println("El resultado es: " + resultado);
                            correcto = true;
                        } else {
                            System.out.println("NUMERO NO VALIDO, INTRODUCE OTROS VALORES");
                        }
                    }
                    correcto = false;
                    break;
                case 8:
                    while (!correcto) {
                        System.out.println("Dime un angulo: ");
                        x = lector.nextInt();
                        y = Math.PI / 180;
                        x = multiplicacion(x, y);
                        if (x < 360 && x > -360) {
                            resultado = seno(x);
                            cos = coseno(x);
                            tan = tangente(x);
                            System.out.println("El seno es: " + resultado);
                            System.out.println("El coseno es: " + cos);
                            System.out.println("La tangente es: " + tan);
                            correcto = true;
                        } else {
                            System.out.println("NUMERO NO VALIDO, INTRODUCE OTROS VALORES");
                        }
                    }
                    correcto = false;
                    break;
                case 9:
                    salir = true;
                    System.out.println("Hasta pronto!!!");
                    break;
            }
        }
    }
    public static double suma(double a, double b) {
        return a + b;
    }

    public static double multiplicacion(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        return a / b;
    }

    public static double seno(double a) {
        return Math.sin(a);
    }

    public static double coseno(double a) {
        return Math.cos(a);
    }

    public static double tangente(double a) {
        return Math.tan(a);
    }
}