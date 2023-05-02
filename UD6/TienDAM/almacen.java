package TienDAM;

public class almacen {
    // Atributos
    // Creamos una variable constante para darle longitud al array
    final static int maxArticulos = 100;
    // Creamos el array
    static articulo[] articulos = new articulo[maxArticulos];
    // Creamos una variable estatica contador para llevar la cuenta del array
    private static int cont = 0;
    // Y creamos otra para que el usuario ponga el lugar que quiera
    private static int indice = 0;

    // Metodos
    // Creamos un metodo para añadir un articulo nuevo al almacen (al array de
    // articulo)
    public static void añadirArticulo(String nombre, double precio, porcentajes iva, int cantidad) {
        articulos[cont] = new articulo(nombre, precio, iva, cantidad, cont);
        System.out.println("Articulo añadido.");
    }

    public static void eliminarArticulo(int ID) {
        indice = ID - 1;
        // Recorremos el array con un bucle
        for (int i = 0; i < articulos.length; i++) {
            // Adelantamos todas las posiciones a partir del numero que nos ha dicho
            articulos[indice - 1] = articulos[indice];
        }
        System.out.println("Articulo eliminado.");
        cont--;
    }

    public static void ModificarPrecio(double p, int ID) {
        indice = ID - 1;
        articulos[indice].setPrecio(p);
    }

    public static void buscarArticulo(String nombre) {
        // Recorremos el array con un bucle
        for (int i = 0; i < articulos.length; i++) {
            // Transformamos temporalmente las variables a minusculas para que sean iguales
            // Utilizamos el metodo "contains" para ver si contiene un subString que ha
            // puesto el usuario
            if (articulos[i].getNombre().toLowerCase().contains(nombre.toLowerCase())) {
                System.out.println("Artículo encontrado:");
                articulo.mostrar(articulos);
            }
        }
    }

    public static void recibir(int ID, int cantidad) {
        // Para el usuario el array empieza por 1 asi que le quitamos un valor
        indice = ID - 1;
        // Creamos una variable para guardar la cantidad del articulo
        int c = articulos[indice].getCantidad();
        // Le damos un nuevo valor a la cantidad inicial
        articulos[indice].setCantidad((cantidad + c));
    }

    public static void devolver(int ID, int cantidad) {
        // Para el usuario el array empieza por 1 asi que le quitamos un valor
        indice = ID - 1;
        // Creamos una variable para guardar la cantidad del articulo
        int c = articulos[indice].getCantidad();
        // Le damos un nuevo valor a la cantidad inicial
        articulos[indice].setCantidad((cantidad - c));
    }

}
