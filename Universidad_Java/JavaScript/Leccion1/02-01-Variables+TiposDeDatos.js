// VARIABLES EN JAVASCRIPT
    nombre = "Nerea";       // VARIABLE LITERALES - es posible declarar la variable sin necesidad de utilizar una palabra reservada, no son buenas practicas. 
    console.log (nombre);

     
    // TIPOS DE VARIABLES - VAR ACESIBLE DESDE CUALQUIER  LUGAR Y FUERA DE SU RANGO, SE RECOMIENDA NO UTILIZAR O TENER OJO AL UTILIZARLA, YA QUE, EN CASO CONTRARIO PUEDE SUPONER PROBLEMAS DE SEGURIDAD
        var  nombre;    // Declaración de variable con el tipo "var" y asignación del valor a la izquierda.
                        // El valor se asigna en tiempo real, es decir, cuando se utiliza o  se accede a la variable.
        
        console.log(nombre);    // Imprime undefined porque no se le ha dado un valor aún.
                                // Se puede utilizar para verificar si una variable existe.

        nombre = 'Juan';        // Asignación del valor a la derecha.
        console.log(nombre);    // Imprime Juan que es el valor almacenado en la variable nombre.


    // TIPO DE VARIBLE - LET    // La forma mas recomendable de declarar una variable. 
        let apellidoB;          // La palabra reservada "let" indica que la variable SOLO ESTÁ DISPONIBLE DENTRO DEL BLOQUE, O FUNCIÓN.   
        apellidoB = 'Pérez';   
        console.log (apellidoB);

    // TIPO DE VARIBLE - CONST
        const apellidoC = 'Fernández';  // La palabra clave "const" permite declarar variables que solo pueden ser escritas (asginadas) una vez,
                                        // las cuales no pueden ser reasignadas ni cambiados su tipo de datos.
        console.log(apellidoC);

    // BUENAS PRACTICAS PARA LA DECLARACION DE LAS VARIABLES
        let nombreCompleto3 = "Nerea Santos";
        console.log (nombreCompleto3);

        let d, e;
        d = 5, e = 15;
        let f = d + e;
        console.log (f);    // CONSOLE - FUNCION    // LOG - METODO

// CONCATENACION DE VARIABLES
    // Ejermplo Concatenacion 1
        var nombre = "Nerea";
        var apellido1 = "Santos";
        console.log("Mi nombre es "+nombre+" "+apellido1);

    // Ejermplo Concatenacion 2
        var nombre1 = "Nerea";
        var apellido11 = "Santos";
        var nombreCompleto = nombre1 + " " + apellido11;
        console.log (nombreCompleto);

    // Ejermplo Concatenacion 3
        var nombreCompleto2 = "Nerea" + " " + "Santos";
        console.log (nombreCompleto2);


    // Orden de concatenacion y preferencia de interpretación
        var x = nombre + 10 + 5;    
        console.log(x);         // lo muestra en pantalla como cadena de texto

        x = nombre + (10 + 5);
        console.log (x);        // al utilizar parentesis la prioridad esta en los parentesis por lo tanto realiza la suma

        x = 10 + 5 + nombre;
        console.log (x);        // al leer de izq a der  primero suma los numeros y luego concatena con la cadena
        console.log (typeof x);   // devuelve string por que todo esta concatenado



// TIPOS DE DATOS EN JAVASCRIPT - EJEMPLOS
/*
Las  variables se conocen como variables dinamicas, eso quiere decir, 
que en cualquier momento podemos modificarla y darle un nuevo valor, 
modificando el tipo de dato */

    // TIPO DE DATO CADENA
    var nombre = "Nerea"; //Cadena de datos
    console.log(nombre); 
    console.log(typeof nombre); // muestra el tipo de dato de la variable

    // TIPO DE DATO NUMERICO
    var edad = 25;        //Numero entero
    var peso = 70.5;     //Numero decimal o flotante
    console.log("Edad: "+edad+"\n Peso: "+peso);

    // TIPO DE DATO BOOLEANO
    var  estaBien=true;    //Valor verdadero

    console.log (estaBien);
    console.log (typeof estaBien); // muestra el tipo de dato de la variable. 


    // TIPO DE DATO OBJETO
    var objeto = {
        nombre : "Nerea",
        apellido1 : "Santos",
        edad:  26,
    }
    console.log(objeto);

        //  Accedemos a los valores del objeto con . (punto)
        console.log(objeto.nombre +" tiene "+objeto.edad+ " años");

    // TIPOS DE DATO FUNCION (en javascript) 
    // Permite realizar cierta tarea, puede ser reutilizada llamandola las veces necesarias
    function saludar(){
        return "Hola! Soy Nerea";
    }

    console.log (saludar);

    // TIPO DE DATO SYMBOL
    // destinado a creer un valor unico de una variable. 
    var simbolo1 = Symbol();
    console.log(simbolo1);
    var simbolo2 = Symbol("mi simbolo");
    console.log(simbolo2);

    // CLASES EN JAVASCRITP (Son funciones)
    class Persona {
        constructor (nombre, apellido1) {
            this.nombre = Nerea;
            this.apellido1 = Santos;
        }
    }
    console.log (typeof Persona);
  
    // TIPO UNDEFINED (ocurre cuando no le asignamos valor a una variable, 
    // tambien se le puede asignar a una variable el valor undefied)
    var x;
    console.log (x);

    x = undefined;
    console.log (x); 

    // TIPO NULL (no es lo mismo que undefined, null significa ausencia de valor)
    var y = null;
    console.log (y);
    console.log (typeof y); 

    // Arreglos en JavaScript son de tipo object
    var autos = ["BMW", "Audi", "Volvo"];
    console.log (autos);
    console.log (typeof autos);

    // Curiosidades JavaScript - VALORES VACIOS
    var z = "";     // asignacion a una variable de una cadena vacia. 
    console.log (z);
    console.log (typeof z);

 // REGLAS PARA DEFINIR NOMBRE DE VARIABLES IN JAVASCRIPT
    // SENSIBLE A LETRAS MAYUSCULAS
        // let nombreCompleto = "Nerea Santos";
        // console.log (nombrecompleto);    no va a funcionar por que la C de completo esta en minusculas
    // NO PUEDE COMENZAR POR UN NÚMERO
        // let 1nombreCompleto = "Nerea Santos";
    // LA SEGUNDA PALABRA DENTRO DE LA VARIABLE LA PRIMERA LETRA EN MAYUSCULA
        // let nombreCompleto = "Nerea Santos";
    // NO SE PUEDE UTILIZAR LOS NOMBRES DE LAS PALABRAS RESERVADAS PARA UTILIZARLOS EN NOMBRE DE NUESTRA VARIABLE
        // let break = 10;