/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class CConexion {
    Connection conectar;
    
    String usuario="tendero";
    String contrasenia="tendero12345abc";
    String bd="TIENDA";
    String ip="192.168.0.11";
    String puerto="3306";
    
    String cadena="jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection estableceConexión(){
          try {
              Class.forName("com.mysql.cj.jdbc.Driver");
              conectar = DriverManager.getConnection(cadena, usuario,contrasenia);
               JOptionPane.showMessageDialog(null,"Se conectó correctamente a la bd: "+bd);
          }  catch (Exception e){
             JOptionPane.showMessageDialog(null,"Problemas con la conexión: "+e.toString());
          }  
    return conectar;
    }
    
    
}
