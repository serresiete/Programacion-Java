package Articulo;

public class articuloApp {
    public static void main(String[] args) {
        //Instanciamos el objeto
        articulo compra = new articulo();
        //Creamos las variables locales para despues asignarles los atributos
        String nombre = "Pantalon";
        double precio = 26;
        double iva = compra.getIva();
        //Le asignamos los atributos correspondientes
        compra.setNombre(nombre);
        compra.setPrecio(precio);
        double piva = compra.pvp(precio, iva);
        //Imprimimos por pantalla los datos
        System.out.println("Ha comprado un " + nombre + " cuyo precio es: " + precio + "€ y con un IVA del " + (iva*100) + "% se queda con un PVP de: " + piva + "€");
    }
    
     
}
