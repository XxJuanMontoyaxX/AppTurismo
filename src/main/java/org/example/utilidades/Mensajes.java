package org.example.utilidades;

public enum Mensajes {
        NOMBRE_SOLO_LETRAS("Señor usuario su nombre solo puede tener letras"),
        NOMBRE_MUY_CORTO("Señor usuario revise la cantidad de caracteres, es muy pequeña"),
        NOMBRE_MUY_LARGO("Señor usuario el nombre de la empresa es muy largo, debe tener 30 caracteres"),
        TITULO_MUY_LARGO("Señor usuario el titulo de la oferta es muy largo, debe tener 20 caracteres"),
        CORREO_INVALIDO("Señor usuario el correo ingresado no es valido"),
        ZONA_INVALIDA("La zona ingresada no es valida"),
        NIT_SOLO_NUMEROS("El nit solo debe contener numeros"),
        NIT_CANTIDAD("El nit solo debe tener 10 digitos");

        private String mensajes;

        Mensajes(String mensajes) {
            this.mensajes = mensajes;
        }

        public String getMensajes() {
            return mensajes;
        }
}
