/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana06;

/**
 *
 * @author LAB-USR-NA116-C0401
 */
public abstract class usuario {
    
     private String nombre;
    private String apellido;
    private String contraseña;
    private int telefono;

    public usuario() {
    }

    public usuario(String nombre, String apellido, String contraseña, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
    
    public abstract void ingresar();

}
