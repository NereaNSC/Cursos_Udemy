import java.util.Scanner;

public class estructuraSwitch {
    public static void main(String[] args) {
        //ESTRUCTURA SWITCH
        var numero = 3;
        var numeroTexto = "Valor desconocido";
            switch (numero) {
                case 1:     
                        numeroTexto = "Número 1";
                        break;
                case 2:
                        numeroTexto = "Número 2";
                        break;
                case 3:
                        numeroTexto = "Número 3";
                        break;
                case 4:
                        numeroTexto = "Número 4";
                        break;

                default :
                        numeroTexto = "Caso no encontrado";
                        break;
            }
        System.out.println("numeroTexto = " + numeroTexto);

        // EJEMPLO 2    ESTACIONES DEPENDIENDO DEL NUMERO DEL MES INTRODUCIDO
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Proporciona el número de un mes: ");
        var mes2 = Integer.parseInt(teclado.nextLine());

        var estacion="Estacion desconocida"; 

        switch (mes2) {
            case 1: case 2: case 12:
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                estacion = "Otono";
                break;
            default:
                estacion = "El mes introducido no pertenece a ninguna estacion";
                break;
        }
        System.out.println("El mes introducido pertenece a la estacion: " + estacion);
        



    teclado.close();
    }
}
