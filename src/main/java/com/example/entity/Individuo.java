
package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
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
    
    @NotEmpty
    private String nombre;
    
    @NotEmpty
    private String apellido;
    
    //@NotNull
    private int edad;
    
    @NotEmpty
    private String telefono;
    
    @NotEmpty
    @Email
    private String correo;
    
}
