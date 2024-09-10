import java.util.Scanner;

public class tarea2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println ("Se solicita incluir la siguiente información acerca de un libro: ");
        System.out.println("Proporciona el titulo: ");
        var titulo = teclado.nextLine();

        System.out.println("Proporciona el autor: ");
        var autor = teclado.nextLine();

        System.out.println(titulo + " fue escrito por: " + autor);
        teclado.close();
    }
}
