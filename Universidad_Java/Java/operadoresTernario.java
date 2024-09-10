public class operadoresTernario {
    public static void main(String[] args) {

        //OPERADORES TERNARIOS 
        // SOLO SE RECOMIENDA UTILIZAR EN OPERACIONES SENCILLAS
            //SIMPLIFICACION ESTRUCTURA      IF ELSE     
            var resultado = ((3>2) ? "verdadero" : "falso") ;  
            System.out.println("resultado = " + resultado);

            var resultado2 = ((1>2) ? "verdadero" : "falso") ; 
            System.out.println("resultado2 = " + resultado2);

            
            //OTRO EJEMPLO
            var numero = 8;
            var resultado3 = (numero % 2 == 0) ? "numero par" : "numero impar";
            System.out.println("resultado3 = " + resultado3);

    }
}
