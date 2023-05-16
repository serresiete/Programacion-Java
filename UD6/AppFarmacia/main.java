package AppFarmacia;
/*Pablo y Jorge*/
import java.util.Scanner;
//Importamos las dos clases que hemos creado
public class main {
    public static void main(String[] args) {
        // Creo scanner
        Scanner tcl = new Scanner(System.in);

        // Array de los trabajadores de la farmacia (EMPEZAMOS CON 0 TRABAJADORES, HAY
        // QUE CONTRATAR A ALGUNO PARA PODER ACCEDER A OTRAS CARACTERÍSTICAS DEL
        // PROGRAMA)
        trabajador[] trabajadores = new trabajador[25];
        medicamentos[] medicamentos = new medicamentos[50];
        // Muestra por pantalla los datos de cada trabajador
        System.out.println(trabajadores);
        System.out.println(medicamentos); 

    }
}
