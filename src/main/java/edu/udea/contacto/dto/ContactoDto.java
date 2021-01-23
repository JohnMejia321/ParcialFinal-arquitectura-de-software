package edu.udea.contacto.dto;

import lombok.Getter;
import lombok.Setter;



public class ContactoDto {

    @Getter @Setter private Long id;
    @Getter @Setter  private String nombre;
    @Getter @Setter  private String apellido;
    @Getter @Setter   private String correo;
    @Getter @Setter   private String telefono;
    
}
