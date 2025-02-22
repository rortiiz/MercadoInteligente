import java.util.ArrayList;
import java.util.Scanner;





public class App {

    static ArrayList<String> nombres = new ArrayList<>();
    static ArrayList<Integer> cantidades = new ArrayList<>();
    static ArrayList<Double> precios = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            MostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    AgregarProducto(sc);
                    break;
                case 2:
                    VerCarrito();
                    break;
                case 3:
                    eliminarProducto(sc);
                    break;
                case 4:
                    finalizarCompra();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        } while (opcion != 5);
        sc.close();
        

    }

    // Método Meú: Muestra las opciones del Menú Principal!

    public static void MostrarMenu(){
        System.out.println("""
                -------- MENU --------
                1. Agregar producto
                2. Mostrar productos
                3. Eliminar producto
                4. Finalizar compra
                5. Salir    
                """);
                System.out.print("Seleccione una opción: ");
    }

    // Método AgregarProducto: Tiene la funcionalidad de Agregar Productos, Cantidad y el Precio al Carrito de Compras!

    public static void AgregarProducto (Scanner sc) {

    
System.out.println("Ingrese el nombre del producto: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese la cantidad: ");
        int cantidad = sc.nextInt();
        System.out.print("Ingrese el precio unitario: ");
        double precio = sc.nextDouble();
        sc.nextLine();

        if (cantidad <= 0 || precio <= 0 ) {
            System.out.println ("Cantidad y Precio deben ser Positivos!");
                return;

        }

        // Llena los Arrays!

        nombres.add(nombre);
        cantidades.add(cantidad);
        precios.add(precio);
        System.out.println("Producto agregado correctamente.");

    }

    // Método VerCarrito: Tiene la funcionalidad de Mostrar los Productos Agregados en el Carrito!

    public static void VerCarrito () {
        double total = 0;
    System.out.println("Productos en el carrito:");
    
    for (int i = 0; i < nombres.size(); i++) {
        int cantidad = cantidades.get(i);
        double precio = precios.get(i);
        double subtotal = cantidad * precio;
        double descuento = calcularDescuento(cantidad, subtotal);
        double totalProducto = subtotal - descuento;
        System.out.println("Producto: " + nombres.get(i) +
                           ", Cantidad: " + cantidad +
                           ", Precio: " + precio +
                           ", Subtotal: " + subtotal +
                           ", Descuento: " + descuento +
                           ", Total a pagar: " + totalProducto);
        total += totalProducto;
    }
    System.out.println("Total a pagar por todos los productos: " + total);
        
    

}

// Método calcularDescuento: Tiene la funcionalidad Calcular el Descuento Aplicable!

public static double calcularDescuento(int cantidad, double subtotal) {
    double descuento = 0;
    if (cantidad >= 3 && cantidad <= 5) {
        descuento = subtotal * 0.10; 
    } else if (cantidad >= 6 && cantidad <= 10) {
        descuento = subtotal * 0.20; 
    } else if (cantidad > 10) {
        descuento = subtotal * 0.30; 
    }
    return descuento;
}

// Método eliminarProducto: Tiene la funcionalidad de Eliminar los Productos Seleccionados!

public static void eliminarProducto(Scanner sc) {
    if(nombres.isEmpty()){
        System.out.println("El carrito está vacío.");
        return;
    }
    
    System.out.println("Productos en el carrito:");
    for (int i = 0; i < nombres.size(); i++) {
        System.out.println(i + ". " + nombres.get(i) + " - Cantidad: " + cantidades.get(i));
    }
    System.out.print("Ingrese el número del producto a eliminar: ");
    int indice = sc.nextInt();
    sc.nextLine();
    
    if (indice >= 0 && indice < nombres.size()) {
        nombres.remove(indice);
        cantidades.remove(indice);
        precios.remove(indice);
        System.out.println("Producto eliminado.");
    } else {
        System.out.println("Índice inválido.");
    }
    
    
    

}

// Método finalizarCompra: Tiene la funcionalidad de salir del Menú!

public static void finalizarCompra() {
    System.out.println("Finalizando compra...");
    VerCarrito();
    System.out.println("¡Gracias por su compra!");
}



}

