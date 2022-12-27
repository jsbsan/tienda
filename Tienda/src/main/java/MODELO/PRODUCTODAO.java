/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author USER
 * video: https://www.youtube.com/watch?v=Soe5FrO-tp4&t=1s
 * codigo: https://github.com/sinfloo/Crud-Java-Escritorio-MVC/blob/master/src/com/sinfloo/modelo/PersonaDAO.java
 */
public class PRODUCTODAO {
  CConexion con = new CConexion();
  PreparedStatement ps ;
  ResultSet rs ;
  
  
  public List listar(){
       List<PRODUCTO> datos = new ArrayList<>();
         String sql = "select * from producto";
       try  {
               
               ps =  con.estableceConexión().prepareStatement(sql);
               rs = ps.executeQuery();
               while (rs.next())  {
                    PRODUCTO p = new PRODUCTO();
                    p.setId(rs.getInt(1));
                    p.setIdproducto(rs.getString(2));
                    p.setDescripcion(rs.getString(3));
                    p.setPvp(rs.getFloat(4));
                    p.setCoste(rs.getFloat(5));
                    p.setFecha(rs.getString(6));
                    datos.add(p);
                      }                  
                } catch (Exception e) {
               }
      return datos;
    }  
}
