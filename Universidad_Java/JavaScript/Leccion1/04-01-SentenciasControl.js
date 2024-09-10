// SENTENCIAS DE CONTROL

    // IF - ELSE
        // EJEMPLO 1
            let numero; 
            if  (numero > 10) {
                console.log ("El número " + numero + " es mayor que 10.");
            } else {
                console.log ("El número " + numero + " es más pequeño que 10.");
            }
            
        // EJEMPLO 2
            let condicion = true;
            if (3<2) {
                console.log ("Condicion verdadera");
            } else {
                console.log ("Condicion  falsa");
            }

        // EJEMPLO 3
            let num = 1;
            if (num == 1) {
                console.log ("Número 1");
            } else if (num == 2 ) {
                console.log ("Número dos");
            } else if (num == 3) {
                console.log ("Número tres");
            } else if (num == 4) {
                console.log ("Número cuatro");
            } else {
                console.log ("El número " + num + " no está entre 1 - 4.")
            }


    // SWITCH   -- ES DE TIPO EXTRICTO, DIFERENCIA ENTRE TIPO DE DATO. 
            let num4 = 1;
            let num4Texto = "Valor desconocido";
            switch (num4) {
                case 1:
                    num4Texto = "Número Uno";
                    break;
                case 2:
                    num4Texto = "Número Dos";
                    break;
                case 3:
                    num4Texto = "Número Tres";
                    break;
                case 4:
                    num4Texto = "Número Cuatro";
                    break;
                default: 
                    num4Texto = "Número no encontrado";
                    break;
            }
            console.log(num4Texto);


// CICLOS EN JAVASCRIPT

    // WHILE -- si la condicion no se cumple no se ejecuta el codigo 
            let contador = 0;

            while (contador < 3) {
                console.log (contador);
                contador++;
            }
            console.log ("El ciclo WHILE ha finalizado.");
    
    // DO WHILE - DIF - AL MENOS SE EJECUTA UNA VEZ 
            let contador2 = 0; 
            do {
                console.log (contador2);
                contador2++;
            } while (contador2 < 3);
            console.log ("El ciclo DO WHILE ha finalizado");

    // FOR -- 
            for (let contador = 0; contador <= 3; contador++) {
                console.log("Soy un bucle For, y mi contador es de " + contador);
            }
            console.log ("El ciclo FOR ha finalizado.");



// PALABRA RESERVADA 
    // BREAK;       USO -- PARA ROMPER EL CICLO 

            // EJEMPLO 1 - IMPRIMIR NUMEROS PARES
            for (let contador = 0; contador <= 10; contador ++) {
                if (contador % 2 == 0) {
                    console.log(contador);
                    break;
                }
            }
            console.log ("El ciclo FOR ha finalizado.");
    
    // CONTINUE     USO -- CONTINUACION CON LA SIGUIENTE ITERACIÓN 
            for (let contador = 0; contador <= 10;  contador++) {
                if (contador %2 !== 0) {
                    continue;   // IR A LA SIGUIENTE ITERACIÓN
                } 
                console.log (contador);
            }

    // ETIQUETAS (LABELS)   -- NO RECOMENDADA -- GO TO -- 
            inicio: 
            for (let contador = 0; contador <= 10;  contador++) {
                if (contador %2 !== 0) {
                    continue inicio;   // IR A LA SIGUIENTE ITERACIÓN
                } 
                console.log (contador);
            }