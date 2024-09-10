package servicio;

import dominio.Snack;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ServicioSnackArchivos implements IServicioSnacks {
    private final String NOMBRE_ARCHIVO = "snacks.txt";

    // CREAR LA LISTA DE SNACKS
    private List <Snack> snacks = new ArrayList<>();

    // CONSTRUCTOR CLASE
    public ServicioSnackArchivos () {
        // CREAMOS EL ARCHIVO SI NO EXISTE
        var archivo = new File(NOMBRE_ARCHIVO);
        var existe = false;

        try {
            existe = archivo.exists();
            if (existe) {
                this.snacks = obtenerSnacks();
            } else {
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close(); // Guardamos el archivo en disco
                System.out.println("Se ha creado el archivo");
            }
        } catch (Exception e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }

        // Si no existe, cargamos algunos snacks iniciales
        if (!existe) {
            cargarSnacksIniciales ();

        }

    }

    // METODO --- CARGAR SNACKS INICIALES
    private void cargarSnacksIniciales () {
        this.agregarSnack(new Snack("Patatas", 1.7));
        this.agregarSnack(new Snack("Refresco", 2.5));
        this.agregarSnack(new Snack("Hamburguesa Simple", 2.5 ));
    }

    // METODO --- OBTENER SNACK
    private List<Snack> obtenerSnacks () {
        var snacks = new ArrayList<Snack>();
        try {
            List <String> lineas = Files.readAllLines(Paths.get(NOMBRE_ARCHIVO));
            for (String linea: lineas) {
                // PARSEO, SEPARADO POR COMAS
                String [] lineaSnack = linea.split(",");
                var idSnack = lineaSnack [0];
                var nombre = lineaSnack [1];
                var precio = Double.parseDouble(lineaSnack [2]);
                // CREAMOS OBJETO TIPO SNACK
                var snack = new Snack(nombre, precio);
                snacks.add(snack); // Agregamos el snack leido a la lista
            }
        } catch (Exception e) {
            System.out.println("Error al leer archivo de Snacks: " + e.getMessage());
        }
        return snacks;
    }

    // METODO --- AGREGAR SNACK NUEVO
    public void agregarSnack(Snack snack) {
        // AÑADIMOS EL NUEVO SNACK
            // 1º SE GUARDA EL SNACK EN LA MEMORIA
            this.snacks.add(snack);
            // 2º GUARDAMOS EL SNACK EN EL ARCHIVO
            this.agregarSnackArchivo(snack);
    }

    // METODO --- AGREGAR SNACK AL ARCHIVO
    public void agregarSnackArchivo (Snack snack) {
        boolean añadir = false;
        var archivo = new File(NOMBRE_ARCHIVO);
        try {
            añadir = archivo.exists();
            var salida = new PrintWriter(new FileWriter(archivo, añadir));
            salida.println(snack.escribirSnack());
            salida.close();
        } catch (Exception e) {
            System.out.println("Error al añadir el Snack: " + e.getMessage());
        }
    }

    @Override
    public void mostrarSnacks() {
        System.out.println("--- Snacks en el inventario ---");
        // MOSTRAMOS LA LISTA DE SNACKS EN EL ARCHIVO
        var inventarioSnacks = "";
        for (var snack: this.snacks) {
            inventarioSnacks += snack.toString() + "\n";
        }
        System.out.println(inventarioSnacks);
    }

    @Override
    public List<Snack> getSnacks() {
        return this.snacks;
    }
}