package com.fenix;

import java.util.List;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ProcesadorUsuariosTest {

    // Ejemplo de prueba
    @Test
    public void testProcesarListaComportamientoActual() {
        ProcesadorUsuarios procesador = new ProcesadorUsuarios();
        List<String> lista = List.of("Ana:1", "Luis:2", "Eva:1", "Juan:99");
        String resultado = procesador.procesarLista(lista);
        assertEquals("Admins: Ana,Eva, | Invitados: Luis,", resultado);
    }

}
