package dietas1;

import java.awt.Image;
import java.sql.*;
import javax.swing.ImageIcon;
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
public class dieta1 extends javax.swing.JFrame {
    int opcion=0;
    int cont =0;
    Conexion cn = new Conexion();
    Connection con;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    int id =0;
    
    public dieta1() {
        initComponents();
        setLocationRelativeTo(null);
        
        setTitle("DIETAS GANADERAS - Dietas");
        
       
        listar();
        
        txtDietCod.setEditable(false); 
        txtDietFin.setEditable(false);        
    
        txtDietOtros.setEditable(false);
        txtDietEstado.setEditable(false);
        cont++;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtDietCod = new javax.swing.JTextField();
        txtDietFin = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDietOtros = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        txtDietEstado = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDieta = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        btnAdicionar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnInactivar = new javax.swing.JButton();
        btnReactivar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logo.png"))); // NOI18N
        jLabel13.setText("jLabel10");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel2.setText("Código  :");

        jLabel8.setText("Finalidad       :");

        jLabel11.setText("Otros   :");

        txtDietOtros.setColumns(20);
        txtDietOtros.setRows(5);
        jScrollPane2.setViewportView(txtDietOtros);

        jLabel12.setText("Estado         :");

        txtDietEstado.setText("A");
        txtDietEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDietEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtDietCod, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtDietFin, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(20, 20, 20)
                        .addComponent(txtDietEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtDietCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtDietFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtDietEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2)
                .addGap(19, 19, 19))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabla"));

