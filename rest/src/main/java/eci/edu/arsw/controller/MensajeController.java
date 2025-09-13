package eci.edu.arsw.controller;

import eci.edu.arsw.modelo.Mensaje;
import eci.edu.arsw.service.MensajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/mensajes")
public class MensajeController {

    @Autowired
    private MensajeService service;

    @GetMapping
    public List<Mensaje> getMensajes() {
        return service.getMensajes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Mensaje> getMensaje(@PathVariable Long id) {
        Optional<Mensaje> mensaje = service.getMensajeById(id);
        if (mensaje.isPresent()) {
            return ResponseEntity.ok(mensaje.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Mensaje crearMensaje(@RequestBody Mensaje mensaje) {
        return service.guardarMensaje(mensaje);
    }
}
