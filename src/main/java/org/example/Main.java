package org.example;

import org.example.modelos.Local;
import org.example.modelos.Oferta;
import org.example.modelos.Reserva;
import org.example.modelos.Usuario;

import java.util.Locale;
import java.util.Scanner;

/*import static com.sun.tools.javac.resources.CompilerProperties.Fragments.Local;*/

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Usuario usuario = new Usuario();
        Oferta oferta = new Oferta();
        Local local = new Local();
        Reserva reserva = new Reserva();


        System.out.println("***Bienvenido***");

                    /*Validaciones Usuario*/
        System.out.println("Recogiendo datos del usuario: ");

        System.out.print("Digita tus nombres y apellidos: ");
        usuario.setNombres(teclado.nextLine());

        System.out.print("Digita tu correo electronico: ");
        usuario.setCorreoElectronico(teclado.nextLine());

        System.out.print("Digita tu ubicacion: ");
        usuario.setUbicacion(teclado.nextInt());

                    /*Validaciones local*/
        System.out.println("Recogiendo datos del local: ");

        System.out.print("Digita tu nit");
        local.setNit(teclado.nextLine());

        System.out.print("Digita el nombre de la empresa: ");
        local.setNombre(teclado.nextLine());

                    /*Validaciones Oferta*/
        System.out.println("Recogiendo datos de las ofertas: ");

        System.out.print("Digita el titulo de la oferta: ");
        oferta.setTitulo(teclado.nextLine());

        System.out.print("Digita la fecha de inicio: ");
        oferta.setFechaInicio(teclado.nextLine());

        System.out.print("Digita la fecha de fin: ");
        oferta.setFechaFin(teclado.nextLine());

        System.out.print("Digita el costo por persona: ");
        oferta.setCostoPersona(teclado.nextDouble());

                    /*Validaciones Reserva*/
        System.out.println("Recogiendo datos de la reserva: ");

        System.out.print("Digita la fecha de la reserva: ");
        reserva.setFechaReserva(teclado.nextLine());

        System.out.print("Digita la cantidad de personas por reserva: ");
        reserva.setNumeroPersonas(teclado.nextInt());
    }
}