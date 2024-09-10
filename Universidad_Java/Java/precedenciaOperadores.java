import java.util.Scanner;

public class precedenciaOperadores {
    public static void main(String[] args) {
        
        //PRECEDENCIA DE OPERADORES - ORDEN DE PRIORIDAD DE LOS OPERADORES
        var x= 5;
        var y = 10;
        var z = ((++x) + (y--));    // PRE INCREMENTACION DE X + POST DECREMENTO DE Y          
        System.out.println ("x = " + x);                // X = 6 
        System.out.println("y = " + y);                 // y = 9 
        System.out.println("z = ((++x) + (y--))");   // z = 6 + 10 = 16  //esta es la prioridad de las operaciones
        System.out.println("z = 6 + 10");
        System.out.println("z = " + z);

            // EJEMPLO 2 
            var resultado = 4 + 5 * 6 / 3 ;
            System.out.println("¿Cuál es la prioridad de la siguiente operación?");
            System.out.println("resultado = 4 + 5 * 6 / 3 ");
            System.out.println("resultado = [4 + ((5 * 6) / 3)] ");
            System.out.println("resultado = [4 + (30 / 3)]");
            System.out.println("resultado = [4 + 10]");
            System.out.println("resultado = " +resultado);
            System.out.println("\n");

            // EJEMPLO 3
            var resultado2 = (4 + 5) * 6 / 3 ;
            System.out.println("¿Cuál es la prioridad de la siguiente operación?");
            System.out.println("resultado2 = (4 + 5) * 6 / 3");
            System.out.println("resultado2 = [(9 * 6) / 3]");
            System.out.println("resultado2 = " + resultado2);

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

            System.out.println("El area del rectangulo es: " + area);
            System.out.println("el perimetro del rectangulo es: " + perimetro);



        teclado.close();
    }
}
