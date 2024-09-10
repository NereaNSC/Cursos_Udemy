// EJERCICIO 1 -- HOLA MUNDO 
    var nombre = "Hola Mundo!";
    console.log(nombre);

// EJERCICIO 2 -- NUMERO PAR 
    let a = 10;

    if (a % 2 == 0) {
        console.log ("El número A es par");
    } else {
        console.log ("El número A es impar"); 
    }

// EJERCICIO 3 -- ES MAYOR DE EDAD?
    let edad = 20;
    let adulto = 18;

    if (edad >= adulto) {
        console.log ("La persona tiene " + edad + " años, es mayor de edad. ");
    } else {
        console.log (" la persona tiene " + edad + " años, por lo que, es menor de edad");
    }

// EJERCICIO 4 -- EL PADRE PUEDE ASISTIR AL PARTIDO DEL NIÑO?
    let vacaciones = false, diaDescanso = true;

    if (vacaciones || diaDescanso) {
        console.log ("El padre puede asistir al partido");
    } else {
        console.log ("El padre no puede asistir al partido"); 
    }


// EJERCICIO 5 -- UTILIZACION DE OPERADOR TERNARIO Y CONVERTIR UN STRING EN UN NÚMERO
    // Con ena edad dada de 20 años, mediante un operadore ternario, comprobar si la persona puede votar. 
    let miEdad = "20";
    let edadReal = Number(miEdad);
    let resultadoVoto = edadReal >= 18 ? "Tiene edad suficiente para votar" : "No tiene la edad suficiente para votar"; 
    console.log (resultadoVoto); 

    let miEdad2 = "18"; 
    let  resultadoVoto2 = (Number(miEdad2 >= 18)) ? "Puedes votar" : "No puedes votar";
    console.log (resultadoVoto2);

// EJEMPLO 6 
    let b = 5 ;
    let c = 10;
    
    let d = ++b + c--;  // B se incrementa directamente, C la proxima vez que lo utilicemos sera c-1
    console.log("d = ++b + c-- = " + d); 
    console.log ("Valor de b:  " + b);
    console.log ("Valor de c: " + c );
    
// EJEMPLO 7 
    let resultado = 4 + 5 * 6 / 3;  // La operacion se ejecuta por preferencia, primero  se multiplica y se divide y luego se suman los resultados por orden de izq a drch. 
    console.log ("La operacion es: 4 + 5 * 6 / 3 = " + resultado); 

    resultado = 3 / 6 * 5 + 4;  // La operacion se ejecuta por preferencia, primero  se multiplica y se divide y luego se suman los resultados por orden de izq a drch. 
    console.log ("la operacion  es: 3 / 6 * 5 + 4 = "+resultado); 

    resultado = (4 + 5 ) * 6 / 3;
    console.log ("La operacion es: ( 4 + 5 ) * 6 / 3 = " + resultado);  

// EJEMPLO 8 - ESTACIONES DEL AÑO CON IF
    let mes = 4;
    let estacion; 
    if (mes == 12 || mes == 1 || mes == 2) {
        estacion = "invierno";
    } else if (mes == 3 || mes == 4 || mes == 5) {
        estacion = "primavera";
    } else if (mes == 6 || mes == 7 || mes == 8 ) {
        estacion = "verano";
    } else if (mes == 9 || mes == 10 || mes == 11) {
        estacion = "otoño";
    } else  {
        estacion = "El valor introducido es erroneo por lo que no pertenece a ninguna estacion.";
    }

    console.log ("El mes " + mes + " pertenece a la estacion " + estacion);

// EJEMPLO 9 - CALCULO DE HORA DEL DÍA CON IF
    let hora = 14;
    let saludo;

    if (hora >= 6 && hora <= 11) {
        saludo = "Buenos días";
    } else if (hora >= 12 && hora <= 18) {
        saludo = "Buenas tardes";
    } else if (hora >= 19 && hora <= 24) {
        saludo = "Buenas noches";
    } else if (hora >= 0 && hora <= 6) {
        saludo = "Durmiendo";
    } else {
        saludo = "Valor incorrecto";
    }
    console.log(saludo + ", son las " + hora + " horas.");

// EJEMPLO 10 - CALCULO ESTACION CON SWITCH
    let mes2 = 2;
    let estacion2 = "Estacion desconocida";

    switch (mes2) {
        case 1: case 2: case 12: 
            estacion2 = "Invierno";
            break;
        case  3: case 4: case 5: 
            estacion2 = "Primavera";
            break;
        case 6: case 7: case 8:
            estacion2 = "Verano";
            break;
        case 9: case 10: case 11:
            estacion2 = "Otoño";
            break;
        default:
            estacion2 = "Valor incorrecto. Estación desconocida.";
            break;
    }
    console.log ("El mes: " + mes2 + ".  " + estacion2);

// EJEMPLO 11 -- IMPRIMIR NUMEROS PARES ENTRE 0 - 10 CON FOR
    for (let contador = 0; contador <= 10; contador++) {
        if (contador %2 == 0) {
            console.log (contador);
        }
    }
    console.log ("El ciclo FOR ha finalizado."); 

// EJEMPLO 12 -- IMPRIMIR NÚMEROS PARES ENTRE 0 - 10 CON WHILE
    let contador3 = 0;
    while (contador3 <=10) {
        if (contador3 %2 == 0) {
            console.log (contador3);
        }
    }
    console.log ("El ciclo WHILE ha finalizado."); 

// EJEMPLO 13 -- IMPRIMIR NÚMEROS PARES ENTRE 0 - 10 CON DO WHILE.
    let contador4 = 0;

    do {
    } while (contador4 <= 10); {
        if (contador4 %2 == 0) {
            console.log (contador4);
        }
    }
    console.log ("El ciclo DO WHILE ha finalizado."); 

// EJEMPLO 12 -- SUMAR TODOS LOS ARGUMENTOS DE UNA FUNCION
    let resultado2 = sumarArgs (5 , 4, 13, 10, 9); 
        function sumarArgs () {
            let suma = 0;
            for (let i = 0; i < arguments.length; i ++ ) {
                suma += arguments [i];
            }
            return suma;
        }; 

        console.log ("La suma de todos los argumentos = " + resultado2);