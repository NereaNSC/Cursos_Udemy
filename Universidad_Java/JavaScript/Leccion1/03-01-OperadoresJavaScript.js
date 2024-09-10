// OPERADORES EN JAVASCRIPT
    let a = 3, b = 2;
    console.log ("a = " + a);
    console.log ("b = " + b);

    // SUMA
        let c = a + b;
        console.log("Resultado de la suma: a + b = " + c);
        
    // RESTA
        let d = a - b; 
        console.log("Resultado de la resta: a - b = " + d); 

    // MULTIPLICACIÓN
        let e = a * b;
        console.log ("Resultado de la multipliación: a * b = " + e);

    // DIVISIÓN
        let f = a / b;
        console.log ("Resultado de la división: a / b = " + f);

    // MODULO O RESIDUO DE LA DIVISION 
        let  g = a % b;
        console.log ("Resultado del modulo de: a % b = " + g);

    // EXPONENTE
        let h = a ** b;
        console.log ("Resultado de: a ** b = " + h);

    // INCREMENTO
        // PREINCREMENTO  -- PRIMERO SE INCREMENTA Y DESPUÉS SE LE ASIGNA EL VALOR O SE UTILIZA LA VARIABLE
        let  i = ++a;
        console.log ("Valor de A antes del PREincremento: " + a);
        console.log ("Valor de I despues del PREincremento: " + i);
        
        //POSTINCREMENTO -- PRIMERO SE LE ASIGNA VALOR O SE UTILIZA LA VARIABLE Y  DESPUÉS SE INCREMENTA
        let j = b++;
        console.log ("Valor de B antes del POSTincremento: " + b);
        console.log ("Valor de J despues del POSTincremento: " + j);

    // DECREMENTO
        // PREDECREMENTO -- PRIMERO SE DECREMENTA Y DESPUES SE LE ASIGNA EL VALOR O SE UTILIZA LA VARIABLE
        let k = --a;
        console.log ("Valor de A antes del PREdecremento: " + a);
        console.log ("Valor de K despues del PREdecremento: " + k);

        // POSTDECREMENTO -- PRIMERO SE LE ASIGNA VALOR O SE UTILIZA LA VARIABLE Y DESPUES DE DECREMENTA LA VARIABLE
        let l = b--;
        console.log ("Valor de B antes del POSTdecremento: " + b);
        console.log ("Valor de L despues del POSTdecremento: " + l);

// ORDEN DE PRECEDENCIA DE OPERADORES EN JAVASCRIPT
    let z = 1;

    // LAS EXPRESIONES DE EVALUAN DE IZQ A DERCH
        let m = a + b;
        console.log ("a + b = " + m);

        let n = b + a;
        console.log ("b + a = " + n);

    // ORDEN DE PREFERENIA DE LOS OPERADORES
        // PARENTESIS
        // CORCHETES
        // INCREMENTO - DECREMENTO
        // MULTIPLICACION 
        // DIVISION 
        // MODULO
        // SUMA Y RESTA

            // EJEMPLO 1
                let x = 4;
                
                let p = a * b + z / x;  // PRIMERO SE REALIZA MULTIPLICACION Y DIVISION Y POR ULTIMO SUMA 
                console.log ("a * b + z / x = " + p);

                let q = z + a * b / x;  // PRIMERO SE REALIZA MULTIPLICACION Y DIVISION Y POR ULTIMO SUMA
                console.log ("z + a * b / x = " + q);

            // EJEMPLO 2 
                let o = 5+4-3*2/8%7;
                console.log("5 + 4 - 3 * 2 / 8 % 7 = " + o); 
            
                console.log ("5 + 4 - 3 * 2 / 8 % 7 = ");   
                console.log ("= 5 + 4 - 6 / 8 % 7");            // PRIMERO MULTIPLICACIÓN
                console.log ( "= 5 + 4 - " + 0.75 + " % 7");    // SEGUNDO  DIVISIÓN   
                console.log ("= 5 + 4 - " + 0.75 );             // TERCERO MODULO
                console.log ("= 5 + 4 -  0.75");                // CUARTO Y ULTIMO SUMA Y RESTA
                console.log ("= " + o);


            // EJEMPLO 3 - MODIFICACION ORDEN POR PARENTESIS
                let r = (z + a) * b / x;
                console.log ("(z + a) * b / x = " + r);

