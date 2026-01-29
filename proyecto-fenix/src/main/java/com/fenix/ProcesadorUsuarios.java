package com.fenix;

import java.util.List;

/**
 * Clase que procesa una lista de usuarios y los clasifica por roles.
 */

public class ProcesadorUsuarios {

    private static final int ROL_ADMIN = 1;
    private static final int ROL_INVITADO = 2;

    /**
     * Procesa la lista de strings y separa admins de invitados.
     * @param usuarios Lista de cadenas en formato nombre:rol.
     * @return Cadena con los usuarios clasificados.
     */

    // Método con 'code smells': largo, números mágicos, malos nombres.
    public String procesarLista(List<String> usuarios) {
        String admins = "";
        String invitados = "";

        for (String usuario : usuarios) {
            String[] parts = usuario.split(":"); // Formato "nombre:rol"
            if (parts.length == 2) {
                String nombre = parts[0];
                int rol = Integer.parseInt(parts[1]);

                // Número Mágico: 1 es Admin
                if (rol == ROL_ADMIN) {
                    admins = procesarAdmin(admins, nombre);
                }
                // Número Mágico: 2 es Invitado
                else if (rol == ROL_INVITADO) {
                    invitados = procesarInvitado(invitados, nombre);
                }
            }
        }

        return "Admins: " + admins + " | Invitados: " + invitados;
    }

    private String procesarAdmin(String admins, String nombre) {
        return admins + nombre + ",";
    }

    private String procesarInvitado(String invitados, String nombre) {
        return invitados + nombre + ",";
    }
}