package edu.udea.contacto.repository;

import edu.udea.contacto.entity.Contacto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactoRepository extends CrudRepository<Contacto ,Long> {
}
