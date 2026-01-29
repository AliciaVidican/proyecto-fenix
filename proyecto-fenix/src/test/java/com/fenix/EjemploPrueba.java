package com.fenix;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.List;

public class EjemploPrueba {

    // Ejemplo de prueba
    @Test
    void testProcesarListaComportamientoActual() {
        ProcesadorUsuarios procesador = new ProcesadorUsuarios();
        List<String> lista = List.of("Ana:1", "Luis:2", "Eva:1", "Juan:99");
        String resultado = procesador.procesarLista(lista);
        assertEquals("Admins: Ana,Eva, | Invitados: Luis,", resultado);
    }

}
