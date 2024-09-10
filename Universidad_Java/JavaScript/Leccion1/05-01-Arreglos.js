// ARREGLOS
        // Declaracion de arreglo algo anticuada. 
            let autos2 = new  Array("BMW", "Mercedes", "Volvo");     
            
        // Buenas practicas para declarar arreglos
            const autos = ["BMW" , "Mercedes" , "Volvo"] ;        
            console.log (autos);

// MANEJO DE ARREGLOS
        console.log (autos [0]);        // Hacedemos al primer indice

        // PARA RECORRER TODOS LOS INDICES DEL ARREGLO 
            for (let contador = 0; contador < autos.length; contador++) {
                console.log(contador + " " + autos[contador])   // Imprimimos el valor en cada iteracion
            }

        // MODIFICAR  VALORES EN UN ARREGLO
            autos [1] = "TOYOTA";
            console.log ("Nueva marca: "+ autos[1]);    // Mostramos la nueva marca

        // AGREGAR UNO O VARIOS ELEMENTOS A UN ARREGLO 
            autos.push ();
            autos.push ("Ford");                       // Agregamos solo uno
            autos.push ("Audi","VW","Skoda")          // Agregamos varios elementos
            
            for (let i = 0; i < autos.length; i++) {
                console.log (i + " " + autos [i]);     // Mostramos todo el contenido del arreglo
            }
        
        // OTRA FORMA DE AGREGAR UN ELEMENTO AL ARREGLO 
            console.log (autos.length);               // Muestra cuantos elemntos tiene el arreglo
            autos[autos.length]= "Peugeot";           // Agregando un elemento mas al final
            console.log (autos);

        // AGREGAR ELEMENTOS EN INDICES SUPERIORES - RESERVANDO HUECOS - NO RECOMENDABLE A MENOS QUE SEA NECESARIO
            autos [9] = "Seat";                        // Intentamos agregar a una posicion que no existe, se crea vacia hasta esa posicion
            console.log (autos);

        // IDENTIFICAR UN ARREGLO, SALER SI ES UN ARREGLO
            console.log (Array.isArray(autos));     // LE PREGUNTAMOS SI ES UN ARRAY 

            console.log (autos instanceof Array);   // OTRA MANERA DE PREGUNTARLE SI ES UN ARRAY
        