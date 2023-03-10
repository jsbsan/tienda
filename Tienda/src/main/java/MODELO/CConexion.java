/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

import java.io.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class CConexion {

    Connection conectar;

    //Nota: El fichero "configuracion.properties" hay que copiarlo manualemente al directorio dondde este el programa .jar
    private String CONFIG_TEXT_FILE = "configuracion.properties";
    private final Properties pro = new Properties();

    public Boolean mostrado = false;
    String usuario = "tendero";
    String contrasenia = "tendero12345abc";
    String bd = "TIENDA";
    String ip = "192.168.0.11";
    String puerto = "3306";

    String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;

    public Connection estableceConexión() {
        try {
            File archivo_configuracion = new File(CONFIG_TEXT_FILE);
            if (archivo_configuracion.exists()) {
                pro.load(new FileInputStream(archivo_configuracion));
                usuario = pro.getProperty("usuario", usuario);
                contrasenia = pro.getProperty("contrasenia", contrasenia);
                bd = pro.getProperty("bd", bd);
                ip = pro.getProperty("ip", ip);
                puerto = pro.getProperty("puerto", puerto);

                System.out.println("usuario: " + usuario);
                System.out.println("contreña: " + contrasenia);
                System.out.println("bd: " + bd);
                System.out.println("ip: " + ip);
                System.out.println("puerto: " + puerto);
            }
            pro.setProperty("usuario", usuario);
            pro.setProperty("contrasenia", contrasenia);
            pro.setProperty("ip", ip);
            pro.setProperty("bd", bd);
            pro.setProperty("puerto", puerto);

            pro.store(new FileWriter(CONFIG_TEXT_FILE), "comentario de prueba");

            cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

//conexion a base de datos
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena, usuario, contrasenia);
            if (this.mostrado == false) {
                JOptionPane.showMessageDialog(null, "Se conectó correctamente a la bd: " + bd);
                mostrado = true;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas con la conexión: " + e.toString());
        }
        return conectar;
    }

    public void desconecta() {
        try {
            conectar.close();
            //JOptionPane.showMessageDialog(null, "DESCONECTADO DE LA BASE DE DATOS");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas con la desconexión: " + e.toString());
        }
    }
}
