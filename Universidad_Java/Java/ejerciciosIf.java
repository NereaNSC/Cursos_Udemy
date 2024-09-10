import java.util.Scanner;

public class ejerciciosIf {
    public static void main(String[] args) {
    System.out.println("\n");
    
    //ESTRUCTURA DEL IF  ELSE 
        System.out.println("ESTRUCTURA DEL IF + ELSE");
        var condicion = false;

        if (condicion == true) {
            System.out.println("La condicion es verdadera: " + condicion);
        } else {
            System.out.println("La condicion es falsa: " + condicion);
        }

        // EJEMPLO 1 
        var numero = 2;
        var numeroTexto = "Número desconocido";

        if (numero == 1 ) {
            numeroTexto = "Numero Uno";
        } else  if (numero == 2) {
            numeroTexto = "Numero Dos";
        } else if (numero == 3) {
            numeroTexto = "Número Tres";
        } else if (numero == 4) {
            numeroTexto = "Número Cuatro";    
        } else {
            numeroTexto = "Número no encontrado";
        }

        System.out.println("numeroTexto = " + numeroTexto);


        // EJEMPLO 2    ESTACIONES DEL AÑO SEGUN EL MES INTRODUCIDO
        var estacion = "Estacion desconocida";

        Scanner teclado = new Scanner(System.in);
        System.out.println("Proporcione el número de un mes: ");
        var mes = Integer.parseInt(teclado.nextLine());

        if (mes == 1 || mes == 2 || mes == 12) {
                estacion = "invierno";
        } else if ( mes == 3 || mes == 4 || mes == 5) {
                estacion ="primavera";
        } else if (mes == 6 || mes == 7 || mes == 8) {
                estacion = "verano";
        } else if (mes == 9 || mes == 10 || mes == 11) {
                estacion = "otoño";
        } 

        System.out.println("La estación es: " + estacion);


        // EJEMPLO 3    





    teclado.close();
    }
}

