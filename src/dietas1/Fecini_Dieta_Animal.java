package dietas1;

import java.awt.Image;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Fecini_Dieta_Animal extends javax.swing.JFrame {
    int opcion=0;
    int cont =0;
    Conexion cn = new Conexion();
    Connection con;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    int id =0;
    
    String Dieta= "";
    String Alimento ="";
    String Toma ="";
    
    private String AnimalTable;
    private String FechaTable;
    
    public Fecini_Dieta_Animal() {
        initComponents();
        setLocationRelativeTo(null);
        
        setTitle("DIETAS GANADERAS - Alimento_Dieta_Toma");      
       
        listar();
        
        txtDietaCodigo.setEditable(false); 
        txtAnimalCodigo.setEditable(false);       
        txtFechaInicio.setEditable(false);
        txtResultado.setEditable(false);
        txtEstado.setEditable(false);
        
        
        
        this.iniciarCBDietCod();
        this.iniciarCBAlimNom();
        
        
        CBDieta.setVisible(false);
        CBAnimal.setVisible(false);
        
        cont++;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        txtDietaCodigo = new javax.swing.JTextField();
        CBDieta = new javax.swing.JComboBox<>();
        txtFechaInicio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CBAnimal = new javax.swing.JComboBox<>();
        txtAnimalCodigo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFDA = new javax.swing.JTable();
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

        jLabel8.setText("Codigo Animal :");

        jLabel12.setText("     Estado               :");

        txtEstado.setText("A");
        txtEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoActionPerformed(evt);
            }
        });

        txtDietaCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDietaCodigoActionPerformed(evt);
            }
        });

        CBDieta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NINGUNO" }));
        CBDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBDietaActionPerformed(evt);
            }
        });

        txtFechaInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaInicioActionPerformed(evt);
            }
        });

        jLabel9.setText("Fecha Inicio    :");

        jLabel2.setText("Codigo Dieta          :");

        CBAnimal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NINGUNO" }));
        CBAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBAnimalActionPerformed(evt);
            }
        });

        jLabel10.setText("Resultado de Dieta : ");

        txtResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtResultado))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtAnimalCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(CBAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDietaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CBDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(CBAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnimalCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtDietaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabla"));

        tablaFDA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FDAAnimCod", "FDAFecIni", "FDADietCod", "FDAResOd", "FDAEstado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaFDA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tablaFDA);

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
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        jLabel1.setText("Fecha Inicio - Animal - Dieta");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(89, 89, 89))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        vaciar();
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

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
        CBDieta.setVisible(false);
        CBAnimal.setVisible(false);
       
        txtDietaCodigo.setEditable(false);
        txtAnimalCodigo.setEditable(false);
         
        txtResultado.setEditable(false);
        txtEstado.setEditable(false);
        txtFechaInicio.setEditable(false);
        
        btnAdicionar.setEnabled(true);
        btnModificar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnReactivar.setEnabled(true);
        btnInactivar.setEnabled(true);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnReactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReactivarActionPerformed
        if(opcion==0){
            int fila=tablaFDA.getSelectedRow();
            if(fila>=0){
                CBDieta.setVisible(false);
                CBAnimal.setVisible(false);
                
                txtAnimalCodigo.setText(tablaFDA.getValueAt(fila,0).toString());
                txtFechaInicio.setText(tablaFDA.getValueAt(fila,1).toString());
                txtDietaCodigo.setText(tablaFDA.getValueAt(fila,2).toString());
                txtResultado.setText(tablaFDA.getValueAt(fila,3).toString());
                txtEstado.setText(tablaFDA.getValueAt(fila,4).toString());
                txtResultado.setEditable(false);
                txtDietaCodigo.setEditable(false);
                txtAnimalCodigo.setEditable(false);
                
                txtEstado.setEditable(false);
                txtFechaInicio.setEditable(false);
                
            }}
            opcion=5;
    }//GEN-LAST:event_btnReactivarActionPerformed

    private void btnInactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInactivarActionPerformed
        if(opcion==0){
            int fila=tablaFDA.getSelectedRow();
            if(fila>=0){
                CBDieta.setVisible(false);
                CBAnimal.setVisible(false);
                

                txtAnimalCodigo.setText(tablaFDA.getValueAt(fila,0).toString());
                txtFechaInicio.setText(tablaFDA.getValueAt(fila,1).toString());
                txtDietaCodigo.setText(tablaFDA.getValueAt(fila,2).toString());
                txtResultado.setText(tablaFDA.getValueAt(fila,3).toString());
                txtEstado.setText(tablaFDA.getValueAt(fila,4).toString());
                txtResultado.setEditable(false);
                txtDietaCodigo.setEditable(false);
                txtAnimalCodigo.setEditable(false);
                
                txtEstado.setEditable(false);
                txtFechaInicio.setEditable(false);
                
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

        CBDieta.setVisible(false);
        CBAnimal.setVisible(false);
       
        txtFechaInicio.setEditable(false);
        

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(opcion==0){
            int fila=tablaFDA.getSelectedRow();
            if(fila>=0){
                CBDieta.setVisible(false);
                CBAnimal.setVisible(false);
               
                
                txtAnimalCodigo.setText(tablaFDA.getValueAt(fila,0).toString());
                txtFechaInicio.setText(tablaFDA.getValueAt(fila,1).toString());
                txtDietaCodigo.setText(tablaFDA.getValueAt(fila,2).toString());
                txtResultado.setText(tablaFDA.getValueAt(fila,3).toString());
                txtEstado.setText(tablaFDA.getValueAt(fila,4).toString());
                txtResultado.setEditable(false);

                txtDietaCodigo.setEditable(false);
                txtAnimalCodigo.setEditable(false);
                
                txtEstado.setEditable(false);
                txtFechaInicio.setEditable(false);
                
            }}
            opcion=6;
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if(opcion==0){
            int fila=tablaFDA.getSelectedRow();
            if(fila>=0){
                CBDieta.setVisible(true);
                CBAnimal.setVisible(true);
                

                txtAnimalCodigo.setText(tablaFDA.getValueAt(fila,0).toString());
                txtFechaInicio.setText(tablaFDA.getValueAt(fila,1).toString());
                txtDietaCodigo.setText(tablaFDA.getValueAt(fila,2).toString());
                txtResultado.setText(tablaFDA.getValueAt(fila,3).toString());
                txtEstado.setText(tablaFDA.getValueAt(fila,4).toString());
                
                setDieta(tablaFDA.getValueAt(fila,0).toString());
                setAlimento(tablaFDA.getValueAt(fila,1).toString());
                
                
                txtResultado.setEditable(true);
                txtDietaCodigo.setEditable(false);
                txtAnimalCodigo.setEditable(false);
                txtEstado.setEditable(false);
                txtFechaInicio.setEditable(true);
               

                opcion=3;
            }else{
                JOptionPane.showMessageDialog(null,"fila no seleccionada");
            }

        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        if(opcion==0){
            txtDietaCodigo.setEditable(false);
            txtAnimalCodigo.setEditable(false);
            txtFechaInicio.setEditable(true);
            txtResultado.setEditable(true);
            txtEstado.setEditable(false);
            
            CBDieta.setVisible(true);
            CBAnimal.setVisible(true);
            
          
            
            txtEstado.setText("A");
            opcion=1;
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void txtFechaInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaInicioActionPerformed

    private void CBAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBAnimalActionPerformed
        // TODO add your handling code here:
        if(this.cont>0){
            try {
                Statement st=con.createStatement();
                ResultSet result=st.executeQuery("SELECT *FROM d1_animal WHERE AnimTip='"+CBAnimal.getSelectedItem()+"'");
                result.next();
                Alimento=result.getString("AnimCod");
               
                txtAnimalCodigo.setText(Alimento);
                
            } catch (SQLException ex) {
                Logger.getLogger(Fecini_Dieta_Animal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_CBAnimalActionPerformed

    private void CBDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBDietaActionPerformed
        // TODO add your handling code here:
        if(this.cont>0){
            try {
                Statement st=con.createStatement();
                ResultSet result=st.executeQuery("SELECT *FROM d1_dieta WHERE DietFin='"+CBDieta.getSelectedItem()+"'");
                result.next();
                Dieta=result.getString("DietCod");
                txtDietaCodigo.setText(Dieta);

            } catch (SQLException ex) {
                Logger.getLogger(Fecini_Dieta_Animal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_CBDietaActionPerformed

    private void txtDietaCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDietaCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDietaCodigoActionPerformed

    private void txtEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoActionPerformed

    private void txtResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadoActionPerformed
    /*boolean buscar(String aCod, String nNom){
        boolean existeNutriente=false;
        String nutnom;
        String animcod;
        try{
                Statement st=con.createStatement();
                ResultSet result=st.executeQuery("SELECT *FROM gz2_animal_nutriente");
                while (result.next())
                {
                nutnom=result.getString("ANNutNom");
                animcod = result.getString("ANAnimCod");
                    if(aCod.equals(animcod)&&nNom.equals(nutnom)){
                       existeNutriente =true;
                       
                    }               
                }            
        } catch (SQLException ex) {
                Logger.getLogger(Alimento_Dieta_Toma.class.getName()).log(Level.SEVERE, null, ex);
            }         
        
        
        return existeNutriente;
    }*/
    
    void agregar(){
        String DietCod = txtDietaCodigo.getText();
        String AnimalCod = txtAnimalCodigo.getText();
        String FechaInicio  = txtFechaInicio.getText();
        String Resultado = txtResultado.getText();   
        String Estado = txtEstado.getText(); 
        
       // if(buscar(ANAnimCod, ANNutNom)==false){
        try{
            if(DietCod.equals("")||FechaInicio.equals("")||Resultado.equals("")||FechaInicio.equals("")||Estado.equals("")){
                JOptionPane.showMessageDialog(null, "Algunos campos estan vacios");
                limpiarTabla(modelo);
            }else{
                String sql = "INSERT INTO gz2_fecini_dieta_animal (FDAAnimCod, FDAFecIni, FDADietCod, FDAResOd, FDAEstado) VALUES('" + AnimalCod + "','" + FechaInicio + "','" + DietCod + "','" + Resultado + "','"+ Estado + "')";
                    System.out.println(sql);
                    con = cn.getConnection();                     
                    st = con.createStatement();                     
                    st.executeUpdate(sql);                 
                    
                    JOptionPane.showMessageDialog(null, "Se ha registrado "+DietCod+" con éxito a la tabla FecIni-Dieta-Animal" );
                    limpiarTabla(modelo);
                }
        }catch(Exception e){
                /*if(buscar(ANAnimCod, ANNutNom)==true){
                            throw  new Error ("error1");
                        }*/                     
                    System.out.println("error");
        }        
        /*
        }else{
        System.out.println("agregar"+opcion);  
        JOptionPane.showMessageDialog(null, "Ya existe un animal "+ANAnimCod+" que consume el nutriente "+ ANNutNom );
        vaciar();
        ANEstado = "A";
        
        txtANAnimCod.setEditable(false);
                txtANNutNom.setEditable(false);
                txtANCantNec.setEditable(false);
                txtANEstado.setEditable(false);
                verAnimal.setEditable(false);
                verMagnitud.setEditable(false);
                CBAnimCod.setVisible(false);
                CBNutNom.setVisible(false);
        
        
        }      */
}    
    void actualizar() {
        
        String CodDieta = txtDietaCodigo.getText();
        String Animal = txtAnimalCodigo.getText();
        String Fecha = txtFechaInicio.getText();
        String Resultado=  txtResultado.getText();
        String Estado = txtEstado.getText();
        
        
        String sql = "UPDATE gz2_fecini_dieta_animal SET FDADietCod= '"+CodDieta+ "', FDAAnimCod='"+ Animal + "', FDAFecIni='"+ Fecha + "', FDAResOd ='"+ Resultado + "', FDAEstado='"+ Estado +  "' WHERE FDAAnimCod='" + AnimalTable+"' AND FDAFecIni='"+ FechaTable+"'" ; 
        
        System.out.println(sql);
        try{
         if(CodDieta!=null||Animal!=null||Fecha!=null||Resultado!=null||Estado!=null){
                           
                con = cn.getConnection();                     
                st = con.createStatement();
                st.executeUpdate(sql);  
                
                JOptionPane.showMessageDialog(null, "Se modificó el registro "+CodDieta+" de la tabla FecIni-Dieta-Animal ");
                limpiarTabla(modelo);
         }else{
             JOptionPane.showMessageDialog(null, "Error"); 
         }             
               
                
        }catch(Exception e){
                System.out.println("Error ");
            }

    }
    
    void eliminar() {
        
        String CodDieta = txtDietaCodigo.getText();
        String AlimNom = txtAnimalCodigo.getText();
        String CodToma = txtFechaInicio.getText();
        String CantToma = txtResultado.getText();   
        String Estado = txtEstado.getText();           
            
            Estado = "*";
        
            String sql = "UPDATE gz2_fecini_dieta_animal SET FDAEstado='"+ Estado + "' WHERE FDAAnimCod='" + AlimNom+"' AND FDAFecIni='"+CodToma+"'" ; 
            
            try{
            if(CodDieta!=null||AlimNom!=null||CantToma!=null||Estado!=null){
                
                con = cn.getConnection();                     
                st = con.createStatement();
                System.out.println(sql);
                st.executeUpdate(sql);
                
                JOptionPane.showMessageDialog(null, "Se elimino el registro "+ CodDieta+" de la tabla FecIni-Dieta-Animal");
                limpiarTabla(modelo);
            }else{
                JOptionPane.showMessageDialog(null, "Error");
                }
        }catch(Exception e){
                
            }
           
       
         

    }
    void reactivar() {
        String CodDieta = txtDietaCodigo.getText();
        String AlimNom = txtAnimalCodigo.getText();
        String CodToma = txtFechaInicio.getText();
        String CantToma = txtResultado.getText();   
        String Estado = txtEstado.getText();           
            
            Estado = "A";
        
            String sql = "UPDATE gz2_fecini_dieta_animal SET FDAEstado='"+ Estado + "' WHERE FDAAnimCod='" + AlimNom+"' AND FDAFecIni='"+CodToma+"'" ; 
            
            try{
            if(CodDieta!=null||AlimNom!=null||CantToma!=null||Estado!=null){
                
                con = cn.getConnection();                     
                st = con.createStatement();
                System.out.println(sql);
                st.executeUpdate(sql);
                
                JOptionPane.showMessageDialog(null, "Se elimino el registro "+ CodDieta+" de la tabla FecIni-Dieta-Animal");
                limpiarTabla(modelo);
            }else{
                JOptionPane.showMessageDialog(null, "Error");
                }
        }catch(Exception e){
                
            }
    }
    void inactivar() {
        String CodDieta = txtDietaCodigo.getText();
        String AlimNom = txtAnimalCodigo.getText();
        String CodToma = txtFechaInicio.getText();
        String CantToma = txtResultado.getText();   
        String Estado = txtEstado.getText();           
            
            Estado = "I";
        
            String sql = "UPDATE gz2_fecini_dieta_animal SET FDAEstado='"+ Estado + "' WHERE FDAAnimCod='" + AlimNom+"' AND FDAFecIni='"+CodToma+"'" ; 
            
            try{
            if(CodDieta!=null||AlimNom!=null||CantToma!=null||Estado!=null){
                
                con = cn.getConnection();                     
                st = con.createStatement();
                System.out.println(sql);
                st.executeUpdate(sql);
                
                JOptionPane.showMessageDialog(null, "Se elimino el registro "+ CodDieta+" de la tabla FecIni-Dieta-Animal");
                limpiarTabla(modelo);
            }else{
                JOptionPane.showMessageDialog(null, "Error");
                }
        }catch(Exception e){
                
            }    

    }


void limpiarTabla(DefaultTableModel modelo) {
        for (int i = 0; i <= tablaFDA.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }

    }
void vaciar() {
        txtDietaCodigo.setText("");
        txtAnimalCodigo.setText("");
        txtFechaInicio.setText("");
        txtResultado.setText("");
        txtEstado.setText("");
        CBDieta.setSelectedIndex(0);
        CBAnimal.setSelectedIndex(0);
        
        txtFechaInicio.setText("");
        
        
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
            java.util.logging.Logger.getLogger(Fecini_Dieta_Animal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fecini_Dieta_Animal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fecini_Dieta_Animal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fecini_Dieta_Animal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Fecini_Dieta_Animal().setVisible(true);
            }
        });
    }
    /*
    public void mostrar(String valor){
     DefaultTableModel modelo1=new DefaultTableModel();   
     modelo1.addColumn("ANAnimCod");
     modelo1.addColumn("ANNutNom");
     modelo1.addColumn("ANCantNec");
     modelo1.addColumn("ANEstado");
     
     tablaAN.setModel(modelo1);
     String datos[]=new String[4]; 
     String texto="SELECT * FROM gz2_animal_nutriente";
        
     try{
         Statement st=con.createStatement();
         ResultSet result=st.executeQuery(texto);
         while(result.next()){
            datos[0]=result.getString(1);
            datos[1]=result.getString(2);
            datos[2]=result.getString(3);
            datos[3]=result.getString(4);
         }
         tablaAN.setModel(modelo1);
     }catch(SQLException ex){
         Logger.getLogger(Animal_Nutriente.class.getName()).log(Level.SEVERE, null, ex);
     }
    }*/
    void listar(){
        String sql = "SELECT * FROM gz2_fecini_dieta_animal";
        try{
            con = cn.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            Object[]alimento_dieta_toma= new Object[5];
            
            modelo = (DefaultTableModel)tablaFDA.getModel();
          
            while(rs.next()){
                
                
                alimento_dieta_toma[0]= rs.getInt("FDAAnimCod");
                alimento_dieta_toma[1]= rs.getString("FDAFecIni");
                alimento_dieta_toma[2]= rs.getInt("FDADietCod");
                alimento_dieta_toma[3]= rs.getString("FDAResOd");
                alimento_dieta_toma[4]= rs.getString("FDAEstado");
          
                modelo.addRow(alimento_dieta_toma);
               
            }
            tablaFDA.setModel(modelo);
          }catch(Exception e){
              
          }
    }
    
    public void iniciarCBDietCod(){
         try {
            Statement st=con.createStatement();
             ResultSet result=st.executeQuery("SELECT *FROM d1_dieta");
             
             while(result.next()){
                 CBDieta.addItem(result.getString("DietFin"));
            }
             
        } catch (SQLException ex) {
            Logger.getLogger(Fecini_Dieta_Animal.class.getName()).log(Level.SEVERE, null, ex);
        }
           CBDieta.setVisible(false);
    }
     public void iniciarCBAlimNom(){
            try {
            Statement st=con.createStatement();
             ResultSet result=st.executeQuery("SELECT *FROM d1_animal");
             
             while(result.next()){
                 CBAnimal.addItem(result.getString("AnimTip"));
            }
             
        } catch (SQLException ex) {
            Logger.getLogger(Fecini_Dieta_Animal.class.getName()).log(Level.SEVERE, null, ex);
        }
           CBAnimal.setVisible(false);
        }
     
     public void setDieta(String Dieta){
         AnimalTable=Dieta;
     }
     public void setAlimento(String Alimento){
         FechaTable=Alimento;
     }
     
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBAnimal;
    private javax.swing.JComboBox<String> CBDieta;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInactivar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnReactivar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaFDA;
    private javax.swing.JTextField txtAnimalCodigo;
    private javax.swing.JTextField txtDietaCodigo;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtFechaInicio;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
