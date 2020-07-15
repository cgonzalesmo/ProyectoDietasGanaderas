package dietas1;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SYSTEMNET
 */
public class Animal extends javax.swing.JFrame {
 
    Conexion cn = new Conexion();
    Connection con;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    int id =0;
    int opcion=0;
    public Animal() {
        initComponents();
        setLocationRelativeTo(null);
        listar();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtAnimCod = new javax.swing.JTextField();
        txtAnimPeso = new javax.swing.JTextField();
        txtAnimUtil = new javax.swing.JTextField();
        txtAnimTipo = new javax.swing.JTextField();
        txtAnimAnio = new javax.swing.JTextField();
        txtAnimProd = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAnimOtros = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        txtAnimEstado = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAnimal = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnAdicionar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnInactivar = new javax.swing.JButton();
        btnReactivar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ANIMAL");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel2.setText("Código  :");

        jLabel3.setText("Peso     :");

        jLabel4.setText("Utilidad :");

        jLabel5.setText("Tipo              :");

        jLabel6.setText("Año de Nac. :");

        jLabel7.setText("Producción   :");

        jLabel8.setText("Otros   :");

        txtAnimCod.setEditable(false);
        txtAnimCod.setEnabled(false);

        txtAnimOtros.setColumns(20);
        txtAnimOtros.setRows(5);
        jScrollPane2.setViewportView(txtAnimOtros);

        jLabel9.setText("Estado         :");

        txtAnimEstado.setText("A");
        txtAnimEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnimEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtAnimCod, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtAnimPeso))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtAnimUtil)))
                            .addComponent(jLabel8))
                        .addGap(149, 149, 149)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtAnimEstado))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtAnimAnio))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtAnimProd))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtAnimTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(txtAnimCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnimTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(txtAnimPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnimAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(txtAnimUtil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnimProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(txtAnimEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabla"));

        tablaAnimal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "AnimCod", "AnimTip", "AnimPes", "AnimAnioNac", "AnimUtil", "AnimProd", "AnimOd", "AnimEstado"
            }
        ));
        tablaAnimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAnimalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaAnimal);
        if (tablaAnimal.getColumnModel().getColumnCount() > 0) {
            tablaAnimal.getColumnModel().getColumn(0).setMinWidth(60);
            tablaAnimal.getColumnModel().getColumn(0).setPreferredWidth(60);
            tablaAnimal.getColumnModel().getColumn(0).setMaxWidth(60);
            tablaAnimal.getColumnModel().getColumn(2).setMinWidth(60);
            tablaAnimal.getColumnModel().getColumn(2).setPreferredWidth(60);
            tablaAnimal.getColumnModel().getColumn(2).setMaxWidth(60);
            tablaAnimal.getColumnModel().getColumn(3).setMinWidth(60);
            tablaAnimal.getColumnModel().getColumn(3).setPreferredWidth(60);
            tablaAnimal.getColumnModel().getColumn(3).setMaxWidth(60);
            tablaAnimal.getColumnModel().getColumn(5).setMinWidth(60);
            tablaAnimal.getColumnModel().getColumn(5).setPreferredWidth(60);
            tablaAnimal.getColumnModel().getColumn(5).setMaxWidth(60);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(270, 270, 270))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnInactivar.setText("Inactivar");
        btnInactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInactivarActionPerformed(evt);
            }
        });

        btnReactivar.setText("Reactivar");
        btnReactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReactivarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdicionar)
                    .addComponent(btnInactivar))
                .addGap(74, 74, 74)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnReactivar))
                .addGap(88, 88, 88)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar)
                    .addComponent(btnActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInactivar)
                    .addComponent(btnReactivar)
                    .addComponent(btnActualizar)
                    .addComponent(btnSalir))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        
        vaciar();
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        agregar();
        listar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        vaciar();
        btnAdicionar.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tablaAnimalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAnimalMouseClicked
       int row = tablaAnimal.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "No se Selecciono ningun animal");
            
        } else {
            id = Integer.parseInt((String) tablaAnimal.getValueAt(row, 0).toString());
            String animTipo = (String) tablaAnimal.getValueAt(row, 1);
            int animPes = Integer.parseInt((String) tablaAnimal.getValueAt(row, 2).toString());
            int animAnio = Integer.parseInt((String) tablaAnimal.getValueAt(row, 3).toString());
            String animUtil = (String) tablaAnimal.getValueAt(row, 4);
            int animProd = Integer.parseInt((String) tablaAnimal.getValueAt(row, 5).toString());
            String animOd = (String) tablaAnimal.getValueAt(row, 6);
            String animEstado = (String) tablaAnimal.getValueAt(row, 7);
            txtAnimCod.setText("" + id);
            txtAnimTipo.setText(animTipo);
            txtAnimPeso.setText("" + animPes);
            txtAnimAnio.setText(""+animAnio);
            txtAnimUtil.setText(animUtil);
            txtAnimProd.setText(""+ animProd);
            txtAnimOtros.setText(animOd);
            txtAnimEstado.setText(animEstado);
            
            
            
        }
    }//GEN-LAST:event_tablaAnimalMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        modificar();
        listar();
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtAnimEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnimEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnimEstadoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       eliminar();
       listar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnReactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReactivarActionPerformed
       reactivar();
       listar();
    }//GEN-LAST:event_btnReactivarActionPerformed

    private void btnInactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInactivarActionPerformed
       inactivar();
       listar();
    }//GEN-LAST:event_btnInactivarActionPerformed
    
    void agregar(){
        String animTipo = txtAnimTipo.getText();
        String animPes = txtAnimPeso.getText();
        String animAnio = txtAnimAnio.getText();
        String animUtil = txtAnimUtil.getText();
        String animProd = txtAnimProd.getText();
        String animOd = txtAnimOtros.getText();
        String animEstado = txtAnimOtros.getText();
        
      
        
        try{
            if(animTipo.equals("")||animPes.equals("")||animAnio.equals("")||animUtil.equals("")||animProd.equals("")||animEstado.equals("")){
                JOptionPane.showMessageDialog(null, "Algunos campos estan vacios");
                limpiarTabla(modelo);
            }else{
                String sql = "INSERT INTO d1_animal (AnimTip, AnimPes, AnimAnioNac, AnimUtil, AnimProd, AnimOd) VALUES('" + animTipo + "','" + animPes + "','" + animAnio + "','" + animUtil + "', '" + animProd + "', '" + animOd + "')";
                    
                    con = cn.getConnection();
                     
                    st = con.createStatement();
                     
                    st.executeUpdate(sql);
                    
                    System.out.println("en el else2");
                    JOptionPane.showMessageDialog(null, "Animal Registrado con Exito");
                    limpiarTabla(modelo);
                }
        }catch(Exception e){
                
            }
        }
    
    void modificar() {
        String animTipo = txtAnimTipo.getText();
        String animPes = txtAnimPeso.getText();
        String animAnio = txtAnimAnio.getText();
        String animUtil = txtAnimUtil.getText();
        String animProd = txtAnimProd.getText();
        String animOd = txtAnimOtros.getText();
        String animEstado = txtAnimEstado.getText();
        
        String sql = "UPDATE d1_animal SET AnimTip='"+ animTipo + "', AnimPes ='"+ animPes + "', AnimAnioNac='"+ animAnio + "', AnimUtil='"+ animUtil + "', AnimProd='"+ animProd + "', AnimOd='"+ animOd + "', AnimEstado='"+ animEstado + "' WHERE AnimCod=" + id;
        try{
            if(animTipo!=null||animPes!=null||animAnio!=null||animUtil!=null||animProd!=null||animEstado!=null){
                
                con = cn.getConnection();                     
                st = con.createStatement();
                st.executeUpdate(sql);
                
                JOptionPane.showMessageDialog(null, "Animal modificado con Exito");
                limpiarTabla(modelo);
            }else{
                JOptionPane.showMessageDialog(null, "Error");
                }
        }catch(Exception e){
                
            }

    }
    
    void eliminar() {
        
            String animTipo = txtAnimTipo.getText();
            String animPes = txtAnimPeso.getText();
            String animAnio = txtAnimAnio.getText();
            String animUtil = txtAnimUtil.getText();
            String animProd = txtAnimProd.getText();
            String animOd = txtAnimOtros.getText();
            String animEstado = txtAnimEstado.getText();
            
            
            animEstado = "*";
        
            String sql = "UPDATE d1_animal SET AnimEstado='"+ animEstado + "' WHERE AnimCod=" + id;
             try{
            if(animTipo!=null||animPes!=null||animAnio!=null||animUtil!=null||animProd!=null||animEstado!=null){
                
                con = cn.getConnection();                     
                st = con.createStatement();
                st.executeUpdate(sql);
                
                JOptionPane.showMessageDialog(null, "Registro "+id+" ELIMINADO con Exito");
                limpiarTabla(modelo);
            }else{
                JOptionPane.showMessageDialog(null, "Error");
                }
        }catch(Exception e){
                
            }
           
       
         

    }
    void inactivar() {
        
            String animTipo = txtAnimTipo.getText();
            String animPes = txtAnimPeso.getText();
            String animAnio = txtAnimAnio.getText();
            String animUtil = txtAnimUtil.getText();
            String animProd = txtAnimProd.getText();
            String animOd = txtAnimOtros.getText();
            String animEstado = txtAnimEstado.getText();
            
            
            animEstado = "I";
        
            String sql = "UPDATE d1_animal SET AnimEstado='"+ animEstado + "' WHERE AnimCod=" + id;
             try{
            if(animTipo!=null||animPes!=null||animAnio!=null||animUtil!=null||animProd!=null||animEstado!=null){
                
                con = cn.getConnection();                     
                st = con.createStatement();
                st.executeUpdate(sql);
                
                JOptionPane.showMessageDialog(null, "Registro "+id+" INACTIVADO con Exito");
                limpiarTabla(modelo);
            }else{
                JOptionPane.showMessageDialog(null, "Error");
                }
        }catch(Exception e){
                
            }
           
       
         

    }
    void reactivar() {
        
            String animTipo = txtAnimTipo.getText();
            String animPes = txtAnimPeso.getText();
            String animAnio = txtAnimAnio.getText();
            String animUtil = txtAnimUtil.getText();
            String animProd = txtAnimProd.getText();
            String animOd = txtAnimOtros.getText();
            String animEstado = txtAnimEstado.getText();
            
            
            animEstado = "A";
        
            String sql = "UPDATE d1_animal SET AnimEstado='"+ animEstado + "' WHERE AnimCod=" + id;
             try{
            if(animTipo!=null||animPes!=null||animAnio!=null||animUtil!=null||animProd!=null||animEstado!=null){
                
                con = cn.getConnection();                     
                st = con.createStatement();
                st.executeUpdate(sql);
                
                JOptionPane.showMessageDialog(null, "Registro "+id+" REACTIVADO con Exito");
                limpiarTabla(modelo);
            }else{
                JOptionPane.showMessageDialog(null, "Error");
                }
        }catch(Exception e){
                
            }
           
       
         

    }
