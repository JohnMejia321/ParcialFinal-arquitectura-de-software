package edu.udea.contacto.service;

import edu.udea.contacto.dto.ContactoDto;
import edu.udea.contacto.entity.Contacto;
import edu.udea.contacto.repository.ContactoRepository;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import javax.persistence.EntityNotFoundException;
import java.util.Optional;


@Service
public class ContactoService {
    private ContactoRepository contactoRepository;
    private ModelMapper modelMapper;


    public ContactoService( ContactoRepository contactopository, ModelMapper modelMapper){
        this.contactoRepository = contactopository;
        this.modelMapper = modelMapper;
    }

    public ContactoDto create(ContactoDto nuevoContacto){
        Contacto nuevo = modelMapper.map(nuevoContacto, Contacto.class);
        Contacto resultado = contactoRepository.save(nuevo);// 
        ContactoDto resultadoDTO = modelMapper.map(resultado,  ContactoDto.class);

        return  resultadoDTO;
    }



    public ContactoDto findById(Long id)
    {
        Optional<Contacto> encuentra = ContactoRepository.findById(id);
        Contacto encuentraSolicitud = encuentra.orElseThrow(EntityNotFoundException::new);
        return modelMapper.map(encuentraSolicitud, ContactoDto.class);
    }



    // ToDo: ask what does this update with the find and create
    public ContactoDto update(SolicitudDto SolicitudDto){
        findById(ContactoDto.getId());
        return create(ContactodDto);
    }

}
