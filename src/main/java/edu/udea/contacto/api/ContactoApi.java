package co.edu.udea.contacto.api;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.udea.contacto.dto.ContactoDto;

@RestController
@RequestMapping( path = "/", produces = MediaType.APPLICATION_JSON_VALUE )
public class ContactoApi
{

	@GetMapping( path = "/contacto" )
	public ResponseEntity<ContactoDto> findMyContact()
	{
		ContactoDto yo = ContactoDto.builder()
			.id(10L).nombre("John Fredy").apellido("Mejia Serna").telefono("3012352841")
			.correo("john.mejias@udea.edu.co").build();
		return ResponseEntity.ok( yo );
	}
}