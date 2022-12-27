/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;
import java.sql.*;
/**
 *
 * @author USER
 * fuente: https://github.com/sinfloo/Crud-Java-Escritorio-MVC/blob/master/src/com/sinfloo/modelo/PersonaDAO.java
 * video: https://www.youtube.com/watch?v=Soe5FrO-tp4&t=1s
 */
public class PRODUCTO {
    int id;
    String idproducto;
    String descripcion;
    float pvp;
    float coste;
    String fecha;
    
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

    public float getCoste() {
        return coste;
    }

    public String getFecha() {
        return fecha;
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

    public void setCoste(float coste) {
        this.coste = coste;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public PRODUCTO(){
        
    }        

    public PRODUCTO(int id,String idproducto,String descripcion,float pvp,float coste,String fecha){
        this.id=id;
        this.idproducto=idproducto;
        this.descripcion=descripcion;
        this.pvp=pvp;
        this.coste=coste;
        this.fecha=fecha;
    }        
}
