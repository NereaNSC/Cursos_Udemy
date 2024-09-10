public class operadoresCondicionales {
    public static void main(String[] args) {

        //OPERADORES CONDICIONALES  (AND Y OR)

            // OPERADOR AND (&&)        //CONDICIONES DEL OPERADOR AND
                var a = 10;                     // TODOS LOS VALORES SON VERDADEROS = TRUE
                var valorMinimo = 0;            // ALGUNO DE LOS VALORES ES FALSO = FALSE
                var valorMaximo = 10;

                System.out.println("a = " + a);
                System.out.println("valorMinimo = " + valorMinimo);
                System.out.println("valorMaximo = " + valorMaximo);

                var resultado = ((a >= 0)  &&  (a <= 10));  //ejemplo operador AND (&&)
                System.out.println("resultado = ((a >= 0)  &&  (a <= 10)) = " + resultado);

                // EJERCICIO MUESTRA POR PANTALLA EL RESULTADO 
                if (resultado == true) {
                    System.out.println("Dentro de rango");
                } else {
                    System.out.println("Esta fuera de rango");
                }

                //OPERADOR OR (||)  //CONDICIONES DEL OPERADOR OR 
                                    // SI ALGUN VALOR ES VERDADERO = TRUE
                                    // SI TODOS LOS VALORES SON FALSOS = FALSO

                // EJERCICIO UN PADRE PUEDE IR A VER LOS PARTIDOS DE SU HIJO (OR)
                    // TRUE = ES DIA DE DESCANSO
                    // TRUE = SI SON VACACIONES

                var vacaciones = false;
                var diaDescanso = false;

                if (vacaciones || diaDescanso) { //EJEMPLO CON RESULTADO FALSO 
                    System.out.println("El padre puede acudir al partido");
                } else {
                    System.out.println("El padre esta ocupado");
                    System.out.println("No tiene vacaciones, ni dias de descanso");
                }

                //OTRO EJEMPLO CON RESULTADO TRUE (OR)
                var vacaciones2 = true;
                var diaDescanso2 = false;

                if (vacaciones2 || diaDescanso2) {
                    System.out.println("El padre puede acudir al partido");
                    System.out.println("Tiene o vacaciones o días libres disponibles");
                } else {
                    System.out.println("El padre esta ocupado");
                    System.out.println("No tiene vacaciones, ni dias de descanso");
                } 

            }
}
