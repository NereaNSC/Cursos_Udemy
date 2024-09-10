package presentacion;

import dominio.Snack;
import servicio.IServicioSnacks;
import servicio.ServicioSnackArchivos;
//import servicio.ServicioSnacksLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
    public static void main(String[] args) {
        maquinaSnacks ();
    }


    public static void maquinaSnacks () {
        var salir = false;
        var consola = new Scanner(System.in);

        // CREAMOS UN OBJETO PARA OBTENER EL SERVICIO DE SNACKS (LISTA)
        //IServicioSnacks servicioSnacks = new ServicioSnacksLista();

        IServicioSnacks servicioSnacks = new ServicioSnackArchivos();

        // CREAMOS LA LISTA DE PRODUCTOS DE TIPO SNACKS
            List<Snack> productos = new ArrayList<>();

            System.out.println(" **** Máquina de Snacks **** ");

        // MOSTRAR INVENTARIO DE SNACKS DISPONIBLES
            servicioSnacks.mostrarSnacks();

        // MENÚ Y MANEJO DE EXCEPCIONES
            while (!salir) {
                try {
                    var opcion = mostrarMenu(consola);
                    salir = ejecutarOpciones(opcion, consola, productos, servicioSnacks);
                } catch (Exception e) {
                    System.out.println("Ocurrio un error: " + e.getMessage());
                }
                finally {
                    System.out.println(); // Imprime un salto de linea en cada iteración
                }
            }
    }

    // METODO MOSTRAR MENÚ
        private static int mostrarMenu (Scanner consola) {
            System.out.print("""
                    Menú:
                    1. Comprar Snack
                    2. Mostrar Ticket
                    3. Agregar Nuevo Snack
                    4. Snacks Disponibles
                    5. Salir
                    Elige una opción: \s""");
            return Integer.parseInt(consola.nextLine());
        }

    // METODO PARA AÑADIR FUNCIONALIDAD AL MENÚ
        private static boolean ejecutarOpciones (int opcion, Scanner consola , List <Snack> productos, IServicioSnacks servicioSnacks) {
            var salir = false;
            switch (opcion) {
                case 1 -> comprarSnack (consola, productos, servicioSnacks);
                case 2 -> mostrarSnacks (productos);
                case 3 -> agregarSnack (consola, servicioSnacks);
                case 4 -> listarInventarioSnacks (consola, servicioSnacks);
                case 5 -> { System.out.println("Esperamos verte pronto! ");
                    salir = true; }
                default -> { System.out.println("La opción " + opcion + " es inválida.");
                    System.out.println("Seleccione una opción de la lista"); }
            }
            return salir;
        }

        // CASE 1 --- COMPRAR SNACK
        private static void comprarSnack (Scanner consola, List<Snack> productos, IServicioSnacks servicioSnacks) {
            System.out.print("Qué snack quieres comprar (id)?");
            var idSnack = Integer.parseInt(consola.nextLine());

            // Validar que el snack exista en la lista de snacks
                var snackEncontrado = false;
                for (var snack: servicioSnacks.getSnacks()) {
                    if (idSnack == snack.getIdSnack()) {
                        // Agregamos el snack a la lista de productos
                        productos.add(snack);
                        System.out.println("Snack agregado: " + snack);
                        snackEncontrado = true;
                        break;
                    }
                }

                if (!snackEncontrado) {
                    System.out.println("ID de snack no encontrado: " + idSnack);
                }
        }

        // CASE 2 --- MOSTRAR SNACKS
        private static void mostrarSnacks (List<Snack> productos) {
            var ticket = "*** Ticket de Venta ***";
            var total = 0.0;
            for (var producto : productos) {
                ticket += "\n\t - " + producto.getNombre() + " - €" + producto.getPrecio();
                total += producto.getPrecio();
            }

            ticket += "\n\t Total -> " + total + "€";
            System.out.println(ticket);
        }

        // CASE 3 --- AGREGAR SNACK
        private static void agregarSnack (Scanner consola, IServicioSnacks servicioSnacks) {
            System.out.print("Nombre del Snack: ");
            var nombre = consola.nextLine();
            System.out.print("Precio del Snack: ");
            var precio = Double.parseDouble(consola.nextLine());
            servicioSnacks.agregarSnack(new Snack(nombre, precio));

            System.out.println("El snack se ha añadido correctamente");
            servicioSnacks.mostrarSnacks();
        }

        // CASE 4 --- LISTAR INVENTARIO SNACKS
    private static void listarInventarioSnacks (Scanner consola, IServicioSnacks servicioSnacks) {
        servicioSnacks.mostrarSnacks();
    }
}