        tablaDieta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DietCod", "DietFin", "DietEst", "DietoOd"
            }
        ));
        tablaDieta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tablaDieta);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(301, 301, 301))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));

        btnAdicionar.setBackground(new java.awt.Color(240, 87, 66));
        btnAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionar.setText("Adicionar");
        btnAdicionar.setFocusable(false);
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(240, 87, 66));
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.setFocusable(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(240, 87, 66));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setFocusable(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(240, 87, 66));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setFocusable(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnInactivar.setBackground(new java.awt.Color(240, 87, 66));
        btnInactivar.setForeground(new java.awt.Color(255, 255, 255));
        btnInactivar.setText("Inactivar");
        btnInactivar.setFocusable(false);
        btnInactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInactivarActionPerformed(evt);
            }
        });

        btnReactivar.setBackground(new java.awt.Color(240, 87, 66));
        btnReactivar.setForeground(new java.awt.Color(255, 255, 255));
        btnReactivar.setText("Reactivar");
        btnReactivar.setFocusable(false);
        btnReactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReactivarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(240, 87, 66));
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.setFocusPainted(false);
        btnActualizar.setFocusable(false);
        btnActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(240, 87, 66));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setFocusable(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReactivar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInactivar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReactivar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnInactivar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDietEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDietEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDietEstadoActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
         if(opcion==0){
            txtDietFin.setEditable(true);
            
            txtDietOtros.setEditable(true);
            txtDietEstado.setEditable(true);
            opcion=1;
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
         if(opcion==0){
            int fila=tablaDieta.getSelectedRow();
            if(fila>=0){
                txtDietCod.setText(tablaDieta.getValueAt(fila,0).toString());
                txtDietFin.setText(tablaDieta.getValueAt(fila,1).toString());
                
                txtDietOtros.setText(tablaDieta.getValueAt(fila,2).toString());
                txtDietOtros.setText(tablaDieta.getValueAt(fila,3).toString());
                opcion=3;
                txtDietCod.setEditable(false);
                txtDietFin.setEditable(true);
              
                txtDietOtros.setEditable(true);
                txtDietEstado.setEditable(false);

            }else{
                JOptionPane.showMessageDialog(null,"fila no seleccionada");
            }

        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         if(opcion==0){
            int fila=tablaDieta.getSelectedRow();
            if(fila>=0){
                txtDietCod.setText(tablaDieta.getValueAt(fila,0).toString());
                txtDietFin.setText(tablaDieta.getValueAt(fila,1).toString());
             
                txtDietOtros.setText(tablaDieta.getValueAt(fila,2).toString());
                txtDietEstado.setText(tablaDieta.getValueAt(fila,3).toString());

                txtDietCod.setEditable(false);
                txtDietFin.setEditable(false);
                
                txtDietOtros.setEditable(false);
                txtDietEstado.setEditable(false);
            }}
            opcion=6;
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
        if(opcion==1){
            vaciar();
            btnAdicionar.setEnabled(false);//por ver
        }
        if(opcion==3)
        btnModificar.setEnabled(false);
        if(opcion==6)
        btnEliminar.setEnabled(false);
        if(opcion==5)
        btnReactivar.setEnabled(false);
        if(opcion==4)
        btnInactivar.setEnabled(false);
        opcion=0;
                        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnInactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInactivarActionPerformed
         if(opcion==0){
            int fila=tablaDieta.getSelectedRow();
            if(fila>=0){
                txtDietCod.setText(tablaDieta.getValueAt(fila,0).toString());
                txtDietFin.setText(tablaDieta.getValueAt(fila,1).toString());
                
                txtDietOtros.setText(tablaDieta.getValueAt(fila,2).toString());
                txtDietOtros.setText(tablaDieta.getValueAt(fila,3).toString());
            }}
            opcion=4;

    }//GEN-LAST:event_btnInactivarActionPerformed

    private void btnReactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReactivarActionPerformed
       if(opcion==0){
            int fila=tablaDieta.getSelectedRow();
            if(fila>=0){
                txtDietCod.setText(tablaDieta.getValueAt(fila,0).toString());
                txtDietFin.setText(tablaDieta.getValueAt(fila,1).toString());
               
                txtDietOtros.setText(tablaDieta.getValueAt(fila,2).toString());
                txtDietOtros.setText(tablaDieta.getValueAt(fila,3).toString());
            }}
            opcion=5;
    }//GEN-LAST:event_btnReactivarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
        if(opcion==1){ //si presiono  ADICIONAR

            agregar();
            listar();
            vaciar();

        }else if(opcion==3){

            actualizar();
            listar();

            vaciar();

        }else if(opcion==6){
            eliminar();
            listar();
        }else if(opcion==5){
            reactivar();
            listar();
        }else if(opcion==4){
            inactivar();
            listar();
        }
        vaciar();
        opcion=0;
        btnAdicionar.setEnabled(true);
        btnModificar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnReactivar.setEnabled(true);
        btnInactivar.setEnabled(true);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
         vaciar();
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed
    
    void agregar(){
        String dietFin = txtDietFin.getText();
      
        String dietOd = txtDietOtros.getText();
        String dietEst = txtDietEstado.getText();
        
      
        
        try{
            if(dietFin.equals("")||dietEst.equals("")){
                JOptionPane.showMessageDialog(null, "Algunos campos estan vacios");
                limpiarTabla(modelo);
            }else{
                String sql = "INSERT INTO d1_dieta (DietFin, DietOd) VALUES('" + dietFin + "','" + dietOd + "')";
                System.out.println(sql);   
                    con = cn.getConnection();
                     
                    st = con.createStatement();
                     
                    st.executeUpdate(sql);
                    
                    JOptionPane.showMessageDialog(null, "Dieta Registrado con Exito");
                    limpiarTabla(modelo);
                }
        }catch(Exception e){
                
            }
        }
    
    void actualizar() {
        String dietCod = txtDietCod.getText();
        String dietFin = txtDietFin.getText();
        String dietOd = txtDietOtros.getText();
        
        String sql = "UPDATE d1_dieta SET DietFin='"+ dietFin + "', DietOd='"+ dietOd + "' WHERE DietCod=" + dietCod;
        
        try{
         if(dietFin!=null){
                           
                con = cn.getConnection();                     
                st = con.createStatement();
                st.executeUpdate(sql);  
                
                JOptionPane.showMessageDialog(null, "Se modificó el registro "+dietCod+" de la tabla DIETA ");
                limpiarTabla(modelo);
         }else{
             JOptionPane.showMessageDialog(null, "Error"); 
         }             
               
                
        }catch(Exception e){
                
            }

    }
    
    void eliminar() {
        
            String dietCod = txtDietCod.getText();
            String dietFin = txtDietFin.getText();
            
            String dietOd = txtDietOtros.getText();
            String dietEstado = txtDietEstado.getText();
            
            
            dietEstado = "*";
        
            String sql = "UPDATE d1_dieta SET DietEst='"+ dietEstado + "' WHERE DietCod=" + dietCod;
             try{
            if(dietFin!=null){
                
                con = cn.getConnection();                     
                st = con.createStatement();
                st.executeUpdate(sql);
                
                JOptionPane.showMessageDialog(null, "Se elimino el registro "+ dietCod+" de la tabla DIETA");
                limpiarTabla(modelo);
            }else{
                JOptionPane.showMessageDialog(null, "Error");
                }
        }catch(Exception e){
                
            }
           
       
         

    }
        void reactivar() {
            String dietCod = txtDietCod.getText();
            String dietFin = txtDietFin.getText();
            
            String dietOd = txtDietOtros.getText();
            String dietEst = txtDietEstado.getText();
            
            
            dietEst = "A";
            String sql = "UPDATE d1_dieta SET DietEst='"+ dietEst + "' WHERE DietCod=" + dietCod;
            
             try{
            if(dietFin!=null||dietEst!=null){
                
                con = cn.getConnection();                     
                st = con.createStatement();
                st.executeUpdate(sql);
                
                JOptionPane.showMessageDialog(null, "Se reactivo el registro "+dietCod+" de la tabla Dietas");
                limpiarTabla(modelo);
            }else{
                JOptionPane.showMessageDialog(null, "Error");
                }
        }catch(Exception e){
                
            }
    }
    void inactivar() {
            String dietCod = txtDietCod.getText();
            String dietFin = txtDietFin.getText();
            
            String dietOd = txtDietOtros.getText();
            String dietEst = txtDietEstado.getText();
            
            
            dietEst = "I";
        
            String sql = "UPDATE d1_dieta SET DietEst='"+ dietEst + "' WHERE DietCod=" + dietCod;
             try{
            if(dietFin!=null||dietEst!=null){
                
                con = cn.getConnection();                     
                st = con.createStatement();
                st.executeUpdate(sql);
                
                JOptionPane.showMessageDialog(null, "Se inactivo el registro "+dietCod+" de la tabla Dietas");
                limpiarTabla(modelo);
            }else{
                JOptionPane.showMessageDialog(null, "Error");
                }
        }catch(Exception e){
                
            }
           
       
         

    }

void limpiarTabla(DefaultTableModel modelo) {
        for (int i = 0; i <= tablaDieta.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }

    }
void vaciar() {
        txtDietCod.setText("");
        txtDietFin.setText("");
        
        txtDietOtros.setText("");
        txtDietEstado.setText("");
        
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
            java.util.logging.Logger.getLogger(dieta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dieta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dieta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dieta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dieta1().setVisible(true);
            }
        });
    }
    
    void listar(){
        String sql = "select * from d1_dieta";
        try{
            con = cn.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            Object[]dieta= new Object[4];
            modelo = (DefaultTableModel)tablaDieta.getModel();
            while(rs.next()){
                
                dieta[0]= rs.getInt("DietCod");
                dieta[1]= rs.getString("DietFin");
                dieta[2]= rs.getString("DietEst");
                dieta[3]= rs.getString("DietOd");
          
                modelo.addRow(dieta);
            }
            tablaDieta.setModel(modelo);
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaDieta;
    private javax.swing.JTextField txtDietCod;
    private javax.swing.JTextField txtDietEstado;
    private javax.swing.JTextField txtDietFin;
    private javax.swing.JTextArea txtDietOtros;
    // End of variables declaration//GEN-END:variables
}
