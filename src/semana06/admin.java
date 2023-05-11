/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana06;

/**
 *
 * @author LAB-USR-NA116-C0401
 */
public  class admin extends usuario {
    private int id_admin;
    private String admin_usuario;

    public admin() {
    }

    public admin(int id_admin, String admin_usuario, String nombre, String apellido, String contraseña, int telefono) {
        super(nombre, apellido, contraseña, telefono);
        this.id_admin = id_admin;
        this.admin_usuario = admin_usuario;
    }

    public int getId_admin() {
        return id_admin;
    }

    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
    }

    public String getAdmin_usuario() {
        return admin_usuario;
    }

    public void setAdmin_usuario(String admin_usuario) {
        this.admin_usuario = admin_usuario;
    }
    
    

    @Override
    public void ingresar() {
        System.out.println("administrador");
    }

   
    
}
