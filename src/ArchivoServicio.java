import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ArchivoServicio {

    public static void cargarDatos (File archivo, ProductoServicio productoServicio) {

        String linea = "";
        String separador = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(separador);

                Producto producto = new Producto(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5], datos[6]);
                productoServicio.getListaProductos().add(producto);
            }
            System.out.println("Datos cargados desde el archivo CSV exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo CSV: " + e.getMessage());
        }

    }
}
