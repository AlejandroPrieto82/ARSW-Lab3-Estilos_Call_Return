package eci.edu.arsw.repositorio;


import org.springframework.stereotype.Repository;

import eci.edu.arsw.modelo.Mensaje;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class MensajeRepository {

    private final List<Mensaje> mensajes = new ArrayList<>();

    public List<Mensaje> findAll() {
        return mensajes;
    }

    public Optional<Mensaje> findById(Long id) {
        return mensajes.stream().filter(m -> m.getId().equals(id)).findFirst();
    }

    public Mensaje save(Mensaje mensaje) {
        mensajes.add(mensaje);
        return mensaje;
    }
}