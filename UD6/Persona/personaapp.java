package Persona;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class personaapp {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        persona p1 = new persona();
        persona p2 = new persona();
        System.out.println("Dime los datos de la persona 1: ");
        System.out.print("Nombre: ");
        p1.nombre = lector.nextLine();
        System.out.print("Apellidos: ");
        p1.apellidos = lector.nextLine();
        System.out.print("DNI :");
        p1.dni = lector.nextLine();
        System.out.print("Edad: ");
        p1.edad = lector.nextInt();

        System.out.println("Dime los datos de la persona 2: ");
        lector.nextLine();
        System.out.print("Nombre: ");
        p2.nombre = lector.nextLine();
        System.out.print("Apellidos: ");
        p2.apellidos = lector.nextLine();
        System.out.print("DNI :");
        p2.dni = lector.nextLine();
        System.out.print("Edad: ");
        p2.edad = lector.nextInt();

        System.out.println("Gracias por los datos, aqui tiene la información: ");
        if (p1.edad >= 18 && p2.edad >= 18) {
            System.out.println("La primera persona se llama " + p1.nombre + " " + p1.apellidos + " con DNI " + p1.dni
                    + " y tiene " + p1.edad + " por lo tanto es mayor de edad.");
            System.out.println("La primera persona se llama " + p2.nombre + " " + p2.apellidos + " con DNI " + p2.dni
                    + " y tiene " + p2.edad + " por lo tanto es mayor de edad.");
        } else if (p1.edad >= 18 && p2.edad < 18) {
            System.out.println("La primera persona se llama " + p1.nombre + " " + p1.apellidos + " con DNI " + p1.dni
                    + " y tiene " + p1.edad + " por lo tanto es mayor de edad.");
            System.out.println("La primera persona se llama " + p2.nombre + " " + p2.apellidos + " con DNI " + p2.dni
                    + " y tiene " + p2.edad + " por lo tanto es menor de edad.");
        } else if (p1.edad < 18 && p2.edad < 18) {
            System.out.println("La primera persona se llama " + p1.nombre + " " + p1.apellidos + " con DNI " + p1.dni
                    + " y tiene " + p1.edad + " por lo tanto es menor de edad.");
            System.out.println("La primera persona se llama " + p2.nombre + " " + p2.apellidos + " con DNI " + p2.dni
                    + " y tiene " + p2.edad + " por lo tanto es menor de edad.");
        } else if (p1.edad < 18 && p2.edad >= 18) {
            System.out.println("La primera persona se llama " + p1.nombre + " " + p1.apellidos + " con DNI " + p1.dni
                    + " y tiene " + p1.edad + " por lo tanto es menor de edad.");
            System.out.println("La primera persona se llama " + p2.nombre + " " + p2.apellidos + " con DNI " + p2.dni
                    + " y tiene " + p2.edad + " por lo tanto es mayor de edad.");
        }
    }
}
