package gm.zona_fit;

import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.servicio.IClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class ZonaFitApplication implements CommandLineRunner {

	@Autowired
	private IClienteServicio clienteServicio;


	private static final Logger logger = LoggerFactory.getLogger(ZonaFitApplication.class);

	String nl = System.lineSeparator();

	public static void main(String[] args) {
		logger.info("Iniciando la aplicación: ");
		SpringApplication.run(ZonaFitApplication.class, args);
		logger.info("Finalizada la aplicación. \nHasta pronto!");
	}

	@Override
	public void run(String... args) throws Exception {
		zonaFitApp();
	}

	private void zonaFitApp () {
		var teclado = new Scanner(System.in);
		var salir = false;
		while (!salir) {
			var opcion = mostrarMenu(teclado);
			salir = ejecutarOpciones(teclado, opcion);
			logger.info(nl);
		}
	}

	private int mostrarMenu (Scanner teclado) {
		logger.info("""
		\n**** Aplicación Zona Fit ****
			 1. Listar Clientes
			 2. Buscar Cliente
			 3. Agregar Cliente
			 4. Modificar Cliente
			 5. Eliminar Cliente
			 6. Salir
			Elige una opción:\s""");
		return Integer.parseInt(teclado.nextLine());
	}

	private boolean ejecutarOpciones (Scanner teclado, int opcion) {
		var salir = false;
		switch (opcion) {
			case 1 -> {
				logger.info(nl + "--- Listado de Clientes: ---" + nl);
				List<Cliente> clientes = clienteServicio.listarClientes();
				clientes.forEach(cliente -> logger.info(cliente.toString() + nl));
			}

		}
		return salir;
	}
}