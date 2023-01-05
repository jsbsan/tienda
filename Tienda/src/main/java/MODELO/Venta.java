/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author USER
 */
public class Venta {

    int id;
    String idproducto;
    String descripcion;
    String pvp;
    String cantidad;
    String iva;

    public int getId() {
        return id;
    }

    public String getIdproducto() {
        return idproducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPvp() {
        return pvp;
    }

    public String getCantidad() {
        return cantidad;
    }

    public String getIva() {
        return iva;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPvp(String pvp) {
        this.pvp = pvp;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }
    

    
}
