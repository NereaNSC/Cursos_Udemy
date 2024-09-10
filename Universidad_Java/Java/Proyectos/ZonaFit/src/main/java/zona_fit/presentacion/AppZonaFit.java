package zona_fit.presentacion;

import zona_fit.datos.ClienteDAO;
import zona_fit.datos.IClienteDAO;
import zona_fit.dominio.Cliente;

import java.util.Scanner;

public class AppZonaFit {
    public static void main(String[] args) {
        appZonaFit();
    }

    public static void appZonaFit () {
        var salir = false;
        Scanner teclado = new Scanner(System.in);

        // CREAMOS UN OBJETO PARA OBTENER LOS DATOS DE CLIENTES
        IClienteDAO ClienteDAO = new ClienteDAO();

        // MENÚ Y MANEJO DE EXCEPCIONES
        while (!salir) {
            try {
                var opcion = mostrarMenu(teclado);
                salir = ejecutarOpciones(teclado, opcion, ClienteDAO);
            } catch (Exception e) {
                System.out.println("Error al ejecutar el menú: " + e.getMessage());
            } finally {
                System.out.println(); // Imprimir salto de linea por cada iteración
            }
        }

        System.out.println("*** APP ZONA FIT ***");
    }


    // METODO MOSTRAR MENU
    private static int mostrarMenu (Scanner teclado) {
        System.out.print("""
                Menú:
                1. Listar Clientes
                2. Buscar Cliente
                3. Añadir Cliente
                4. Modificar Cliente
                5. Eliminar Cliente
                6. Salir
                Elige un opción: \s""");

        return Integer.parseInt(teclado.nextLine());
    }

    // METODO PARA AÑADIR FUNCIONALIDADES AL MENÚ
    private static boolean ejecutarOpciones (Scanner teclado, int opcion, IClienteDAO ClienteDAO) {
        var salir = false;
        switch (opcion) {
            case 1 -> {
                System.out.println("--- Listado de Clientes ----");
                var clientes = ClienteDAO.listarCliente();
                clientes.forEach(System.out::println);
            }
            case 2 -> {
                System.out.println("--- Buscar un Cliente por ID ---");
                System.out.print("Introduce el ID del cliente que estás buscando: ");
                var buscarCliente = Integer.parseInt(teclado.nextLine());
                var cliente = new Cliente(buscarCliente);
                var buscar = ClienteDAO.buscarClientePorID(cliente);
                if (buscar)
                    System.out.println("Cliente encontrado:  \n" + cliente);
                else
                    System.out.println("No se encontro el cliente con ID: " + cliente.getId());
            }
            case 3 -> {
                System.out.println("--- Añadir un nuevo Cliente ---");
                System.out.print("Introduce el nombre: ");
                var nombre = teclado.nextLine();
                System.out.print("Introduce el primer apellido: ");
                var apellido = teclado.nextLine();
                System.out.print("Introduce la membresia: ");
                var membresia = Integer.parseInt(teclado.nextLine());

                var nuevoCliente = new Cliente(nombre, apellido, membresia);
                var añadirCliente = ClienteDAO.agregarCliente(nuevoCliente);
                if (añadirCliente)
                    System.out.println("El nuevo cliente fue añadido correctamente: " + nuevoCliente);
                else
                    System.out.println("No se pudo añadir el nuevo cliente: " + nuevoCliente);
             }
            case 4 -> {
                System.out.println("--- Modificar Cliente ---");
                System.out.print("Introduce el ID del cliente que quieres modificar: ");
                var idCliente = Integer.parseInt(teclado.nextLine());
                System.out.print("Nombre: ");
                var nombre = teclado.nextLine();
                System.out.print("Apellido: ");
                var apellido = teclado.nextLine();
                System.out.print("Membresia: ");
                var membresia = Integer.parseInt(teclado.nextLine());
                var modCliente = new Cliente(idCliente, nombre, apellido, membresia);
                var modificar = ClienteDAO.modificarCliente(modCliente);
                if (modificar)
                    System.out.println("El cliente se ha modificado: " + modCliente);
                else
                    System.out.println("El cliente no se pudo modificar. ");
            }
            case 5 -> {
                System.out.println("--- Eliminar Cliente ---");
                System.out.print("Introduzca el ID del cliente que quiere eliminar: ");
                var idCliente = Integer.parseInt(teclado.nextLine());
                var clienteEliminar = new Cliente(idCliente);
                var eliminado = ClienteDAO.eliminarCliente(clienteEliminar);
                if (eliminado)
                    System.out.println("El cliente " + clienteEliminar + " ha sido eliminado");
                else
                    System.out.println("El cliente no se pudo eliminar");
            }
            case 6 -> {
                System.out.println("Esperamos volver a verte pronto");
                salir = true;
            }
            default -> {
                System.out.println("La opcion " + opcion + " es incorrecta");
                System.out.println("Seleccione una opción de la lista ");
            }
        }
        return salir;
    }
}