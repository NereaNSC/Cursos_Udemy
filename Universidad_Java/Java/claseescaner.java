import java.util.Scanner;
public class claseescaner {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        String nombre;

        System.out.println ("Escribe tu nombre");
        nombre = teclado.nextLine();
        System.out.println("Hola " + nombre);

        System.out.println("Escribe el titulo: ");
        var titulo = teclado.nextLine ();
        System.out.println("Resultado: " + titulo + " " + nombre);
    
        teclado.close();
    }
}


