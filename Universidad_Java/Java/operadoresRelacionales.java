public class operadoresRelacionales {
    public static void main(String[] args) {
        var a = 3;
        var b = 2;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //OPERADORES RELACIONALES
            //OPERADOR      MAYOR QUE
            var c = (a > b);
            System.out.println("c = (a > b ) = " + c);


            //OPERADOR      MAYOR O IGUAL QUE
            var d = (a >= b);
            System.out.println("d = (a >= b ) = " + d);

            //OPERADOR      MENOR QUE
            var e = (a < b);
            System.out.println("e = (a < b ) = " + e);

            //OPERADOR      MENOR O IGUAL QUE
            var f = (a <= b);
            System.out.println("f = (a <= b ) = " + f);

        //EJERCICIO PAR O IMAPAR
        System.out.println("Ejercicio par o impar." );
        if ( a % 2 == 0 ) {         //si 3 / 2 el resto es cero el numero es par, si no, es impar
            System.out.println("Es un número par");
        } else {
            System.out.println("El número es impar");
        }

        //EJERCICIO MAYORIA EDAD
        System.out.println("Ejercicio mayoria de edad." );
        var edad = 30;
        var adulto = 18;

        if (edad >= adulto) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

    }
}
