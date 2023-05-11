/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana06;

/**
 *
 * @author LAB-USR-NA116-C0401
 */
public class categoria {
    private int id_cate;
    private String tipo;
    private String estado;

    public categoria() {
    }

    public categoria(int id_cate, String tipo, String estado) {
        this.id_cate = id_cate;
        this.tipo = tipo;
        this.estado = estado;
    }


    public int getId_cate() {
        return id_cate;
    }

    public void setId_cate(int id_cate) {
        this.id_cate = id_cate;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
