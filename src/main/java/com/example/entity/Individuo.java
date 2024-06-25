
package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;
//import jakarta.persistence.Entity;

@Data
@Entity
@Table(name = "individuo")
public class Individuo implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_individuo;
    
    private String nombre;
    private String apellido;
    private int edad;
    private String telefono;
    private String correo;
    
}
