package edu.udea.estadoSolicitud;

import edu.udea.estadoSolicitud.service.SolicitudService;
import edu.udea.gestionllamadas.GestionLlamadasApplication;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class estadoSolicitudesApplication
{
    public static void main(String[] args) {
        SpringApplication.run(GestionLlamadasApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

    // Enable CORS
    public WebMvcConfigurer corsConfigurer(){
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("http://localhost:3000").allowedOrigins("http://localhost:8080");
            }
        };
    }

}
