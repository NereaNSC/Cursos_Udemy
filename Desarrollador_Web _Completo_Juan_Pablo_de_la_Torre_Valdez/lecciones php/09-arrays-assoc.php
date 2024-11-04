<?php include 'includes/header.php';

$cliente = [
    'nombre' => 'Nerea',
    'saldo' => 200,
    'informacion' => [
        'tipo' => 'premium',
        'disponible' => 100
    ]
];

// Mostrar todo el arreglo
echo "<pre>";
var_dump($cliente['informacion']);
echo "</pre>";

// Mostrar el valor de la propiedad nombre
echo $cliente['nombre'];

// Mostrar el valor de la propiedad Disponible
echo $cliente['informacion']['disponible'];

// Agregar la propiedad al arreglo
$cliente['codigo'] = 1209192012;

// Mostrar todo el arreglo 
echo "<pre>";
var_dump($cliente);
echo "</pre>";


include 'includes/footer.php';
