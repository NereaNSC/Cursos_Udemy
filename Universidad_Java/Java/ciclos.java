public class ciclos {
    public static void main(String[] args) {
    
        //CICLO CON WHILE
        //DADO UN NUMERO LO INTRODUCIMOS HASTA QUE CUMPLE LA CONDICION
        System.out.println("CICLO CON   WHILE...");
        var contador = 0;

        while (contador < 3) {
            System.out.println("Contador = " + contador);
            contador ++;
        }
        System.out.println("\n");


        //CICLO CON DO WHILE
        System.out.println("CICLO CON   DO...WHILE...");
        var contador2 = 0;

        do  {
            System.out.println("Contador2 = " + contador2);
            contador2++;
        } while (contador2 < 3); 


        //CICLO FOR 
        System.out.println("CICLO CON   FOR...");

        for (var contador3=0; contador3<3 ; contador3++) {
            System.out.println("Contador3 = " + contador3);
        }

       
        //  PALABRA RESERVADA     BREAK; 
            //VAMOS A GENERAR UN PROGRAMA DONDE SOLO NOS MUESTRE LOS NUMEROS PARES
            System.out.println("NÚMEROS PARES:");

            for (var contador4=0 ; contador4<4 ; contador4++) {
                if (contador4 % 2 == 0) {
                    System.out.println("Contador4 = " + contador4);
                    break;  //  CON BREAK, SOLO PERMITIMOS QUE EJECUTE EL CICLO UNA SOLA VEZ 
                }           //  SI LO ELIMINAMOS SE EJECUTARA HASTA CUMPLIR LA CONDICION
            } System.out.println("\n");

        //  PALABARAS RESERVADAR  CONTINUE
            System.out.println("NÚMEROS PARES: ");
            for (var contador5=0 ; contador5<4 ; contador5++) {
                if (contador5 % 2 != 0) {
                    continue; //SI NO ES NUMERO PAR VUELVE A EJECUTAR EL CICLO 
                }
                System.out.println("Contador5 = " + contador5);
            } 
            System.out.println("\n");

        
        //

    }
}
