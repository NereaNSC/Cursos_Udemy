public class operadoresAritmeticos {
    public static void main(String[] args) {
        float a=3, b=2;

        //SUMA
        float resultado = a + b ;
        System.out.println("resultado de a + b = " + resultado);

        //RESTA
        resultado = a - b;
        System.out.println("Resultado de a - b = " + resultado);

        //MULTIPLICACION
        resultado = a * b;
        System.out.println("Resultado de a * b = " + resultado);

        //DIVISION
        resultado = a / b;
        System.out.println("Resultado de a / b = " + resultado);

        //MODULO
        resultado = a % b;
        System.out.println("Resultado de a % b = " + resultado);


            //EJEMPLO ES PAR O IMPAR
            if (a % 2 == 0 ) {
                System.out.println("Es un número par");
            } else {
                System.out.println("Es un número impar");
            }

        //PARA QUE EL RESULTADO SEA DE TIPO FLOTANTE TIENEN QUE SERLO TODAS LAS DEMAS VARIABLES O CONVERTIRLAS

        
        

    }
}
