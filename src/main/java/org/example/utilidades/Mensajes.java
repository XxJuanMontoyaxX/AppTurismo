package org.example.utilidades;

public enum Mensajes {
        NOMBRE_SOLO_LETRAS("Señor usuario su nombre solo puede tener letras"),
        NOMBRE_MUY_CORTO("Señor usuario revise la cantidad de caracteres, es muy pequeña"),
        NOMBRE_MUY_LARGO("Señor usuario el nombre de la empresa es muy largo, debe tener menos de 30 caracteres"),
        TITULO_MUY_LARGO("Señor usuario el titulo de la oferta es muy largo, debe tener menos de 20 caracteres"),
        CORREO_INVALIDO("Señor usuario el correo ingresado no es valido"),
        ZONA_INVALIDA("La zona ingresada no es valida"),
        NIT_SOLO_NUMEROS("El nit solo debe contener numeros, no caracteres"),
        NIT_CANTIDAD("Señor usuario el nit solo debe tener 10 digitos, por favor verifiquelo"),
        FORMATO_FECHAS("Señor usuario el formato digitado no es el correcto, es dd/MM/yyyy"),
        FECHA_FINAL("La fecha de inicio no puede ser mayor a la fecha final"),
        COSTO_PERSONA("Señor usuario el costo por persona no puede ser negativo"),
        CANTIDAD_PERSONAS("señor usuario, el número de personas por reserva no puede ser mayor a 4 personas");

        private String mensajes;

        Mensajes(String mensajes) {
            this.mensajes = mensajes;
        }

        public String getMensajes() {
            return mensajes;
        }
}
