package TienDAM;

import java.util.ArrayList;

public class almacen {
    // Atributos
    // Creamos el arraylist
    private ArrayList<articulo> articulos = new ArrayList<articulo>();
    // Creamos una variable estatica contador para llevar la cuenta del array
    private int cont = 0;
    // Y creamos otra para que el usuario ponga el lugar que quiera
    private int indice = 0;

    // Creamos un boolean estatico para manejar excepciones
    static boolean excepciones = false;

    // Getters y Setters
    public ArrayList<articulo> getArticulos() {
        return articulos;
    }

    // Metodos
    // Creamos un metodo para añadir un articulo nuevo al almace"Profesor: " +
    // nombre + " " + apellidos + " " + fechaNacimn (al array de
    // articulo)
    public void añadirArticulo(String nombre, double precio, porcentajes iva, int cantidad) {
        articulo a = new articulo(nombre, precio, iva, cantidad, cont);
        articulos.add(a);
        System.out.println("Articulo añadido.");
    }

    public void eliminarArticulo(int ID) {
        indice = ID - 1; // IndexOutOfBounds
        while (!excepciones) {
            try {
                articulos.remove(indice);
                System.out.println("Articulo eliminado.");
                cont--;
                excepciones = true;
            } catch (IndexOutOfBoundsException e) {
                System.err.println("Numero no valido. Introduce el indice de un articulo existente");
                TienDAM.infoeliminar();
                excepciones = false;
            }
        }
        excepciones = false;
    }

    public void ModificarPrecio(double p, int ID) {
        while (!excepciones) {
            try {
                indice = ID - 1;
                try {
                    articulos.get(indice).setPrecio(p);
                } catch (Exception e) {
                    System.out.println("Vuelve a introducir un precio valido");
                    TienDAM.infoModificarPrecio();
                }
                excepciones = true;
            } catch (IndexOutOfBoundsException e) {
                System.err.println("Número no válido. Introduce el índice de un artículo existente");
                TienDAM.infoModificarPrecio();
                excepciones = false;
            }
        }
        excepciones = false;
    }

    public void buscarArticulo(String nombre) {
        for (int i = 0; i < articulos.size(); i++) {
            // Transformamos temporalmente las variables a minusculas para que sean iguales
            // Utilizamos el metodo "contains" para ver si contiene un subString que ha
            // puesto el usuario
            if (articulos.get(i).getNombre().toLowerCase().trim().contains(nombre.toLowerCase().trim())) {
                System.out.println("Artículo encontrado:");
                articulo.mostrar(articulos);
            }
        }
    }

    public void recibir(int ID, int cantidad) {
        int c = 0;
        // Para el usuario el array empieza por 1 asi que le quitamos un valor
        indice = ID - 1; // IndexOutOfBounds
        while (!excepciones) {
            try {
                c = articulos.get(indice).getCantidad();
                articulos.get(indice).setCantidad((cantidad + c));
                excepciones = true;
            } catch (IndexOutOfBoundsException e) {
                System.err.println("Número no válido. Introduce el índice de un artículo existente.");
                TienDAM.inforecibir();
                excepciones = false;
            }
        }
        excepciones = false;
    }

    public void devolver(int ID, int cantidad) {
        int c = 0;
        // Para el usuario el array empieza por 1 asi que le quitamos un valor
        int indice = ID - 1; // IndexOutOfBounds
        while (!excepciones) {
            try {
                c = articulos.get(indice).getCantidad();
                articulos.get(indice).setCantidad(cantidad - c);
                excepciones = true;
            } catch (IndexOutOfBoundsException e) {
                System.err.println("Número no válido. Introduce el índice de un artículo existente");
                TienDAM.infodevolver();
                excepciones = false;
            }
        }
        excepciones = false;
    }

    public void imprimir() {
        articulo.mostrar(articulos);
    }
}
