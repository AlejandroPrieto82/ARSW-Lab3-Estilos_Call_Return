package eci.edu.arsw.service;

import eci.edu.arsw.modelo.Mensaje;
import eci.edu.arsw.repositorio.MensajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MensajeService {

    @Autowired
    private MensajeRepository repository;

    public List<Mensaje> getMensajes() {
        return repository.findAll();
    }

    public Optional<Mensaje> getMensajeById(Long id) {
        return repository.findById(id);
    }

    public Mensaje guardarMensaje(Mensaje mensaje) {
        return repository.save(mensaje);
    }
}
