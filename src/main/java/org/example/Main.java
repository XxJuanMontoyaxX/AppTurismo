package org.example;

import org.example.modelos.Oferta;
import org.example.modelos.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        Usuario usuario=new Usuario();
        Oferta oferta=new Oferta();

       /* System.out.println("***Bienvenido***");
        System.out.println("1: Recogiendo datos del usuario: ");
        System.out.print("Digita tus nombres y apellidos: ");
        usuario.setNombres(teclado.nextLine());

        System.out.print("Digita tu correo electronico: ");
        usuario.setCorreoElectronico(teclado.nextLine());
        System.out.println("...............................");
        System.out.println(usuario); */

        System.out.println("Señor usuario digite la fecha de inicio: ");
        oferta.setFechaInicio(teclado.nextLine());

        System.out.println("Señor usuario digite la fecha de inicio: ");
        oferta.setFechaFin(teclado.nextLine());
    }
}