package edu.udea.contacto.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity

@Table(name="CONTACTOS")
@Component
public class Contacto {
   
    @Id
    @Getter @Setter private Long id;

    @Column
    @Getter @Setter private String nombre;

    @Column
    @Getter @Setter private String apellido;

    @Column
    @Getter @Setter private String correo;

    @Column
    @Getter @Setter private String telefono;

    

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return id.equals(Contacto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

// ToDo: Ask about the  public boolean object o




}
