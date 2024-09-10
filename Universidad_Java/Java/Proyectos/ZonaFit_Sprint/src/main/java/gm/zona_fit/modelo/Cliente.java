package gm.zona_fit.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data                   // Generar metodos Get y Set para la clase
@NoArgsConstructor      // Agregar constructor vacio
@AllArgsConstructor     // Agregar un constructor con todos los atributos
@ToString               // Agregar metodo to string
@EqualsAndHashCode      // Agregar metodo equals and hash code

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String apellido;
    private Integer membresia;
}