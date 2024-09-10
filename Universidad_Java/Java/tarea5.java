import java.util.Scanner;

public class tarea5 {
    public static void main(String[] args) {
        //EL MAYOR DE DOS NÚMEROS
        Scanner teclado = new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.println("Proporciona el numero1 : ");
        numero1 = Integer.parseInt(teclado.nextLine());

        System.out.println("Proporciona el número2 : ");
        numero2 = Integer.parseInt(teclado.nextLine());

            if (numero1 > numero2 ) {
                System.out.println("El número MAYOR es: numero1 = " + numero1);
            } else {
                System.out.println("El número MAYOR es: número2 = " + numero2);
            }
    
            
        // OTRA MANERA DE HACERLO CON OPERADORES TERNARIOS
        int numero3;
        int numero4;

        System.out.println("Proporciona un numero3: ");
        numero3 = Integer.parseInt(teclado.nextLine());

        System.out.println("Proporciona un numero4: ");
        numero4 = Integer.parseInt(teclado.nextLine());

        var resultado = ((numero3 > numero4) ? numero3 : numero4);
        System.out.println("El numero mayor es: " + resultado);


        teclado.close();    
    }
}
