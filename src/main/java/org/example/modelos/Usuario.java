package org.example.modelos;

import org.example.validaciones.UsuarioValidacion;

public class  Usuario {
    private Integer id;
    private String nombres;
    private String documento;
    private Integer ubicacion;
    private String correoElectronico;
    private UsuarioValidacion validacion=new UsuarioValidacion();


    public Usuario() { //constructor vacio
    }

    public Usuario(Integer id, String nombres, String documento, Integer ubicacion, String correoElectronico) {
        this.id = id;
        this.nombres = nombres;
        this.documento = documento;
        this.ubicacion = ubicacion;
        this.correoElectronico = correoElectronico;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        try{
            this.validacion.validarNombres(nombres);
            this.nombres=nombres;
        }catch(Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Integer getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Integer ubicacion) throws Exception {
        try{
            this.validacion.validarUbicacion(ubicacion); //si las validaciones son ok
            this.ubicacion=ubicacion;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correo) {
        try{
            this.validacion.validarCorreo(correo);
            this.correoElectronico=correo;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombres='" + nombres + '\'' +
                ", documento='" + documento + '\'' +
                ", ubicacion=" + ubicacion +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", validacion=" + validacion +
                '}';
    }
}
