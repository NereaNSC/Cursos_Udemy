import java.util.Scanner;

public class tarea6 {
    public static void main(String[] args) {
        //CREA UN SISTEMA DE CALIFICACIONES 
        //  El usuario proporcionará un valor entre 0 y 10.
            //  Si está entre 9 y 10: imprimir una A
            //  Si está entre 8 y menor a 9: imprimir una B
            //  Si está entre 7 y menor a 8: imprimir una C
            //  Si está entre 6 y menor a 7: imprimir una D
            //  Si está entre 0 y menor a 6: imprimir una F
            //  cualquier otro valor debe imprimir: Valor desconocido
        Scanner teclado = new Scanner(System.in);

        System.out.println("Proporciona un valor entre 0 y 10: ");
        var valorIntroducido = Integer.parseInt(teclado.nextLine());
        var calificacion="El valor introducido no es valido";

        switch (valorIntroducido) {
            case 1: case 2: case 3: case 4: case 5: 
                calificacion = "F";
                break;
            case 6: 
                calificacion = "D";
                break;
            case 7:
                calificacion = "C";
                break;
            case 8:
                calificacion = "B";
                break;
            case 9: case 10: 
                calificacion = "A";
                break;
            default:
                calificacion = "El valor añadido no es válido";
        }

        System.out.println("El valor introducido pertenece al tipo de calificación: " + calificacion);


        //MANERA PROFE
        System.out.println("Proporciona un valor entre 0 y 10:");
        int calificacion2 = Integer.parseInt(teclado.nextLine());

        //Si esta entre 9 y 10 imprimir: A
        if (calificacion2 >= 9 && calificacion2 <= 10)
            System.out.println("A");
        //Si esta entre  8 y menor a 9 imprimir: B
        else if(calificacion2 >= 8 && calificacion2 < 9)
            System.out.println("B");
        //Si esta entre 7 y menor a 8 imprimir: C
        else if(calificacion2 >= 7 && calificacion2 < 8)
            System.out.println("C");
        //Si esta entre 6 y menor a 7 imprimir: D
        else if(calificacion2 >= 6 && calificacion2 < 7)
            System.out.println("D");
        //Si esta entre 0 y menor a 6 imprimir: F
        else if(calificacion2 >= 0 && calificacion2 < 6)
            System.out.println("F");
        //Si no esta en el rago, imprimir: Valor desconocido
        else
            System.out.println("Valor desconocido"); 

    
    teclado.close();
    }
}