// OPERADORES DE ASIGNACIÓN
    // 1º FORMA - ASIGNAR UNA VARIABLE CON UN VALOR Y MODIFICARLA.
        let s = 1;
        console.log ("s = " + s);
        s = 4;
        console.log ("s = " + s);

    // OPERADOR DE ASIGNACION COMPUESTO 
        // INCREMENTO
        s += 3;      // ES LO MISMO QUE ESCRIBIR s = s + 3
        console.log ("El resultado de: s += 3 es: " + s);

        // DECREMENTO
        s  -= 2;     // ES LO MISMO QUE ESCRIBIR s = s - 2
        console.log ("El resultado de: s -= 2 es: " + s);
        
        // MULTIPLICACION
        s *= 3;
        console.log ("El resultado de: s *= 3 = " + s);

        // DIVISIÓN
        s /= 5;
        console.log ("El resultado de s /= 5 = " + s);

// TIPOS DE OPERADORES
    let t = 3, v = 2, w = "3";
    
    // OPERADORES DE COMPARACIÓN

        // IGUALDADES
            z = t == v; 
            console.log ("t == v : " + z);

            // SOLO REVISA SI EL CONTENIDO DE LAS VARIABLES ES IGUAL, SIN IMPORTAL EL TIPO DE DATO 
                z = t == w;    
                console.log ("t == w : " + z); 

            // MANERA EXTRICTA - REVISA SI EL TIPO DE DATO ES EL MISMO Y SI EL CONTENIDO DEL MISMO. 
                z = t === w;   
                console.log ("t === w : " + z);  

        // DESIGUALDAD
            z = t != v;
            console.log ("t != v " + z);

            // SOLO REVISA SI EL CONTENIDO DE LAS VARIABLES ES DIFERENTE SIN IMPORTAL EL TIPO DE DATO
                z = t != w;
                console.log ("t != w " + z );

            // MANERA EXTRICTA - REVISA SI EL TIPO DE DATOS ES EL MISMO Y SI EL CONTENIDO ES EL MISMO
                z = t !== w;
                console.log ("t !== w " + z);

    // OPERADORES RELACIONALES
        // MENOR QUE 
            z = t < v;
            console.log ("t < v " + z);
        
        // MENOR O IGUAL QUE
            z = t <= w;
            console.log ("t <= w " + z); 

        // MAYOR QUE
            z = t > v;
            console.log ("t > v " + z);
        
        // MAYOR O IGUAL QUE
            z = t >= w;
            console.log ("t >= w " + z )

    // OPERADORES LOGICOS
        let num1 = 5;
        let num2 = 15; 
        let num3 = 5;
        let valMin = 0;
        let valMax = 10;

        // AND (&&)     // Ambas expresiones tiene que ser verdaderas si no devolvera falso. 
            if ( num1 >= valMin && num1 <= valMax) {  
                console.log ("El número " + num1 + " está dentro de rango. ");
            } else {
                console.log ("El número " + num1 + " está fuera de rango."); 
            }
        
            if ( num2>= valMin && num2 <= valMax) {  
                console.log ("El número " + num2 + " está dentro de rango. ");
            } else {
                console.log ("El número " + num2 + " está fuera de rango."); 
            }


        // OR (||)      // una o otra o ambas condiciones tiene que ser cierta = true 
            if (num1 == 5 || num2 == 5){    //Un numero es igual a 5 
                console.log("Al menos uno de los números es 5");
            }else{
                console.log("Ninguno de los números es 5")
            }

            if (num1 == 5 || num3 == 5) {   //Los dos numeros son igual a 5 
                console.log ("Al menos uno de los números es 5");
            } else {
                console.log ("Ninguno de los números es 5");
            }

    // OPERADORES TERNARIOS
            let resultado = (3<2) ? "verdadero" : "falso";
            console.log (resultado); 
            // Si la primera condicion es correcta respondera Verdadero
            // Si la primera condicion es falsa devolvera Falso. 

            let resultado2 = (3>2) ? "verdadero" : "falso";
            console.log (resultado2);

            // Ejemplo
                let numero = 9;
                resultado = numero % 2 == 0 ? "Número Par" : "Número Impar";
                console.log (resultado); 


// CONVERTIR STRING A NUMERO
    let miNumero = "10";
    console.log (typeof miNumero);

    let edad = Number(miNumero);
    console.log(typeof edad);

    // EJEMPLO 
            if (edad >= 18) {
                console.log ("Eres mayor de edad, puede votar");
            } else {
                console.log ("No eres mayor de edad, no puedes votar"); 
            }


// FUNCION isNam -- VERIFICAR SI EL VALOR DE LA VARIABLE  ES UN NÚMERO
    let edad2 = "18x";
    let edadReal = Number(edad2); 
    console.log (typeof edadReal);      // Nam - IS NOT A NUMBER

    if (isNaN (edad2)) {
        console.log (edad2 + " No es un número");
    } else {
        if (edad2 >= 18) {
        console.log ("Eres mayor de edad, puede votar");
    } else {
        console.log ("No eres mayor de edad, no puedes votar"); 
    }
    }