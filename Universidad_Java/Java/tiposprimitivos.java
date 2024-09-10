public class tiposprimitivos {
    public static void main(String[] args) {
        
        //TIPOS PRIMIRTIVOS DE TIPO ENTERO
        
        System.out.println("\n" ); //SALTO DE LINEA
        byte numeroByte = 10;
        System.out.println("Valor del numeroByte: " + numeroByte);
        System.out.println("Valor minimo de byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo de byte: " + Byte.MAX_VALUE);
        System.out.println("\n" ); //SALTO DE LINEA
        
        short numeroShort = 10;
        System.out.println("Valor del numeroShort: " + numeroShort);
        System.out.println("Valor minimo de Short " + Short.MAX_VALUE);
        System.out.println("Valor maximo de Short " + Short.MIN_VALUE);
        System.out.println("\n" ); //SALTO DE LINEA
        
        int numeroInt=10;
        System.out.println("Valor del numeroInt: " + numeroInt);
        System.out.println("Valor minimo de Int: " + Integer.MIN_VALUE);
        System.out.println("Valor máximo de Int: " + Integer.MAX_VALUE);
        System.out.println("\n" ); //SALTO DE LINEA

        long numeroLong=10;
        System.out.println("Valor del numeroLong: " + numeroLong);
        System.out.println("Valor minimo de Long: " + Long.MIN_VALUE);
        System.out.println("Valor máximo de Long: " + Long.MAX_VALUE);
        System.out.println("\n" ); //SALTO DE LINEA

        //TIPOS PRIMIRTIVOS DE TIPO DECIMAL

        float numeroFloat = (float) 1.5;  //SOLICITUD DE QUE DE CUALQUIER MANERA LO CONVIERTA EB EK FLOAT
        System.out.println("Valor del numeroFloat: " + numeroFloat);
        System.out.println("Valor minimo de Float: " + Float.MIN_VALUE);
        System.out.println("Valor máximo de Float: " + Float.MAX_VALUE);
        System.out.println("\n" ); //SALTO DE LINEA

        double numeroDouble = 10.7;
        System.out.println("Valor del numeroDouble: " + numeroDouble);
        System.out.println("Valor minimo de Double: " + Double.MIN_VALUE);
        System.out.println("Valor máximo de Double: " + Double.MAX_VALUE);
        System.out.println("\n" ); //SALTO DE LINEA

        //TIPOS PRIMITIVOS DE TIPO CHAR
        char miCaracter = 'a'; //solo puede asignar un unico caracter entre comilla simple
        System.out.println(miCaracter);
        System.out.println("\n" ); //SALTO DE LINEA

            //CARACTERES ESPECIALES
            //UNICODE
            char varChar ='\u0021';
            System.out.println("varChar: " + varChar);
            //DECIMAL 
            char varCharDecimal = 33;
            System.out.println("varCharDecimal "+varCharDecimal);

            char varCharSimbolo ='!';
            System.out.println("VarCharSimbolo: " + varCharSimbolo);
            System.out.println("\n" ); //SALTO DE LINEA

        //TIPOS PRIMITIVOS TIPO BOOLEAN
        boolean varBoolean = true;
        System.out.println("varBoolean: " + varBoolean);
            //EJEMPLO UTILIZACION
            if (varBoolean) {
                System.out.println("La bandera es verdadera");
            } else {
                System.out.println("La bandera es falsa");
            }
            System.out.println("\n" ); //SALTO DE LINEA

            //EJEMPLO DE UTILIZACION CON UNA EXPRESION
            System.out.println("EJEMPLO DE UTILIZACION CON UNA EXPRESION: ");
            var edad = 30;
            var esAdulto = edad>=18;

            if (esAdulto) {
                System.out.println("Eres mayor de edad.");
            } else {
                System.out.println("Eres menor de edad.");
            }
            System.out.println("\n" ); //SALTO DE LINEA



    System.out.println("\n" ); //SALTO DE LINEA

    //CONVERSIONES DE TIPOS PRIMITIVOS
        //CONVERSION DE TIPO VAR (CHAR)  A ENTERO 
        var varCharSimbolo3 = '!';
        System.out.println("varCharSimbolo3 " + varCharSimbolo3 );

        int variableEnteraSimbolo = '!';  
        System.out.println("variableEnteraSimbolo: " + variableEnteraSimbolo); //NOS MUESTRA EL CODIGO DECIMAL ASOCIADO AL SIMBOLO
        System.out.println("\n" ); //SALTO DE LINEA
     
            //otro ejemplo
            var varLetraA = 'a';
            System.out.println("varLetraA: " + varLetraA);
            int intLetraA = 'a';
            System.out.println("intLetraA: " + intLetraA);
            System.out.println("\n" ); //SALTO DE LINEA

        


        



    }
}
