/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import MODELO.CConexion;
import MODELO.PRODUCTO;
import java.sql.*;
import java.text.DateFormat;
import java.text.DecimalFormat;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author USER
 */
public class GestionarProductos extends javax.swing.JFrame {



    /**
     * Creates new form GestionarProducos
     */
    public GestionarProductos() {
        initComponents();
        listar();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabladatos = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButtonListar1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButtonListar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTextCoste = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextIdProducto = new javax.swing.JTextField();
        jTextDescripcion = new javax.swing.JTextField();
        jTextPvp = new javax.swing.JTextField();
        jDateFecha = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jTextIva = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButtonAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        Tabladatos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Tabladatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Idproducto", "descripcion", "pvp", "iva", "coste", "fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabladatos.setGridColor(new java.awt.Color(0, 0, 0));
        Tabladatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabladatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabladatos);
        if (Tabladatos.getColumnModel().getColumnCount() > 0) {
            Tabladatos.getColumnModel().getColumn(0).setMinWidth(30);
            Tabladatos.getColumnModel().getColumn(0).setPreferredWidth(30);
            Tabladatos.getColumnModel().getColumn(0).setMaxWidth(30);
            Tabladatos.getColumnModel().getColumn(1).setMinWidth(80);
            Tabladatos.getColumnModel().getColumn(1).setPreferredWidth(80);
            Tabladatos.getColumnModel().getColumn(1).setMaxWidth(80);
            Tabladatos.getColumnModel().getColumn(3).setMinWidth(80);
            Tabladatos.getColumnModel().getColumn(3).setPreferredWidth(80);
            Tabladatos.getColumnModel().getColumn(3).setMaxWidth(80);
            Tabladatos.getColumnModel().getColumn(4).setMinWidth(80);
            Tabladatos.getColumnModel().getColumn(4).setPreferredWidth(80);
            Tabladatos.getColumnModel().getColumn(4).setMaxWidth(80);
            Tabladatos.getColumnModel().getColumn(5).setMinWidth(80);
            Tabladatos.getColumnModel().getColumn(5).setPreferredWidth(80);
            Tabladatos.getColumnModel().getColumn(5).setMaxWidth(80);
            Tabladatos.getColumnModel().getColumn(6).setMinWidth(80);
            Tabladatos.getColumnModel().getColumn(6).setPreferredWidth(80);
            Tabladatos.getColumnModel().getColumn(6).setMaxWidth(80);
        }

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/borrar.png"))); // NOI18N
        jButton5.setText("Borrar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButtonListar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/planificacion.png"))); // NOI18N
        jButtonListar1.setText("Listar");
        jButtonListar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListar1ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar-codigo.png"))); // NOI18N
        jButton3.setText("Editar");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/comprobado.png"))); // NOI18N
        jButton4.setText("Ok");

        jButtonListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/planificacion.png"))); // NOI18N
        jButtonListar.setText("Listar");
        jButtonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jButtonListar1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(265, 265, 265)
                    .addComponent(jButtonListar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(265, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonListar1)
                    .addComponent(jButton5)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jButtonListar)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Idproducto:");

        jLabel2.setText("Descripción:");

        jLabel3.setText("pvp:");

        jLabel4.setText("coste:");

        jLabel5.setText("fecha:");

        jDateFecha.setDateFormatString("yyyy-MM-dd");

        jLabel7.setText("Iva:");

        jLabel8.setText("%");

        jLabel9.setText("Id (interno):");

        jLabelId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextDescripcion)
                    .addComponent(jTextIdProducto)
                    .addComponent(jTextPvp)
                    .addComponent(jTextCoste)
                    .addComponent(jDateFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(jTextIva)
                    .addComponent(jLabelId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9)
                    .addComponent(jLabelId, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextPvp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextCoste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("GESTIÓN DE PRODUCTOS");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 669, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/add_circle_fill.png"))); // NOI18N
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAgregar)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAgregar)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarActionPerformed
        // TODO add your handling code here:
        listar();
    }//GEN-LAST:event_jButtonListarActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        // TODO add your handling code here:
        agregar();
        listar();
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonListar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonListar1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        eliminar();
        listar();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void TabladatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabladatosMouseClicked
        // Seleccion de fila
        int fila = Tabladatos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        } else {
            id = Integer.parseInt((String) Tabladatos.getValueAt(fila, 0).toString());
            jLabelId.setText((String) Tabladatos.getValueAt(fila, 0).toString());
            jTextIdProducto.setText((String) Tabladatos.getValueAt(fila, 1));
            jTextDescripcion.setText((String) Tabladatos.getValueAt(fila, 2));
            jTextPvp.setText((String) Tabladatos.getValueAt(fila, 3));
            jTextIva.setText((String) Tabladatos.getValueAt(fila, 4));
            jTextCoste.setText((String) Tabladatos.getValueAt(fila, 5));
            SimpleDateFormat formato=new SimpleDateFormat("yyyy-MM-dd");
            try  {
            jDateFecha.setDate(formato.parse(Tabladatos.getValueAt(fila, 6).toString()));
            } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, "Problemas con la traduccion de la fecha: " + e.toString());
            }
        }
    }//GEN-LAST:event_TabladatosMouseClicked

    /**
     * @param args the command line arguments
     */
    
    public int id;
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarProductos().setVisible(true);
            }
        });
    }

    void agregar() {

        CConexion con = new CConexion();
        con.mostrado = true;
        Connection cn;
        Statement st;
        String idproducto = jTextIdProducto.getText();
        String descripcion = jTextDescripcion.getText();
        String pvp = jTextPvp.getText();
        String iva = jTextIva.getText();
        String coste = jTextCoste.getText();
        String fecha = "";

        Date date = new Date();

        try {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            fecha = f.format(jDateFecha.getDate());
        } catch (Exception e) {
            /* mensaje de fecha mal introducida */
            JOptionPane.showMessageDialog(null, "Fecha mal introducida. Tiene que tener el formato año-mes-dia (yyyy-mm-dd)");
        }

        if (idproducto == "" || descripcion == "" || pvp == "" || coste == "" || iva == "") {
            JOptionPane.showMessageDialog(null, "Agunos variables no tienen valor");
        } else {

            String sql = "insert into TIENDA.PRODUCTO (idproducto,descripcion,pvp,coste,fecha,iva) values ('";
            sql = sql + idproducto + "','" + descripcion + "','" + pvp + "','" + coste + "','" + fecha + "','" + iva + "')";
            System.out.printf("***********************************\n");
            System.out.printf("Cadena: " + sql + "\n");
            System.out.printf("***********************************\n");

            try {
                cn = con.estableceConexión();
                st = cn.createStatement();
                st.executeUpdate(sql);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al intentar agregar el Producto, revise los valores introducidos");
            }
        }
    }

    void eliminar() {
        int filaseleccionado = Tabladatos.getSelectedRow();
        if (filaseleccionado == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        } else {
            
            String sql = "DELETE FROM TIENDA.PRODUCTO where id='" + id +"'";
              
            System.out.println("Orden a ejecutar: "+ sql);

            CConexion con = new CConexion();
            con.mostrado = true;
            Connection cn;
            Statement st;

            try {
                cn = con.estableceConexión();
                st = cn.createStatement();
                st.executeUpdate(sql); // sentencia para borrar se usa Update
                limpiarRegistros();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al borrar registro: "+  e.toString());
            }
        }
    }
