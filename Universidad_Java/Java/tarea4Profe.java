import java.util.Scanner;

public class tarea4Profe {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Escribe tu solucion aqui
        System.out.println("Proporciona el alto:");
        int alto = Integer.parseInt(teclado.nextLine());
        System.out.println("Proporciona el ancho:");
        int ancho = Integer.parseInt(teclado.nextLine());
        int area = alto * ancho;
        int perimetro = (alto + ancho) * 2;
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);

    teclado.close();
    }
}