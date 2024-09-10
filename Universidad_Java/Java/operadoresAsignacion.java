public class operadoresAsignacion {
    public static void main(String[] args) {
        
        //OPERADORES DE ASIGNACION 
        int a=3, b=2;
        int c = a + 5 - b;
        System.out.println("Resultado de c = " + c);
        
        //OPERADOR DE ASIGNACION PERO DE COMPOSICION
        System.out.println("Resultado de a = " + a);
            // SUMA = A + 1 
            a += 1 ;  // a = a+1
            System.out.println("Resultado de a + 1 = " + a);
            // SUMA = A + 3 
            a += 3 ;
            System.out.println("Resultado de a + 3 = " + a);
            // RESTA = A - 2 
            a -= 2;
            System.out.println("Resultado de a - 2 = " + a);
            // RESTA = A - 1 
            a -= 1;
            System.out.println("Resultado de a - 1 = " + a);
            //MULTIPLICACION A * 2 
            a *= 2;
            System.out.println("Resultado de a * 2 = " + a);
            //DIVISION  A/3
            a /= 3;
            System.out.println("Resultado de a / 3 = " + a);
            //MODULO A%3
            a %= 3;
            System.out.println("Resultado de a % 3 = " +a);

            System.out.println("\n" ); //SALTO DE LINEA


        //OPERADORES DE ASIGNACION Y RELACIONALES
            //OPERADORES DE IGUALDAD
            var numero1 = 3;
            var numero2 = 2;
            var numero3 = (numero1==numero2);   //si la condicion es cierta nos devuelve true y si el falsa, false
            System.out.println("numero1 = " + numero1);
            System.out.println("numero2 = " + numero2);
            System.out.println("numero3 = (numero1 == numero2) = " + numero3); 
            
            var numero4 = (numero1!= numero2); //numero1 es distinto de numero2,  true
            System.out.println("numero4 = (numero1 != numero2) = " + numero4);

            //OPERADORES DE IGUALDAD CON STRING
            var cadena1 = "Hola";
            var cadena2 = "Adios"; 
            System.out.println("Cadena1 = " + cadena1);
            System.out.println("Cadena2 = " + cadena2);

            var cadena3 = (cadena1 == cadena2);     //comparacion referencia de objetos 
            System.out.println("Cadena3 = (cadena1 == cadena2) = " + cadena3);

            var cadena4 = cadena1.equals(cadena2);  //comparacion de contenido de la cadena
            System.out.println("cadena4 = (cadena1.equals(cadena2)) = " + cadena4);

            var cadena5 = "Hola";
            cadena4 = cadena1.equals(cadena5);  //comparacion de contenido de la cadena
            System.out.println("cadena4 = (cadena1.equals(cadena5)) = " + cadena4);
            
            System.out.println("\n"); //salto linea
    }
}
