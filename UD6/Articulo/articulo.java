package Articulo;

public class articulo {
    // Atributos
    private String nombre;
    private double precio;
    public double iva = 0.21;
    private int cuantosQuedan;

    // Constructores
    public articulo() {

    }

    // Getters y Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCuantosQuedan(int cuantosQuedan) {
        this.cuantosQuedan = cuantosQuedan;
    }
    public void setIva(double iva) {
        this.iva = iva;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCuantosQuedan() {
        return cuantosQuedan;
    }
    public double getIva() {
        return iva;
    }

    // Metodos
    public double pvp(double precio, double iva) {
        double pvp = precio + precio*iva;
        return pvp;
    }
    public int Quedan(int cuantosQuedan){
        cuantosQuedan --;
        return cuantosQuedan;
    }
}
