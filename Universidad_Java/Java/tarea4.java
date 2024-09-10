import java.util.Scanner;

public class tarea4 {
    public static void main(String[] args) {
        //En el siguiente ejercicio se solicita calcular el área y 
        // + el perímetro de un Rectángulo
        int alto ;
        int ancho;
        Scanner teclado = new Scanner (System.in);

        System.out.println("Vamos a calcular el Área y el Perímetro de un rectángulo");
        System.out.println("Proporciona el alto:");
        alto = teclado.nextInt();

        System.out.println("Proporciona el ancho: ");
        ancho = teclado.nextInt();

        var area = (alto * ancho);
        int perimetro = (alto + ancho) * 2;

        System.out.println("El área del rectángulo es: " + area);
        System.out.println("El perímetro del rectángulo es: " + perimetro);
        
        teclado.close();
    }
}
