import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductoServicio {

    private List<Producto> listaProductos = new ArrayList<>();

    public ProductoServicio(){

    }

    public ProductoServicio(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public  void listarProductos() {
        for (Producto producto : listaProductos) {
            System.out.println(producto);
        }
    }

    public void editarProductos(ProductoServicio productoServicio){
        System.out.println("editar datos");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el código del producto que desea editar:");
        String codigoProducto = scanner.nextLine();

        Producto productoEncontrado = null;
        for (Producto producto : productoServicio.getListaProductos()) {
            if (producto.getCodigo().equals(codigoProducto)) {
                productoEncontrado = producto;
                break;
            }
        }

        if (productoEncontrado == null) {
            System.out.println("No se encontró ningún producto con el código ingresado.");
            return;
        }

        // Mostrar los datos del producto y solicitar al usuario que seleccione qué campo editar
        System.out.println("Datos del producto a editar:");
        System.out.println(productoEncontrado);
        System.out.println("Seleccione qué campo desea editar:");
        System.out.println("1. Nombre artículo");
        System.out.println("2. Precio");
        System.out.println("3. Descripción");
        System.out.println("4. Talla");
        System.out.println("5. Marca");
        System.out.println("6. Color");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el nuevo nombre del artículo:");
                String nuevoNombre = scanner.nextLine();
                productoEncontrado.setArticulo(nuevoNombre);
                break;
            case 2:
                System.out.println("Ingrese el nuevo precio:");
                String nuevoPrecio = scanner.nextLine();
                productoEncontrado.setPrecio(nuevoPrecio);
                break;
            case 3:
                System.out.println("Ingrese la nueva descripción:");
                String nuevaDescripcion = scanner.nextLine();
                productoEncontrado.setDescripcion(nuevaDescripcion);
                break;
            case 4:
                System.out.println("Ingrese la nueva talla:");
                String nuevaTalla = scanner.nextLine();
                productoEncontrado.setTalla(nuevaTalla);
                break;
            case 5:
                System.out.println("Ingrese la nueva marca:");
                String nuevaMarca = scanner.nextLine();
                productoEncontrado.setMarca(nuevaMarca);
                break;
            case 6:
                System.out.println("Ingrese el nuevo color:");
                String nuevoColor = scanner.nextLine();
                productoEncontrado.setColor(nuevoColor);
                break;
            default:
                System.out.println("Opción no válida.");
        }

        System.out.println("Producto editado exitosamente:");
        System.out.println(productoEncontrado);

    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
}