void limpiarTabla(DefaultTableModel modelo) {
        for (int i = 0; i <= tablaAnimal.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }

    }
void vaciar() {
        txtAnimTipo.setText("");
        txtAnimPeso.setText("");
        txtAnimAnio.setText("");
        txtAnimUtil.setText("");
        txtAnimProd.setText("");
        txtAnimOtros.setText("");
        txtAnimEstado.setText("");
        
    }
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
            java.util.logging.Logger.getLogger(Animal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Animal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Animal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Animal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Animal().setVisible(true);
            }
        });
    }
    
    void listar(){
        String sql = "select * from d1_animal";
        try{
            con = cn.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            Object[]animal= new Object[8];
            modelo = (DefaultTableModel)tablaAnimal.getModel();
            while(rs.next()){
                animal[0]= rs.getInt("AnimCod");
                animal[1]= rs.getString("AnimTip");
                animal[2]= rs.getInt("AnimPes");
                animal[3]= rs.getInt("AnimAnioNac");
                animal[4]= rs.getString("AnimUtil");
                animal[5]= rs.getInt("AnimProd");
                animal[6]= rs.getString("AnimOd");
                animal[7]= rs.getString("AnimEstado");
                modelo.addRow(animal);
            }
            tablaAnimal.setModel(modelo);
          }catch(Exception e){
              
          }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInactivar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnReactivar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaAnimal;
    private javax.swing.JTextField txtAnimAnio;
    private javax.swing.JTextField txtAnimCod;
    private javax.swing.JTextField txtAnimEstado;
    private javax.swing.JTextArea txtAnimOtros;
    private javax.swing.JTextField txtAnimPeso;
    private javax.swing.JTextField txtAnimProd;
    private javax.swing.JTextField txtAnimTipo;
    private javax.swing.JTextField txtAnimUtil;
    // End of variables declaration//GEN-END:variables
}
