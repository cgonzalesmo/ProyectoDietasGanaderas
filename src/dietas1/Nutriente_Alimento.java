package dietas1;

import java.awt.Image;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Nutriente_Alimento extends javax.swing.JFrame {
    int opcion=0;
    int cont =0;
    Conexion cn = new Conexion();
    Connection con;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    int id =0;
    
    String NutNombre="";
    String AlimNom ="";
    String mostrarMagnitud="";
    
    public Nutriente_Alimento() {
        initComponents();
        setLocationRelativeTo(null);
        
        setTitle("DIETAS GANADERAS - Alimentos");
        
       
        listar();
        
        txtNANutNom.setEditable(false); 
        txtNAAlimNom.setEditable(false);        
        txtNACantCon.setEditable(false);
        txtNAEstado.setEditable(false);
        verMagnitud.setEditable(false);
        this.iniciarCBNutNom();
        this.iniciarCBAlimNom();
        
        CBNANutNom.setVisible(false);
        CBNAAlimNom.setVisible(false);
        cont++;
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNACantCon = new javax.swing.JTextField();
        txtNAAlimNom = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtNAEstado = new javax.swing.JTextField();
        txtNANutNom = new javax.swing.JTextField();
        CBNANutNom = new javax.swing.JComboBox<>();
        CBNAAlimNom = new javax.swing.JComboBox<>();
        verMagnitud = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaNA = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        btnAdicionar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnInactivar = new javax.swing.JButton();
        btnReactivar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logo.png"))); // NOI18N
        jLabel13.setText("jLabel10");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel2.setText("Nombre del nutriente  :");

        jLabel6.setText("Cantidad contenida :");

        jLabel8.setText("Nombre del alimento:");

        txtNAAlimNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNAAlimNomActionPerformed(evt);
            }
        });

        jLabel12.setText("Estado:");

        txtNAEstado.setText("A");
        txtNAEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNAEstadoActionPerformed(evt);
            }
        });

        txtNANutNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNANutNomActionPerformed(evt);
            }
        });

        CBNANutNom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno" }));
        CBNANutNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBNANutNomActionPerformed(evt);
            }
        });

        CBNAAlimNom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno" }));
        CBNAAlimNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBNAAlimNomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNANutNom, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(txtNACantCon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CBNANutNom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(verMagnitud, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNAAlimNom, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBNAAlimNom, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNAEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtNAAlimNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNANutNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CBNAAlimNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CBNANutNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNAEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNACantCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(verMagnitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabla"));

        tablaNA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NANutNom", "NAAlimNom", "NACantCon", "NAEstado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaNA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tablaNA);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169))
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
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 87, 66));
        jLabel1.setText("Nutriente - Alimento");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(20, 20, 20))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNAEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNAEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNAEstadoActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
         if(opcion==0){
            txtNANutNom.setEditable(false);
            txtNAAlimNom.setEditable(false);
            txtNACantCon.setEditable(true);            
            txtNAEstado.setEditable(false);
            CBNANutNom.setVisible(true);
            CBNAAlimNom.setVisible(true);            
            verMagnitud.setEditable(false);
            txtNAEstado.setText("A");
            opcion=1;
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
         if(opcion==0){
            int fila=tablaNA.getSelectedRow();
            if(fila>=0){
                CBNANutNom.setVisible(true);
                CBNAAlimNom.setVisible(true);
                
                txtNANutNom.setText(tablaNA.getValueAt(fila,0).toString());
                txtNAAlimNom.setText(tablaNA.getValueAt(fila,1).toString());
                txtNACantCon.setText(tablaNA.getValueAt(fila,2).toString());
                txtNAEstado.setText(tablaNA.getValueAt(fila,3).toString());
                
                txtNANutNom.setEditable(false);
                txtNAAlimNom.setEditable(false);
                txtNACantCon.setEditable(true);                
                txtNAEstado.setEditable(false);
                verMagnitud.setEditable(false);
                opcion=3;
            }else{
                JOptionPane.showMessageDialog(null,"fila no seleccionada");
            }

        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         if(opcion==0){
            int fila=tablaNA.getSelectedRow();
            if(fila>=0){
                CBNANutNom.setVisible(false);
                CBNAAlimNom.setVisible(false);
                
                txtNANutNom.setText(tablaNA.getValueAt(fila,0).toString());
                txtNAAlimNom.setText(tablaNA.getValueAt(fila,1).toString());
                txtNACantCon.setText(tablaNA.getValueAt(fila,2).toString());                
                txtNAEstado.setText(tablaNA.getValueAt(fila,3).toString());

                txtNANutNom.setEditable(false);
                txtNAAlimNom.setEditable(false);
                txtNACantCon.setEditable(false);                
                txtNAEstado.setEditable(false);
                verMagnitud.setEditable(false);
                
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
        
        
        CBNANutNom.setVisible(false);
        CBNAAlimNom.setVisible(false);
        verMagnitud.setEditable(false);
                        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnInactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInactivarActionPerformed
         if(opcion==0){
            int fila=tablaNA.getSelectedRow();
            if(fila>=0){
                CBNANutNom.setVisible(false);
                CBNAAlimNom.setVisible(false);
                txtNANutNom.setText(tablaNA.getValueAt(fila,0).toString());
                txtNAAlimNom.setText(tablaNA.getValueAt(fila,1).toString());
                txtNACantCon.setText(tablaNA.getValueAt(fila,2).toString());
                txtNAEstado.setText(tablaNA.getValueAt(fila,3).toString());
                
                txtNANutNom.setEditable(false);
                txtNAAlimNom.setEditable(false);
                txtNACantCon.setEditable(false);                
                txtNAEstado.setEditable(false);
                verMagnitud.setEditable(false);
                
                
            }}
            opcion=4;

    }//GEN-LAST:event_btnInactivarActionPerformed

    private void btnReactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReactivarActionPerformed
       if(opcion==0){
            int fila=tablaNA.getSelectedRow();
            if(fila>=0){
                CBNANutNom.setVisible(false);
                CBNAAlimNom.setVisible(false);
                txtNANutNom.setText(tablaNA.getValueAt(fila,0).toString());
                txtNAAlimNom.setText(tablaNA.getValueAt(fila,1).toString());
                txtNACantCon.setText(tablaNA.getValueAt(fila,2).toString());
                txtNAEstado.setText(tablaNA.getValueAt(fila,3).toString());
                
                txtNANutNom.setEditable(false);
                txtNAAlimNom.setEditable(false);
                txtNACantCon.setEditable(false);                
                txtNAEstado.setEditable(false);
                verMagnitud.setEditable(false);
            }}
            opcion=5;
    }//GEN-LAST:event_btnReactivarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        System.out.println(opcion);
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
        CBNANutNom.setVisible(false);
        CBNAAlimNom.setVisible(false);
        txtNANutNom.setEditable(false);
        txtNAAlimNom.setEditable(false);
        txtNACantCon.setEditable(false);                
        txtNAEstado.setEditable(false);
        verMagnitud.setEditable(false);
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

    private void txtNANutNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNANutNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNANutNomActionPerformed

    private void CBNANutNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBNANutNomActionPerformed
        // TODO add your handling code here:
        if(this.cont>0){
            try {
                Statement st=con.createStatement();
                ResultSet result=st.executeQuery("SELECT *FROM d1_nutriente WHERE NutNom='"+CBNANutNom.getSelectedItem()+"'");
                result.next();
                NutNombre=result.getString("NutNom");
                mostrarMagnitud = result.getString("NutMagNut");
                txtNANutNom.setText(NutNombre);
                verMagnitud.setText(mostrarMagnitud);
            } catch (SQLException ex) {
                Logger.getLogger(Nutriente_Alimento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_CBNANutNomActionPerformed

    private void CBNAAlimNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBNAAlimNomActionPerformed
        // TODO add your handling code here:
        if(this.cont>0){
            try {
                Statement st=con.createStatement();
                ResultSet result=st.executeQuery("SELECT *FROM d1_alimento WHERE AlimNom='"+CBNAAlimNom.getSelectedItem()+"'");
                result.next();
                AlimNom=result.getString("AlimNom");
                
                txtNAAlimNom.setText(AlimNom);
                
            } catch (SQLException ex) {
                Logger.getLogger(Nutriente_Alimento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_CBNAAlimNomActionPerformed

    private void txtNAAlimNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNAAlimNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNAAlimNomActionPerformed
     boolean buscar(String aNom, String nNom){
        boolean existeNutriente=false;
        String nutnom;
        String alimnom;
        try{
                Statement st=con.createStatement();
                ResultSet result=st.executeQuery("SELECT *FROM gz2_nutriente_alimento");
                while (result.next())
                {
                nutnom=result.getString("NANutNom");
                alimnom = result.getString("NAAlimNom");
                    if(aNom.equals(alimnom)&&nNom.equals(nutnom)){
                       existeNutriente =true;
                       
                    }               
                }            
        } catch (SQLException ex) {
                Logger.getLogger(Nutriente_Alimento.class.getName()).log(Level.SEVERE, null, ex);
            }         
        
        
        return existeNutriente;
    }
    void agregar(){
        String NANutNom = txtNANutNom.getText();
        String NAAlimNom = txtNAAlimNom.getText();
        String NACantCon = txtNACantCon.getText();
        String NAEstado = txtNAEstado.getText(); 
        NAEstado = "A";
        if(buscar(NAAlimNom, NANutNom)==false){
        try{
            
            if(NANutNom.equals("")||NAAlimNom.equals("")||NACantCon.equals("")||NAEstado.equals("")){
                JOptionPane.showMessageDialog(null, "Algunos campos estan vacios");
                limpiarTabla(modelo);
               
            }else{
                String sql = "INSERT INTO gz2_nutriente_alimento (NANutNom, NAAlimNom, NACantCon, NAEstado) VALUES('" + NANutNom + "','" + NAAlimNom + "','" + NACantCon + "','"+ NAEstado + "')";
                    
                    con = cn.getConnection();
                     
                    st = con.createStatement();
                     
                    st.executeUpdate(sql);
                   
                    
                    JOptionPane.showMessageDialog(null, "El registro " +NANutNom+" fue agregado con éxito a l tabla N-A");
                    limpiarTabla(modelo);
                }
        }catch(Exception e){
                System.out.println("error");
            }
        }else{
        System.out.println("agregar"+opcion);  
        JOptionPane.showMessageDialog(null, "Ya existe un animal "+NANutNom+" que consume el nutriente "+ NAAlimNom );
        limpiarTabla(modelo);
        vaciar();}
        }
    
    void actualizar() {
        String NANutNom = txtNANutNom.getText();
        String NAAlimNom = txtNAAlimNom.getText();
        String NACantCon = txtNACantCon.getText();
        String NAEstado = txtNAEstado.getText(); 
        
        String sql = "UPDATE gz2_nutriente_alimento SET NANutNom= '"+NANutNom+ "', NAAlimNom='"+ NAAlimNom + "', NACantCon ='"+ NACantCon + "', NAEstado='"+ NAEstado + "' WHERE NANutNom='" + NANutNom+"' AND NAAlimNom='"+ NAAlimNom+"'" ;
        System.out.println("hols");
        try{
         if(NANutNom!=null||NAAlimNom!=null||NACantCon!=null||NAEstado!=null){
                           
                con = cn.getConnection();                     
                st = con.createStatement();
                st.executeUpdate(sql);  
                
                JOptionPane.showMessageDialog(null, "Se modificó el registro "+NANutNom+" de la tabla N - A ");
                limpiarTabla(modelo);
         }else{
             JOptionPane.showMessageDialog(null, "Error"); 
         }             
               
                
        }catch(Exception e){
                System.out.println("hola");
            }

    }
    
    void eliminar() {
        
        String NANutNom = txtNANutNom.getText();
        String NAAlimNom = txtNAAlimNom.getText();
        String NACantCon = txtNACantCon.getText();
        String NAEstado = txtNAEstado.getText();          
            
            NAEstado = "*";
                                                                                    //WHERE pais = 'México' AND edad > 30   
            String sql = "UPDATE gz2_nutriente_alimento SET NAEstado='"+ NAEstado + "' WHERE NANutNom='" + NANutNom+"' AND NAAlimNom='"+ NAAlimNom+"'" ;
             try{
            if(NANutNom!=null||NAAlimNom!=null||NACantCon!=null||NAEstado!=null){
                
                con = cn.getConnection();                     
                st = con.createStatement();
                st.executeUpdate(sql);
                
                JOptionPane.showMessageDialog(null, "Se elimino el registro "+ NANutNom+" de la tabla N - A");
                limpiarTabla(modelo);
            }else{
                JOptionPane.showMessageDialog(null, "Error");
                }
        }catch(Exception e){
                
            }
           
       
         

    }
        void reactivar() {
       String NANutNom = txtNANutNom.getText();
        String NAAlimNom = txtNAAlimNom.getText();
        String NACantCon = txtNACantCon.getText();
        String NAEstado = txtNAEstado.getText();          
            
            NAEstado = "A";
        
            String sql = "UPDATE gz2_nutriente_alimento SET NAEstado='"+ NAEstado + "' WHERE NANutNom='" + NANutNom+"' AND NAAlimNom='"+ NAAlimNom+"'" ;
             try{
            if(NANutNom!=null||NAAlimNom!=null||NACantCon!=null||NAEstado!=null){
                
                con = cn.getConnection();                     
                st = con.createStatement();
                st.executeUpdate(sql);
                
                JOptionPane.showMessageDialog(null, "Se reactivo el registro "+NANutNom+" de la tabla N - A");
                limpiarTabla(modelo);
            }else{
                JOptionPane.showMessageDialog(null, "Error");
                }
        }catch(Exception e){
                
            }
    }
    void inactivar() {
        String NANutNom = txtNANutNom.getText();
        String NAAlimNom = txtNAAlimNom.getText();
        String NACantCon = txtNACantCon.getText();
        String NAEstado = txtNAEstado.getText();          
            
            NAEstado = "I";
        
            String sql = "UPDATE gz2_nutriente_alimento SET NAEstado='"+ NAEstado + "' WHERE NANutNom='" + NANutNom+"' AND NAAlimNom='"+ NAAlimNom+"'" ;
             try{
            if(NANutNom!=null||NAAlimNom!=null||NACantCon!=null||NAEstado!=null){
                con = cn.getConnection();                     
                st = con.createStatement();
                st.executeUpdate(sql);
                
                JOptionPane.showMessageDialog(null, "Se inactivo el registro "+NANutNom+" de la tabla N - A");
                limpiarTabla(modelo);
            }else{
                JOptionPane.showMessageDialog(null, "Error");
                }
        }catch(Exception e){
                
            }       

    }

void limpiarTabla(DefaultTableModel modelo) {
        for (int i = 0; i <= tablaNA.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }

    }
void vaciar() {
        txtNANutNom.setText("");
        txtNAAlimNom.setText("");
        txtNACantCon.setText("");        
        txtNAEstado.setText("");
        CBNANutNom.setSelectedIndex(0);
        CBNAAlimNom.setSelectedIndex(0);
        verMagnitud.setText("");
        
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
            java.util.logging.Logger.getLogger(Nutriente_Alimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nutriente_Alimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nutriente_Alimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nutriente_Alimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nutriente_Alimento().setVisible(true);
            }
        });
    }
    
    void listar(){
        String sql = "SELECT * FROM gz2_nutriente_alimento";
        try{
            con = cn.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            Object[]nutriente_alimento= new Object[4];
            modelo = (DefaultTableModel)tablaNA.getModel();
            while(rs.next()){
                nutriente_alimento[0]= rs.getString("NANutNom");
                nutriente_alimento[1]= rs.getString("NAAlimNom");
                nutriente_alimento[2]= rs.getInt("NACantCon");
                nutriente_alimento[3]= rs.getString("NAEstado");                
               
                modelo.addRow(nutriente_alimento);
            }
            tablaNA.setModel(modelo);
          }catch(Exception e){
              
          }
    }
   
     public void iniciarCBAlimNom(){
         try {
            Statement st=con.createStatement();
             ResultSet result=st.executeQuery("SELECT *FROM d1_alimento");
             
             while(result.next()){
                 CBNAAlimNom.addItem(result.getString("AlimNom"));
            }
             
        } catch (SQLException ex) {
            Logger.getLogger(Animal_Nutriente.class.getName()).log(Level.SEVERE, null, ex);
        }
           CBNAAlimNom.setVisible(false);
     }
     public void iniciarCBNutNom(){
         try {
            Statement st=con.createStatement();
             ResultSet result=st.executeQuery("SELECT *FROM d1_nutriente");
             
             while(result.next()){
                 CBNANutNom.addItem(result.getString("NutNom"));
            }
             
        } catch (SQLException ex) {
            Logger.getLogger(Animal_Nutriente.class.getName()).log(Level.SEVERE, null, ex);
        }
           CBNANutNom.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBNAAlimNom;
    private javax.swing.JComboBox<String> CBNANutNom;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInactivar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnReactivar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaNA;
    private javax.swing.JTextField txtNAAlimNom;
    private javax.swing.JTextField txtNACantCon;
    private javax.swing.JTextField txtNAEstado;
    private javax.swing.JTextField txtNANutNom;
    private javax.swing.JTextField verMagnitud;
    // End of variables declaration//GEN-END:variables
}
