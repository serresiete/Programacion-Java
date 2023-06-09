package TienDAM;

import java.util.ArrayList;
 
//Creamos un enumerado para el IVA 
enum porcentajes {
    ventiuno,
    diez,
    cuatro;
}

// Creamos la clase articulo para gestionar los atributos y metodos del articulo
public class articulo {
    // Atributos
    private String nombre;
    private double precio;
    private porcentajes iva;
    private int cantidad;

    // Constructores
    public articulo() {

    }

    // Creamos un constructor que le sume uno al contador
    public articulo(int cont) {
        cont++;
    }

    // Creamos un contador que llame a los setters para ponerle valores a los
    // atributos
    public articulo(String nombre, double precio, porcentajes iva, int cantidad, int cont) {
        // Este constructor se llama al crear un articulo, por tanto llamamos al metodo
        // que le suma al contador
        this(cont);
        try{
            setPrecio(precio);
        } catch(Exception e){
            System.out.println("Vuelve a introducir un precio valido");
            TienDAM.infoañadir();
        }
        setCantidad(cantidad);
        setIva(iva);
        setNombre(nombre);
    }

    // Getters y Setters
    public int getCantidad() {
        return cantidad;
    }

    public porcentajes getIva() {
        return iva;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setIva(porcentajes iva) {
        this.iva = iva;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio (double precio) throws Exception{
        if (precio <= 0){
            throw new Exception("ERROR. El precio no puede ser menor o igual que 0") ;
        } else {
            this.precio = precio;
        }
    }

    // Metodos
    public void aumentar(int cantidad) {
        cantidad++;
    }

    public void disminuir(int cantidad) {
        cantidad--;
    }

    public void ver(int i) {
        if (iva == porcentajes.ventiuno) {
            System.out.println("El articulo " + (i + 1) + " es: " + nombre + " cuesta " + precio + "€, tiene un "
                    + "21% de IVA y tenemos " + cantidad + " en el almacén");
        }
        if (iva == porcentajes.diez) {
            System.out.println("El articulo " + (i + 1) + " es: " + nombre + " cuesta " + precio + "€, tiene un "
                    + "10% de IVA y tenemos " + cantidad + " en el almacén");
        }
        if (iva == porcentajes.cuatro) {
            System.out.println("El articulo " + (i + 1) + " es: " + nombre + " cuesta " + precio + "€, tiene un "
                    + "4% de IVA y tenemos " + cantidad + " en el almacén");
        }
    }

    public static void mostrar(ArrayList<articulo> arrayList) { // Metodo para visualizar el array
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i).ver(i);
        }
    }
}
