public class operadoresUnarios {
    public static void main(String[] args) {

        //1º OPERADOR UNARIOS
        int a = 3;
        var b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("\n" ); //SALTO DE LINEA


        //2º OPERADOR - BOOLEAN
        var c = true;
        var d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("\n" ); //SALTO DE LINEA


        //3º OPERADOR UNARIO DE INCREMENTO  
            // PRE INCREMENTO (simbolo antes de la variable)
            var e = 3 ;
            var f = ++e;    // incremento de la variable = +1
            System.out.println("e = " + e);     // se incremento modificando su propio valor 
            System.out.println("f = " + f);
            System.out.println("\n" ); //SALTO DE LINEA


            //POST INCREMENTO (simbolo despues de la variable)
            var g = 5;
            var h = g++;    // primero se asigna el valor y luego se incrementa
            System.out.println("g = " + g);     // g se incrementa
            System.out.println("h = " + h);     // mantiene el valor de g original 

        //4º OPERADPR UNARIO DE DECREMENTO
            //PRE DECREMENTO (simbolo antes de la variable)
            var i = 7;      
            var j = --i;    
            System.out.println("i = " + i);     // se decrementa la variable - 1 modificando su propio valor
            System.out.println("j = " + j);

            //POST DECREMENTO (simbolo despues de la variable)
            var k = 9;
            var l = k--;
            System.out.println("k = " + k);     // se decrementa la variable original en -1 
            System.out.println("l = " + l);
    }
}
