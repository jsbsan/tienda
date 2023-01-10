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
    float pvp;
    float cantidad;
    float iva;
    float coste;

    public float getCoste() {
        return coste;
    }

    public void setCoste(float coste) {
        this.coste = coste;
    }

    public float importepvp() {
        // el valor del iva es un entero
        float valor = Comunes.comun.Redondeo2decimales(pvp * cantidad);
        return valor;
    }

    public float importeiva() {
        float valor = Comunes.comun.Redondeo2decimales(pvp * cantidad * iva);
        System.out.println("Valor calculado del iva: " + valor);
        return valor;
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

    public void setPvp(float pvp) {
        this.pvp = pvp;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public int getId() {
        return id;
    }

    public String getIdproducto() {
        return idproducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getPvp() {
        return pvp;
    }

    public float getCantidad() {
        return cantidad;
    }

    public float getIva() {
        return iva;
    }

}
