import java.util.Scanner;

public class tarea3 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        System.out.println("Proporciona el nombre: ");
        String nombre = teclado.nextLine();
        
        System.out.println("Porporciona el id: ");
        int id = Integer.parseInt(teclado.nextLine());

        System.out.println("Proporciona el precio: ");
        double precio = Double.parseDouble(teclado.nextLine());

        System.out.println("Proporcions el envio gratuito: ");
        boolean envioGratuido = Boolean.parseBoolean(teclado.nextLine());

        System.out.println("\n" ); //SALTO DE LINEA

        System.out.println(nombre + "  #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio Gratuido: " + envioGratuido);
        
    teclado.close();
    }
}
