import java.util.Scanner;

public class conversiondetipo {
    public static void main(String[] args) {
        //CONVERSIONES DE TIPOS PRIMITIVOS

        //CONVERSION DE TIPO VAR (CHAR)  A ENTERO 
        System.out.println("CONVERSION DE TIPO VAR (CHAR)  A ENTERO ");
        var varCharSimbolo3 = '!';
        System.out.println("varCharSimbolo3: " + varCharSimbolo3 );

        int variableEnteraSimbolo = '!';  
        System.out.println("variableEnteraSimbolo: " + variableEnteraSimbolo); //NOS MUESTRA EL CODIGO DECIMAL ASOCIADO AL SIMBOLO
        System.out.println("\n" ); //SALTO DE LINEA
     
                //otro ejemplo
                var varLetraA = 'a';
                System.out.println("varLetraA: " + varLetraA);
                int intLetraA = 'a';
                System.out.println("intLetraA: " + intLetraA);
                System.out.println("\n" ); //SALTO DE LINEA


        //CONVERTIR UN TIPO STRING A UN TIPO INT
        System.out.println("CONVERTIR UN TIPO STRING EN UN INT");
        
        var edad = Integer.parseInt("20"); //
        System.out.println("Edad: " + edad);
        System.out.println("edad + 1 = " + (edad + 1 ));

        var edad50 = "20";
        System.out.println("edad + 1 = " + (edad50+1));
        System.out.println("\n" ); //SALTO DE LINEA


                //OTRO EJEMPLO
                var valorPI = Double.parseDouble("3.1416");
                System.out.println("ValorPI: " + valorPI);
                System.out.println("\n" ); //SALTO DE LINEA


                //OTRO EJEMPLO SOLICITANDO UN NUMERO 
                var teclado = new Scanner (System.in);

                System.out.println("Proporciona tu edad: ");
                edad = Integer.parseInt (teclado.nextLine ()); 
                System.out.println("Tu edad es: " + edad);
                System.out.println("\n" ); //SALTO DE LINEA


        //CONVERSION DE TIPO INT A STRING 
        System.out.println("CONVERSION DE TIPO INT A STRING");
        String edadTexto = String.valueOf(10);
        System.out.println("edadTexto: " + edadTexto);
                
                //ES LO MISMO QUÉ
                var edadTexto2 = String.valueOf(10);
                System.out.println("edadTexto2: " + edadTexto2);

    //RECUPERAR UN CARACTER DE UNA CADENA
    var caracter = "hola".charAt(1);   //de la cadena introducinda nos proporciona el valor que asignemos, se nombran de izq a drch. 
    System.out.println("Caracter 1 = " + caracter);

    System.out.println("Proporciona un caracter: ");
    caracter = teclado.nextLine().charAt(0); //como el usuario puede introducir un string, nosotros solo vamos a recoger el primer caracter.
    System.out.println("El caracter introducido es: " + caracter); //solo muestra por pantalla el priemr caracter introducido

        
       

    teclado.close();
    }
}