void limpiarRegistros()  {

jLabelId.setText("");
jTextIdProducto.setText("");
jTextDescripcion.setText("");
jTextPvp.setText("");
jTextIva.setText("");
jTextCoste.setText("");
jDateFecha.setDate(null);

}

        
    void listar() {
        String sql = "Select * from PRODUCTO";
        CConexion con = new CConexion();
        con.mostrado = true;
        Connection cn;
        Statement st;
        ResultSet rs;
        DefaultTableModel modelo;

        try {
            /* ejemplo de sql:
            insert into TIENDA.PRODUCTO(idproducto,descripcion,pvp,coste,fecha) 
            values ('023p32','Gatera','18.7','15.25','2022-12-31');
            
            videos:
            https://www.youtube.com/watch?v=Erw8W5pH_T4
            https://www.youtube.com/watch?v=Fxk77AJPejM '' agregar
            https://www.youtube.com/watch?v=8DucQvDocN8 '' 
            https://www.youtube.com/watch?v=ls-iubz0zE4 '' eliminar registro
             */
            cn = con.estableceConexión();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            modelo = (DefaultTableModel) Tabladatos.getModel();
            modelo.setRowCount(0);
            /* borro resultados anteriores */
            Object[] fila = new Object[7];/* hay 7 columnas de datos */
 /* Formatea datos numericos */
            DecimalFormat formatea = new DecimalFormat("###,##0.00");

            while (rs.next()) {
                fila[0] = rs.getInt("id");
                /* valor automatico que lo pone automaticamente */
                fila[1] = rs.getString("idproducto");
                fila[2] = rs.getString("descripcion");
                fila[3] = formatea.format(rs.getFloat("pvp"));
                fila[4] = formatea.format(rs.getFloat("iva"));
                fila[5] = formatea.format(rs.getFloat("coste"));
                fila[6] = rs.getString("fecha");
                modelo.addRow(fila);
            }

            Tabladatos.setModel(modelo);
            /* alineo columna */
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
            tcr.setHorizontalAlignment(SwingConstants.RIGHT);
            Tabladatos.getColumnModel().getColumn(3).setCellRenderer(tcr);
            Tabladatos.getColumnModel().getColumn(4).setCellRenderer(tcr);
            Tabladatos.getColumnModel().getColumn(5).setCellRenderer(tcr);

        } catch (Exception e) {
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable Tabladatos;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonListar;
    private javax.swing.JButton jButtonListar1;
    private com.toedter.calendar.JDateChooser jDateFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextCoste;
    private javax.swing.JTextField jTextDescripcion;
    private javax.swing.JTextField jTextIdProducto;
    private javax.swing.JTextField jTextIva;
    private javax.swing.JTextField jTextPvp;
    // End of variables declaration//GEN-END:variables
}
