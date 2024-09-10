// DECLARACION DE LA FUNCION 
    function miFuncion (a, b) {
        // Para saber cuantos argumentos tiene nuestra funcion
        console.log (arguments.length);     
        return a + b;  
    }   

    // LLAMAMOS A LA FUNCIÓN 
        miFuncion (2, 3);
        let resultado = miFuncion (2,3);
        console.log("a + b = " + resultado);
    
    // FUNCIONES DE TIPO EXPRESION - ASIGNAR FUNCIONES A UNA VARIABLE 
        let sumar = function (c, d) {return c + d };
        
        resultado = sumar (5, 5);
        console.log("c + d = " + resultado);

    // FUNCIONES DE TIPO SELF INVOKING 
        (function (a , b) {
            console.log("Ejecutando la función: " + (a + b));
        }) (3, 4);

    // FUNCIONES COMO OBJETOS
        console.log (typeof miFuncion);
        // METODO - TOSTRING PARA QUE NOS MUESTRE NUESTRA FUNCION COMO TEXTO
        var miFuncionEnTexto = miFuncion.toString ();
        console.log (miFuncionEnTexto);
        
    // FUNCIONES FLECHA 
        // En este caso el ejemplo es equivalente a la funcion tipo expresion
        const sumarFuncionTipoFlecha = (a, b) =>  a + b ;
        console.log(sumarFuncionTipoFlecha(10, 8));
        
        // o 
        resultado = sumarFuncionTipoFlecha (7,9);
        console.log (resultado);
    
    // DIF ENTRE ARGUMENTOS Y PARAMETROS    
        // - PARAMETROS:  SON VARIABLES QUE RECIBE LA FUNCION.
        // - ARGUMENTOS:  SON LOS VAROLES DE ESAS VARIABLES PARA REALIZAR LAS OPERACIONES DE LA FUNCION O METODO. e

    // EJEMPLO
        let suma = function (f, g) {
            console.log (arguments[0]);  // ASI ACCEDEMOS AL PRIMER ARGUMENTO DE LA FUNCION 
            console.log (arguments[1]);     // ACCEDEMOS AL SEGUNDO ARGUMENTO DE LA FUNCION 
            return f + g;                   // RETORNO DE LA FUNCION
        }

        resultado = sumar (3, 6);
        console.log (resultado);