import java.io.File;
import java.util.Scanner;

public class Menu {

    private final Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu(ProductoServicio productoServicio){

        Utilidad utilidad = new Utilidad();
        String op;

        do
        {
            System.out.println("=============");
            System.out.println("1 Listar Producto");
            System.out.println("2 Editar Datos");
            System.out.println("3 Importar Datos");
            System.out.println("4 Salir");
            System.out.println("=============");
            System.out.println("Ingrese una opción:");
            op = scanner.nextLine();

            if (op.equals("1")) {
                productoServicio.listarProductos();
            } else if (op.equals("2")) {
                productoServicio.editarProductos(productoServicio);
            } else if (op.equals("3")) {
                System.out.println("Ingrese la ruta en donde se encuentra el archivo ProductosImportados.csv:");
                String rutaArchivo = scanner.next();

                File archivo = new File(rutaArchivo + "ProductosImportados.csv");

                ArchivoServicio.cargarDatos(archivo, productoServicio);

            } else if( !op.equals("4")){
                System.out.println("Debes elegir una opción correcta");
            }
            utilidad.limpiarPantalla();
        } while (!op.equals("4"));
        System.out.println("Abandonando el sistema de clientes...");

    }

}
