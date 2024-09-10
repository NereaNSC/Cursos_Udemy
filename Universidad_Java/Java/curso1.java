public class curso1 {
    public static void main (String args []) {
        //Definimos valor de la variable
        int miVariableEntera = 10;
        System.out.println (miVariableEntera);

        //Modificacion valor variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);

        String miVariableCadena = "Buenos días";
        System.out.println(miVariableCadena);

        miVariableCadena = "Buenas tardes";
        System.out.println(miVariableCadena);

        // var - inferencia de tipos en Java
        var miVariableEntero =1.5;
        System.out.println(miVariableEntero);

        var miVariableCadena2 ="Me llamo Nerea Santos";
        System.out.println(miVariableCadena2);
        
        //Ejercicio Concatenacion
        var usuario ="Nerea";
        var titulo ="Ingeniera Informatica";
        var union = titulo + " " + usuario;
        System.out.println ("union = " + union);
        System.out.println("Mi nombre es " + usuario + " y soy " + titulo);

        var i = 3;
        var j = 4; 
        System.out.println(i + " " + j );

        System.out.println(i+j); // SUMA DE LOS NUMEROS
        System.out.println(i+j+usuario); //Realiza la suma y concatena String
        System.out.println(usuario+i+j); //CONTEXTO CADENA, encuentra una cadena y lo demas lo concatena
        System.out.println(usuario + (i+j)); // realiza la suma y concatena el reto

        /*CARACTERES ESPECIALES JAVA */
        var nombre ="Nerea";
        System.out.println("Nueva line: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Tabulador: \b" + nombre);
        System.out.println("Comilla simple: \'" + nombre + "\'");
        System.out.println("Comillas dobles: \"" + nombre + "\""); //COMILLAS DOBLES
    }
}