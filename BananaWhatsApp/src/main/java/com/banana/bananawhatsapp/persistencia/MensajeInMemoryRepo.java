package com.banana.bananawhatsapp.persistencia;

import com.banana.bananawhatsapp.modelos.Mensaje;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class MensajeInMemoryRepo implements IMensajeRepository {
    Set<Mensaje> mensajes = new HashSet<>();
    private Integer num = 0;

    @Override
    public Mensaje crear(Mensaje mensaje) throws SQLException {
        mensaje();
        mensaje.setId(num + 1);
        mensajes.add(mensajes);

        return mensaje;
    }

}
