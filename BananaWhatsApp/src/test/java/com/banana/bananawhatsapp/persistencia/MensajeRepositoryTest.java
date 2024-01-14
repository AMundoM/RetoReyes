package com.banana.bananawhatsapp.persistencia;

import com.banana.bananawhatsapp.modelos.Mensaje;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

class MensajeRepositoryTest {

    IMensajeRepository repo;

    @Autowired
    IMensajeRepository mensajeRepository;

    @Test
    void dadoUnMensajeValido_cuandoCrear_entoncesMensajeValido() throws Exception{
        Mensaje nuevo = new Mensaje(null,"usurem","usudest","primer msj", LocalDate.now());
        repo.crear(nuevo);
    }

    @Test
    void dadoUnMensajeNOValido_cuandoCrear_entoncesExcepcion() {
    }

    @Test
    void dadoUnUsuarioValido_cuandoObtener_entoncesListaMensajes() {
    }

    @Test
    void dadoUnUsuarioNOValido_cuandoObtener_entoncesExcepcion() {
    }

    @Test
    void dadoUnUsuarioValido_cuandoBorrarTodos_entoncesOK() {
    }

    @Test
    void dadoUnUsuarioNOValido_cuandoBorrarTodos_entoncesExcepcion() {
    }

}