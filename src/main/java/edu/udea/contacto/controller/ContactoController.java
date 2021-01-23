package edu.udea.contacto.controller;

import com.sun.istack.NotNull;
import edu.udea.contacto.dto.ContactoDto;
import edu.udea.contacto.service.ContactoService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@CrossOrigin (origins = "http://localhost:8080", maxAge = 3600)
@RestController
@RequestMapping(path= "/contactos")

public class ContactoController {

    private ContactoService contactoService;

    public ContactoController(ContactoService contactoService){
        this.contactoService= contactoService;
    }

   
   @CrossOrigin (origins = "http://localhost:8080", maxAge = 3600)
    @PutMapping
    public ResponseEntity<ContactoDto> update(@RequestBody ContactoDto contactoDTO){
        return ResponseEntity.ok(contactoService.update(contactoDTO));
    }



    @CrossOrigin (origins = "http://localhost:8080", maxAge = 3600)
    @GetMapping("/{id}")
    public ResponseEntity<ContactoDto> findById(
            @PathVariable @NotNull Long id
    ){
        return ResponseEntity.ok(ContactoService.findById(id));
    }



}
