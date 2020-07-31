package dietas1;

import java.awt.Image;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Animal_Nutriente extends javax.swing.JFrame {
    int opcion=0;
    int cont =0;
    Conexion cn = new Conexion();
    Connection con;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    int id =0;
    
    String AnimCodigo= "";
    String NutNombre ="";
    String mostrarAnimal ="";
    String mostrarMagnitud="";
    
    public Animal_Nutriente() {
        initComponents();
        setLocationRelativeTo(null);
        
        setTitle("DIETAS GANADERAS - Animal_Nutriente");      
       
        listar();
        
        txtANAnimCod.setEditable(false); 
        txtANNutNom.setEditable(false);        
        txtANCantNec.setEditable(false);        
        txtANEstado.setEditable(false);
        verAnimal.setEditable(false);
        verMagnitud.setEditable(false);
        
        this.iniciarCBCodAnim();
        this.iniciarCBNutNom();
        
        CBAnimCod.setVisible(false);
        CBNutNom.setVisible(false);
        
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
        txtANCantNec = new javax.swing.JTextField();
        txtANNutNom = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtANEstado = new javax.swing.JTextField();
        txtANAnimCod = new javax.swing.JTextField();
        CBAnimCod = new javax.swing.JComboBox<>();
        CBNutNom = new javax.swing.JComboBox<>();
        verAnimal = new javax.swing.JTextField();
        verMagnitud = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAN = new javax.swing.JTable();
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

        jLabel2.setText("Codigo del animal:");

        jLabel6.setText("Cantidad necesaria:");

        jLabel8.setText("Nombre del nutriente:");

        jLabel12.setText("                       Estado:");

        txtANEstado.setText("A");
        txtANEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtANEstadoActionPerformed(evt);
            }
        });

        txtANAnimCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtANAnimCodActionPerformed(evt);
            }
        });

        CBAnimCod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NINGUNO" }));
        CBAnimCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBAnimCodActionPerformed(evt);
            }
        });

        CBNutNom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NINGUNO" }));
        CBNutNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBNutNomActionPerformed(evt);
            }
        });

        verAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verAnimalActionPerformed(evt);
            }
        });

        jLabel3.setText("Ref. tipo de animal:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtANCantNec, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(txtANAnimCod))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CBAnimCod, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(verMagnitud, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtANNutNom, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CBNutNom, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtANEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(verAnimal))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtANAnimCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtANNutNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CBAnimCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CBNutNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtANCantNec)
                    .addComponent(verMagnitud)
                    .addComponent(jLabel12)
                    .addComponent(txtANEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabla"));

        tablaAN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ANAnimCod", "ANNutNom", "ANCantNec", "ANEstado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaAN.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tablaAN);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220))
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
        jLabel1.setText("Animal - Nutriente");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 39, Short.MAX_VALUE))
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

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        vaciar();
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

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
        CBAnimCod.setVisible(false);
        CBNutNom.setVisible(false);
        txtANAnimCod.setEditable(false);
        txtANNutNom.setEditable(false);
        txtANCantNec.setEditable(false);
        txtANEstado.setEditable(false);
        verAnimal.setEditable(false);
        verMagnitud.setEditable(false);
        btnAdicionar.setEnabled(true);
        btnModificar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnReactivar.setEnabled(true);
        btnInactivar.setEnabled(true);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnReactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReactivarActionPerformed
        if(opcion==0){
            int fila=tablaAN.getSelectedRow();
            if(fila>=0){
                CBAnimCod.setVisible(false);
                CBNutNom.setVisible(false);
                txtANAnimCod.setText(tablaAN.getValueAt(fila,0).toString());
                txtANNutNom.setText(tablaAN.getValueAt(fila,1).toString());
                txtANCantNec.setText(tablaAN.getValueAt(fila,2).toString());
                txtANEstado.setText(tablaAN.getValueAt(fila,3).toString());
                txtANAnimCod.setEditable(false);
                txtANNutNom.setEditable(false);
                txtANCantNec.setEditable(false);
                txtANEstado.setEditable(false);
                verAnimal.setEditable(false);
                verMagnitud.setEditable(false);
            }}
            opcion=5;
    }//GEN-LAST:event_btnReactivarActionPerformed

    private void btnInactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInactivarActionPerformed
        if(opcion==0){
            int fila=tablaAN.getSelectedRow();
            if(fila>=0){
                CBAnimCod.setVisible(false);
                CBNutNom.setVisible(false);

                txtANAnimCod.setText(tablaAN.getValueAt(fila,0).toString());
                txtANNutNom.setText(tablaAN.getValueAt(fila,1).toString());
                txtANCantNec.setText(tablaAN.getValueAt(fila,2).toString());
                txtANEstado.setText(tablaAN.getValueAt(fila,3).toString());
                txtANAnimCod.setEditable(false);
                txtANNutNom.setEditable(false);
                txtANCantNec.setEditable(false);
                txtANEstado.setEditable(false);
                verAnimal.setEditable(false);
                verMagnitud.setEditable(false);
            }}
            opcion=4;
    }//GEN-LAST:event_btnInactivarActionPerformed

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

        CBAnimCod.setVisible(false);
        CBNutNom.setVisible(false);
        verAnimal.setEditable(false);
        verMagnitud.setEditable(false);

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(opcion==0){
            int fila=tablaAN.getSelectedRow();
            if(fila>=0){
                CBAnimCod.setVisible(false);
                CBNutNom.setVisible(false);
                txtANAnimCod.setText(tablaAN.getValueAt(fila,0).toString());
                txtANNutNom.setText(tablaAN.getValueAt(fila,1).toString());
                txtANCantNec.setText(tablaAN.getValueAt(fila,2).toString());
                txtANEstado.setText(tablaAN.getValueAt(fila,3).toString());

                txtANAnimCod.setEditable(false);
                txtANNutNom.setEditable(false);
                txtANCantNec.setEditable(false);
                txtANEstado.setEditable(false);
                verAnimal.setEditable(false);
                verMagnitud.setEditable(false);
            }}
            opcion=6;
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if(opcion==0){
            int fila=tablaAN.getSelectedRow();
            if(fila>=0){
                CBAnimCod.setVisible(true);
                CBNutNom.setVisible(true);

                txtANAnimCod.setText(tablaAN.getValueAt(fila,0).toString());
                txtANNutNom.setText(tablaAN.getValueAt(fila,1).toString());
                txtANCantNec.setText(tablaAN.getValueAt(fila,2).toString());
                txtANEstado.setText(tablaAN.getValueAt(fila,3).toString());

                txtANAnimCod.setEditable(false);
                txtANNutNom.setEditable(false);
                txtANCantNec.setEditable(true);
                txtANEstado.setEditable(false);
                verAnimal.setEditable(false);
                verMagnitud.setEditable(false);

                opcion=3;
            }else{
                JOptionPane.showMessageDialog(null,"fila no seleccionada");
            }

        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        if(opcion==0){
            txtANAnimCod.setEditable(false);
            txtANNutNom.setEditable(false);
            txtANCantNec.setEditable(true);
            txtANEstado.setEditable(false);
            CBAnimCod.setVisible(true);
            CBNutNom.setVisible(true);
            verAnimal.setEditable(false);
            verMagnitud.setEditable(false);
            opcion=1;
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void verAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verAnimalActionPerformed

    private void CBNutNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBNutNomActionPerformed
        // TODO add your handling code here:
        if(this.cont>0){
            try {
                Statement st=con.createStatement();
                ResultSet result=st.executeQuery("SELECT *FROM d1_Nutriente WHERE NutNom='"+CBNutNom.getSelectedItem()+"'");
                result.next();
                NutNombre=result.getString("NutNom");
                mostrarMagnitud = result.getString("NutMagNut");
                txtANNutNom.setText(NutNombre);
                verMagnitud.setText(mostrarMagnitud);
            } catch (SQLException ex) {
                Logger.getLogger(Animal_Nutriente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_CBNutNomActionPerformed

    private void CBAnimCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBAnimCodActionPerformed
        // TODO add your handling code here:
        if(this.cont>0){
            try {
                Statement st=con.createStatement();
                ResultSet result=st.executeQuery("SELECT *FROM d1_Animal WHERE AnimCod='"+CBAnimCod.getSelectedItem()+"'");
                result.next();
                AnimCodigo=result.getString("AnimCod");
                mostrarAnimal = result.getString("AnimTip");
                txtANAnimCod.setText(AnimCodigo);
                verAnimal.setText(mostrarAnimal);
            } catch (SQLException ex) {
                Logger.getLogger(Animal_Nutriente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_CBAnimCodActionPerformed

    private void txtANAnimCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtANAnimCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtANAnimCodActionPerformed

    private void txtANEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtANEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtANEstadoActionPerformed
    
    void agregar(){
        String ANAnimCod = txtANAnimCod.getText();
        String ANNutNom = txtANNutNom.getText();
        String ANCantNec = txtANCantNec.getText();   
        String ANEstado = txtANEstado.getText();           
        try{
            if(ANAnimCod.equals("")||ANNutNom.equals("")||ANCantNec.equals("")||ANEstado.equals("")){
                JOptionPane.showMessageDialog(null, "Algunos campos estan vacios");
                limpiarTabla(modelo);
                
            }else{
                String sql = "INSERT INTO gz2_animal_nutriente (ANAnimCod, ANNutNom, ANCantNec, ANEstado) VALUES('" + ANAnimCod + "','" + ANNutNom + "','" + ANCantNec + "','"+ ANEstado + "')";
                    
                    con = cn.getConnection();                     
                    st = con.createStatement();                     
                    st.executeUpdate(sql);                 
                    
                    JOptionPane.showMessageDialog(null, "Se ha registrado "+ANAnimCod+" con éxito a la tabla ANIMAL_NUTRIENTE" );
                    limpiarTabla(modelo);
                }
        }catch(Exception e){
                System.out.println("error");
            }
        }
    
    void actualizar() {
        String ANAnimCod = txtANAnimCod.getText();
        String ANNutNom = txtANNutNom.getText();
        String ANCantNec = txtANCantNec.getText();   
        String ANEstado = txtANEstado.getText(); 
        
        String sql = "UPDATE gz2_animal_nutriente SET ANAnimCod= '"+ANAnimCod+ "', ANNutNom='"+ ANNutNom + "', ANCantNec ='"+ ANCantNec + "', ANEstado='"+ ANEstado +  "' WHERE ANAnimCod='" + ANAnimCod+"'";
        System.out.println("hols");
        try{
         if(ANAnimCod!=null||ANNutNom!=null||ANCantNec!=null||ANEstado!=null){
                           
                con = cn.getConnection();                     
                st = con.createStatement();
                st.executeUpdate(sql);  
                
                JOptionPane.showMessageDialog(null, "Se modificó el registro "+ANAnimCod+" de la tabla ANIMAL_NUTRIENTE ");
                limpiarTabla(modelo);
         }else{
             JOptionPane.showMessageDialog(null, "Error"); 
         }             
               
                
        }catch(Exception e){
                System.out.println("hola");
            }

    }
    
    void eliminar() {
        
        String ANAnimCod = txtANAnimCod.getText();
        String ANNutNom = txtANNutNom.getText();
        String ANCantNec = txtANCantNec.getText();   
        String ANEstado = txtANEstado.getText();           
            
            ANEstado = "*";
        
            String sql = "UPDATE gz2_animal_nutriente SET ANEstado='"+ ANEstado + "' WHERE ANAnimCod='" + ANAnimCod+"'"; 
             try{
            if(ANAnimCod!=null||ANNutNom!=null||ANCantNec!=null||ANEstado!=null){
                
                con = cn.getConnection();                     
                st = con.createStatement();
                st.executeUpdate(sql);
                
                JOptionPane.showMessageDialog(null, "Se elimino el registro "+ ANAnimCod+" de la tabla ANIMAL_NUTRIENTE");
                limpiarTabla(modelo);
            }else{
                JOptionPane.showMessageDialog(null, "Error");
                }
        }catch(Exception e){
                
            }
           
       
         

    }
        void reactivar() {
        String ANAnimCod = txtANAnimCod.getText();
        String ANNutNom = txtANNutNom.getText();
        String ANCantNec = txtANCantNec.getText();   
        String ANEstado = txtANEstado.getText();
            
            
            ANEstado = "A";
        
            String sql = "UPDATE gz2_animal_nutriente SET ANEstado='"+ ANEstado + "' WHERE ANAnimCod='" + ANAnimCod+"'"; 
             try{
            if(ANAnimCod!=null||ANNutNom!=null||ANCantNec!=null||ANEstado!=null){
                
                con = cn.getConnection();                     
                st = con.createStatement();
                st.executeUpdate(sql);
                
                JOptionPane.showMessageDialog(null, "Se reactivo el registro "+ANAnimCod+" de la tabla ANIMAL_NUTRIENTE");
                limpiarTabla(modelo);
            }else{
                JOptionPane.showMessageDialog(null, "Error");
                }
        }catch(Exception e){
                
            }
    }
    void inactivar() {
        System.out.println("hi1");
        String ANAnimCod = txtANAnimCod.getText();
        String ANNutNom = txtANNutNom.getText();
        String ANCantNec = txtANCantNec.getText();   
        String ANEstado = txtANEstado.getText();
            
            
            ANEstado = "I";
        
        
            String sql = "UPDATE gz2_animal_nutriente SET ANEstado='"+ ANEstado + "' WHERE ANAnimCod='" + ANAnimCod+"'"; 
            System.out.println("hi2");
             try{
            if(ANAnimCod!=null||ANNutNom!=null||ANCantNec!=null||ANEstado!=null){
                System.out.println("hi3");
                con = cn.getConnection();                     
                st = con.createStatement();
                st.executeUpdate(sql);
                System.out.println("hi4");
                JOptionPane.showMessageDialog(null, "Se inactivo el registro "+ANAnimCod+" de la tabla ANIMAL_NUTRIENTE");
                limpiarTabla(modelo);
            }else{
                JOptionPane.showMessageDialog(null, "Error");
                }
        }catch(Exception e){
                
            }       

    }

void limpiarTabla(DefaultTableModel modelo) {
        for (int i = 0; i <= tablaAN.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }

    }
void vaciar() {
        txtANAnimCod.setText("");
        txtANNutNom.setText("");
        txtANCantNec.setText("");
        txtANEstado.setText("");
        CBAnimCod.setSelectedIndex(0);
        CBNutNom.setSelectedIndex(0);
        verAnimal.setText("");
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
            java.util.logging.Logger.getLogger(Animal_Nutriente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Animal_Nutriente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Animal_Nutriente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Animal_Nutriente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Animal_Nutriente().setVisible(true);
            }
        });
    }
    
    void listar(){
        String sql = "SELECT * FROM gz2_animal_nutriente";
        try{
            con = cn.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            Object[]alimento_nutriente= new Object[4];
            
            modelo = (DefaultTableModel)tablaAN.getModel();
          
            while(rs.next()){
                
                
                alimento_nutriente[0]= rs.getInt("ANAnimCod");
                alimento_nutriente[1]= rs.getString("ANNutNom");
                alimento_nutriente[2]= rs.getInt("ANCantNec");
                alimento_nutriente[3]= rs.getString("ANEstado");       
          
                modelo.addRow(alimento_nutriente);
               
            }
            tablaAN.setModel(modelo);
          }catch(Exception e){
              
          }
    }
    
    public void iniciarCBCodAnim(){
         try {
            Statement st=con.createStatement();
             ResultSet result=st.executeQuery("SELECT *FROM d1_Animal");
             
             while(result.next()){
                 CBAnimCod.addItem(result.getString("AnimCod"));
            }
             
        } catch (SQLException ex) {
            Logger.getLogger(Animal_Nutriente.class.getName()).log(Level.SEVERE, null, ex);
        }
           CBAnimCod.setVisible(false);
    }
     public void iniciarCBNutNom(){
            try {
            Statement st=con.createStatement();
             ResultSet result=st.executeQuery("SELECT *FROM d1_Nutriente");
             
             while(result.next()){
                 CBNutNom.addItem(result.getString("NutNom"));
            }
             
        } catch (SQLException ex) {
            Logger.getLogger(Animal_Nutriente.class.getName()).log(Level.SEVERE, null, ex);
        }
           CBNutNom.setVisible(false);
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBAnimCod;
    private javax.swing.JComboBox<String> CBNutNom;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaAN;
    private javax.swing.JTextField txtANAnimCod;
    private javax.swing.JTextField txtANCantNec;
    private javax.swing.JTextField txtANEstado;
    private javax.swing.JTextField txtANNutNom;
    private javax.swing.JTextField verAnimal;
    private javax.swing.JTextField verMagnitud;
    // End of variables declaration//GEN-END:variables
}
