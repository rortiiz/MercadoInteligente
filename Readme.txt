1. Estructura del Código

El programa se divide en:

1.1 Variables Estáticas

Se declaran tres listas (ArrayList) para almacenar la información del carrito:

nombres: Guarda los nombres de los productos.

cantidades: Almacena las cantidades de cada producto.

precios: Contiene los precios unitarios de cada producto.

1.2 Método Principal (main)

Se inicia un objeto Scanner para recibir la entrada del usuario.

Se usa un bucle do-while para mostrar el menú repetidamente hasta que el usuario elija salir (opción == 5).

Se llama al método MostrarMenu() para mostrar las opciones disponibles.

Se lee la opción ingresada y se ejecuta la acción correspondiente utilizando switch-case.

1.3 Métodos Auxiliares

MostrarMenu(): Muestra las opciones del menú principal en consola.

AgregarProducto(Scanner sc): Permite al usuario ingresar productos con su cantidad y precio.

VerCarrito(): Muestra los productos agregados junto con el total a pagar, aplicando descuentos según la cantidad.

calcularDescuento(int cantidad, double subtotal): Aplica descuentos en función de la cantidad comprada.

eliminarProducto(Scanner sc): Permite eliminar un producto del carrito según el índice ingresado por el usuario.

finalizarCompra(): Muestra el total a pagar y finaliza la compra.

2. Ejecución del Código

2.1 Inicio del Programa

El usuario ejecuta el programa y se muestra el menú.

Se usa un bucle do-while para solicitar opciones hasta que el usuario elija salir.

2.2 Opciones del Menú

1. Agregar producto:

Solicita el nombre, cantidad y precio del producto.

Verifica que cantidad y precio sean positivos.

Agrega la información a las listas nombres, cantidades y precios.

2. Mostrar productos:

Recorre las listas y muestra los productos agregados.

Calcula el total considerando descuentos por cantidad.

3. Eliminar producto:

Muestra los productos con un índice.

Solicita el número del producto a eliminar.

Si el índice es válido, elimina el producto de las listas.

4. Finalizar compra:

Llama a VerCarrito() para mostrar el resumen de la compra.

Muestra un mensaje de agradecimiento y finaliza.

5. Salir:

Cierra el Scanner y termina la ejecución del programa.
