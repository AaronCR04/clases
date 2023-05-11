/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana06;


public class cliente extends usuario{

    private int id_cliente;

    public cliente() {
    }

    public cliente(int id_cliente, String nombre, String apellido, String contraseña, int telefono) {
        super(nombre, apellido, contraseña, telefono);
        this.id_cliente = id_cliente;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    
    
    
    @Override
    public void ingresar() {
        System.out.println("Eres una persona!!");
    }
    
}
