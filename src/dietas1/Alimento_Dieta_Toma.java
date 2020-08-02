package dietas1;

import java.awt.Image;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Alimento_Dieta_Toma extends javax.swing.JFrame {
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
    String mostrarMagnitud="";
    private String dieta;
    private String alimento;
    private String toma;
    
    public Alimento_Dieta_Toma() {
        initComponents();
        setLocationRelativeTo(null);
        
        setTitle("DIETAS GANADERAS - Alimento_Dieta_Toma");      
       
        listar();
        
        txtADTDietCod.setEditable(false); 
        txtADTAlimNom.setEditable(false);        
        txtADTTomCant.setEditable(false);        
        txtANEstado.setEditable(false);
        txtADTTomCod.setEditable(false);
        verMagnitudAlimento.setEditable(false);
        
        this.iniciarCBDietCod();
        this.iniciarCBAlimNom();
        this.iniciarCBTomCod();
        
        CBDietCod.setVisible(false);
        CBAlimento.setVisible(false);
        CDToma.setVisible(false);
        cont++;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtADTTomCant = new javax.swing.JTextField();
        txtADTAlimNom = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtANEstado = new javax.swing.JTextField();
        txtADTDietCod = new javax.swing.JTextField();
        CBDietCod = new javax.swing.JComboBox<>();
        CBAlimento = new javax.swing.JComboBox<>();
        txtADTTomCod = new javax.swing.JTextField();
        verMagnitudAlimento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        CDToma = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaADT = new javax.swing.JTable();
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

        jLabel6.setText("Cantidad necesaria:");

        jLabel8.setText("Codigo de la dieta:");

        jLabel12.setText("     Estado:");

        txtANEstado.setText("A");
        txtANEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtANEstadoActionPerformed(evt);
            }
        });

        txtADTDietCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtADTDietCodActionPerformed(evt);
            }
        });

        CBDietCod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NINGUNO" }));
        CBDietCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBDietCodActionPerformed(evt);
            }
        });

        CBAlimento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NINGUNO" }));
        CBAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBAlimentoActionPerformed(evt);
            }
        });

        txtADTTomCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtADTTomCodActionPerformed(evt);
            }
        });

        verMagnitudAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verMagnitudAlimentoActionPerformed(evt);
            }
        });

        jLabel9.setText("Codigo de la toma:");

        CDToma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NINGUNO" }));
        CDToma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CDTomaActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre del alimento:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtADTTomCant, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(verMagnitudAlimento, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtADTTomCod, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(txtADTDietCod))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CBDietCod, 0, 185, Short.MAX_VALUE)
                            .addComponent(CDToma, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtANEstado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtADTAlimNom, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CBAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtADTDietCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtADTAlimNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CBDietCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CBAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtADTTomCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(CDToma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtADTTomCant)
                    .addComponent(verMagnitudAlimento)
                    .addComponent(jLabel12)
                    .addComponent(txtANEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabla"));

        tablaADT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ADTDietCod", "ADTAlimtNom", "ADTTomCod", "ADTTomCant", "ADTEstado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaADT.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tablaADT);

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
        jLabel1.setText("Alimento - Dieta - Toma");

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
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
        CBDietCod.setVisible(false);
        CBAlimento.setVisible(false);
        CDToma.setVisible(false);
        txtADTDietCod.setEditable(false);
        txtADTAlimNom.setEditable(false);
        txtADTTomCant.setEditable(false);
        txtANEstado.setEditable(false);
        txtADTTomCod.setEditable(false);
        verMagnitudAlimento.setEditable(false);
        btnAdicionar.setEnabled(true);
        btnModificar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnReactivar.setEnabled(true);
        btnInactivar.setEnabled(true);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnReactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReactivarActionPerformed
        if(opcion==0){
            int fila=tablaADT.getSelectedRow();
            if(fila>=0){
                CBDietCod.setVisible(false);
                CBAlimento.setVisible(false);
                CDToma.setVisible(false);
                txtADTDietCod.setText(tablaADT.getValueAt(fila,0).toString());
                txtADTAlimNom.setText(tablaADT.getValueAt(fila,1).toString());
                txtADTTomCod.setText(tablaADT.getValueAt(fila,2).toString());
                txtADTTomCant.setText(tablaADT.getValueAt(fila,3).toString());
                txtANEstado.setText(tablaADT.getValueAt(fila,4).toString());
                txtADTDietCod.setEditable(false);
                txtADTAlimNom.setEditable(false);
                txtADTTomCant.setEditable(false);
                txtANEstado.setEditable(false);
                txtADTTomCod.setEditable(false);
                verMagnitudAlimento.setEditable(false);
            }}
            opcion=5;
    }//GEN-LAST:event_btnReactivarActionPerformed

    private void btnInactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInactivarActionPerformed
        if(opcion==0){
            int fila=tablaADT.getSelectedRow();
            if(fila>=0){
                CBDietCod.setVisible(false);
                CBAlimento.setVisible(false);
                CDToma.setVisible(false);

                txtADTDietCod.setText(tablaADT.getValueAt(fila,0).toString());
                txtADTAlimNom.setText(tablaADT.getValueAt(fila,1).toString());
                txtADTTomCod.setText(tablaADT.getValueAt(fila,2).toString());
                txtADTTomCant.setText(tablaADT.getValueAt(fila,3).toString());
                txtANEstado.setText(tablaADT.getValueAt(fila,4).toString());
                txtADTDietCod.setEditable(false);
                txtADTAlimNom.setEditable(false);
                txtADTTomCant.setEditable(false);
                txtANEstado.setEditable(false);
                txtADTTomCod.setEditable(false);
                verMagnitudAlimento.setEditable(false);
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

        CBDietCod.setVisible(false);
        CBAlimento.setVisible(false);
        CDToma.setVisible(false);
        txtADTTomCod.setEditable(false);
        verMagnitudAlimento.setEditable(false);

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(opcion==0){
            int fila=tablaADT.getSelectedRow();
            if(fila>=0){
                CBDietCod.setVisible(false);
                CBAlimento.setVisible(false);
                CDToma.setVisible(false);
                String dieta=tablaADT.getValueAt(fila,0).toString();
                txtADTDietCod.setText(tablaADT.getValueAt(fila,0).toString());
                txtADTAlimNom.setText(tablaADT.getValueAt(fila,1).toString());
                txtADTTomCod.setText(tablaADT.getValueAt(fila,2).toString());
                txtADTTomCant.setText(tablaADT.getValueAt(fila,3).toString());
                txtANEstado.setText(tablaADT.getValueAt(fila,4).toString());

                txtADTDietCod.setEditable(false);
                txtADTAlimNom.setEditable(false);
                txtADTTomCant.setEditable(false);
                txtANEstado.setEditable(false);
                txtADTTomCod.setEditable(false);
                verMagnitudAlimento.setEditable(false);
            }}
            opcion=6;
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if(opcion==0){
            int fila=tablaADT.getSelectedRow();
            if(fila>=0){
                CBDietCod.setVisible(true);
                CBAlimento.setVisible(true);
                CDToma.setVisible(true);

                txtADTDietCod.setText(tablaADT.getValueAt(fila,0).toString());
                txtADTAlimNom.setText(tablaADT.getValueAt(fila,1).toString());
                txtADTTomCod.setText(tablaADT.getValueAt(fila,2).toString());
                txtADTTomCant.setText(tablaADT.getValueAt(fila,3).toString());
                txtANEstado.setText(tablaADT.getValueAt(fila,4).toString());
                setDieta(tablaADT.getValueAt(fila,0).toString());
                setAlimento(tablaADT.getValueAt(fila,1).toString());
                setToma(tablaADT.getValueAt(fila,2).toString());
                txtADTDietCod.setEditable(false);
                txtADTAlimNom.setEditable(false);
                txtADTTomCant.setEditable(true);
                txtANEstado.setEditable(false);
                txtADTTomCod.setEditable(false);
                verMagnitudAlimento.setEditable(false);

                opcion=3;
            }else{
                JOptionPane.showMessageDialog(null,"fila no seleccionada");
            }

        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        if(opcion==0){
            txtADTDietCod.setEditable(false);
            txtADTAlimNom.setEditable(false);
            txtADTTomCod.setEditable(false);
            txtADTTomCant.setEditable(true);
            txtANEstado.setEditable(false);
            CBDietCod.setVisible(true);
            CBAlimento.setVisible(true);
            CDToma.setVisible(true);
            txtADTTomCod.setEditable(false);
            verMagnitudAlimento.setEditable(false);
            txtANEstado.setText("A");
            opcion=1;
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void txtADTTomCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtADTTomCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtADTTomCodActionPerformed

    private void CBAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBAlimentoActionPerformed
        // TODO add your handling code here:
        if(this.cont>0){
            try {
                Statement st=con.createStatement();
                ResultSet result=st.executeQuery("SELECT *FROM d1_alimento WHERE AlimNom='"+CBAlimento.getSelectedItem()+"'");
                result.next();
                Alimento=result.getString("AlimNom");
                mostrarMagnitud = result.getString("AlimMagNut");
                txtADTAlimNom.setText(Alimento);
                verMagnitudAlimento.setText(mostrarMagnitud);
            } catch (SQLException ex) {
                Logger.getLogger(Alimento_Dieta_Toma.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_CBAlimentoActionPerformed

    private void CBDietCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBDietCodActionPerformed
        // TODO add your handling code here:
        if(this.cont>0){
            try {
                Statement st=con.createStatement();
                ResultSet result=st.executeQuery("SELECT *FROM d1_dieta WHERE DietFin='"+CBDietCod.getSelectedItem()+"'");
                result.next();
                Dieta=result.getString("DietCod");
                txtADTDietCod.setText(Dieta);
                
            } catch (SQLException ex) {
                Logger.getLogger(Alimento_Dieta_Toma.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_CBDietCodActionPerformed

    private void txtADTDietCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtADTDietCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtADTDietCodActionPerformed

    private void txtANEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtANEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtANEstadoActionPerformed

    private void CDTomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CDTomaActionPerformed
        // TODO add your handling code here:
        if(this.cont>0){
            try {
                Statement st=con.createStatement();
                ResultSet result=st.executeQuery("SELECT *FROM d1_toma WHERE TomNom='"+CDToma.getSelectedItem()+"'");
                result.next();
                Toma=result.getString("TomCod");
                txtADTTomCod.setText(Toma);
                
            } catch (SQLException ex) {
                Logger.getLogger(Alimento_Dieta_Toma.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_CDTomaActionPerformed

    private void verMagnitudAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verMagnitudAlimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verMagnitudAlimentoActionPerformed
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
        String ADTDietCod = txtADTDietCod.getText();
        String ADTAlimNom = txtADTAlimNom.getText();
        String ADTTomCod  = txtADTTomCod.getText();
        String ANCantNec = txtADTTomCant.getText();   
        String ANEstado = txtANEstado.getText(); 
        
       // if(buscar(ANAnimCod, ANNutNom)==false){
        try{
            if(ADTDietCod.equals("")||ADTTomCod.equals("")||ANCantNec.equals("")||ADTTomCod.equals("")||ANEstado.equals("")){
                JOptionPane.showMessageDialog(null, "Algunos campos estan vacios");
                
                limpiarTabla(modelo);
            }else{
                String sql = "INSERT INTO gz2_alimento_dieta_toma (ADTDietCod, ADTAlimNom, ADTTomCod, ADTTomCant, ADTEstado) VALUES('" + ADTDietCod + "','" + ADTAlimNom + "','" + ADTTomCod + "','" + ANCantNec + "','"+ ANEstado + "')";
                    System.out.println(sql);
                    con = cn.getConnection();                     
                    st = con.createStatement();                     
                    st.executeUpdate(sql);                 
                    
                    JOptionPane.showMessageDialog(null, "Se ha registrado "+ADTDietCod+" con éxito a la tabla ALIMENTO_DIETA_TOMA" );
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
        
        String CodDieta = txtADTDietCod.getText();
        String NomAlim = txtADTAlimNom.getText();
        String CodToma = txtADTTomCod.getText();
        String TomCant=  txtADTTomCant.getText();
        String Estado = txtANEstado.getText();
        
        
        String sql = "UPDATE gz2_alimento_dieta_toma SET ADTDietCod= '"+CodDieta+ "', ADTAlimNom='"+ NomAlim + "', ADTTomCod='"+ CodToma + "', ADTTomCant ='"+ TomCant + "', ADTEstado='"+ Estado +  "' WHERE ADTDietCod='" + dieta+"' AND ADTAlimNom='"+ alimento+"' AND ADTTomCod='"+toma+"'" ; 
        
        System.out.println(sql);
        try{
         if(CodDieta!=null||NomAlim!=null||CodToma!=null||TomCant!=null||Estado!=null){
                           
                con = cn.getConnection();                     
                st = con.createStatement();
                st.executeUpdate(sql);  
                
                JOptionPane.showMessageDialog(null, "Se modificó el registro "+CodDieta+" de la tabla ALIMENTO_DIETA_TOMA ");
                limpiarTabla(modelo);
         }else{
             JOptionPane.showMessageDialog(null, "Error"); 
         }             
               
                
        }catch(Exception e){
                System.out.println("Error ");
            }

    }
    
    void eliminar() {
        
        String CodDieta = txtADTDietCod.getText();
        String AlimNom = txtADTAlimNom.getText();
        String CodToma = txtADTTomCod.getText();
        String CantToma = txtADTTomCant.getText();   
        String Estado = txtANEstado.getText();           
            
            Estado = "*";
        
            String sql = "UPDATE gz2_alimento_dieta_toma SET ADTEstado='"+ Estado + "' WHERE ADTDietCod='" + CodDieta+"' AND ADTAlimNom='"+ AlimNom+"' AND ADTTomCod='"+CodToma+"'" ; 
            
            try{
            if(CodDieta!=null||AlimNom!=null||CantToma!=null||Estado!=null){
                
                con = cn.getConnection();                     
                st = con.createStatement();
                System.out.println(sql);
                st.executeUpdate(sql);
                
                JOptionPane.showMessageDialog(null, "Se elimino el registro "+ CodDieta+" de la tabla ALIMENTO_DIETA_TOMA");
                limpiarTabla(modelo);
            }else{
                JOptionPane.showMessageDialog(null, "Error");
                }
        }catch(Exception e){
                
            }
           
       
         

    }
        void reactivar() {
        String ANAnimCod = txtADTDietCod.getText();
        String ANNutNom = txtADTAlimNom.getText();
        String CodToma = txtADTTomCod.getText();
        String ANCantNec = txtADTTomCant.getText();   
        String ANEstado = txtANEstado.getText();
            
            
            ANEstado = "A";
        
            String sql = "UPDATE gz2_alimento_dieta_toma SET ADTEstado='"+ ANEstado + "' WHERE ADTDietCod='" + ANAnimCod+"' AND ADTAlimNom='"+ ANNutNom+"' AND ADTTomCod='"+CodToma+"'" ; 
            System.out.println(sql);
            try{
            if(ANAnimCod!=null||ANNutNom!=null||CodToma!=null||ANCantNec!=null||ANEstado!=null){
                
                con = cn.getConnection();                     
                st = con.createStatement();
                st.executeUpdate(sql);
                
                JOptionPane.showMessageDialog(null, "Se reactivo el registro "+ANAnimCod+" de la tabla ALIMENTO_DIETA_TOMA");
                limpiarTabla(modelo);
            }else{
                JOptionPane.showMessageDialog(null, "Error");
                }
        }catch(Exception e){
                
            }
    }
    void inactivar() {
        System.out.println("hi1");
        String ANAnimCod = txtADTDietCod.getText();
        String ANNutNom = txtADTAlimNom.getText();
        String CodToma = txtADTTomCod.getText();
        String ANCantNec = txtADTTomCant.getText();   
        String ANEstado = txtANEstado.getText();
            
            
            ANEstado = "I";
        
        
            String sql = "UPDATE gz2_alimento_dieta_toma SET ADTEstado='"+ ANEstado + "' WHERE ADTDietCod='" + ANAnimCod+"' AND ADTAlimNom='"+ ANNutNom+"' AND ADTTomCod='"+CodToma+"'" ; 
            System.out.println("hi2");
            System.out.println(sql);
             try{
            if(ANAnimCod!=null||ANNutNom!=null||CodToma!=null||ANCantNec!=null||ANEstado!=null){
                System.out.println("hi3");
                con = cn.getConnection();                     
                st = con.createStatement();
                st.executeUpdate(sql);
                System.out.println("hi4");
                JOptionPane.showMessageDialog(null, "Se inactivo el registro "+ANAnimCod+" de la tabla ALIMENTO_DIETA_TOMA");
                limpiarTabla(modelo);
            }else{
                JOptionPane.showMessageDialog(null, "Error");
                }
        }catch(Exception e){
                
            }       

    }


void limpiarTabla(DefaultTableModel modelo) {
        for (int i = 0; i <= tablaADT.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }

    }
void vaciar() {
        txtADTDietCod.setText("");
        txtADTAlimNom.setText("");
        txtADTTomCod.setText("");
        txtADTTomCant.setText("");
        txtANEstado.setText("");
        CBDietCod.setSelectedIndex(0);
        CBAlimento.setSelectedIndex(0);
        CDToma.setSelectedIndex(0);
        txtADTTomCod.setText("");
        verMagnitudAlimento.setText("");
        
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
            java.util.logging.Logger.getLogger(Alimento_Dieta_Toma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alimento_Dieta_Toma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alimento_Dieta_Toma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alimento_Dieta_Toma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alimento_Dieta_Toma().setVisible(true);
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
        String sql = "SELECT * FROM gz2_alimento_dieta_toma";
        try{
            con = cn.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            Object[]alimento_dieta_toma= new Object[5];
            
            modelo = (DefaultTableModel)tablaADT.getModel();
          
            while(rs.next()){
                
                
                alimento_dieta_toma[0]= rs.getInt("ADTDietCod");
                alimento_dieta_toma[1]= rs.getString("ADTAlimNom");
                alimento_dieta_toma[2]= rs.getInt("ADTTomCod");
                alimento_dieta_toma[3]= rs.getInt("ADTTomCant");
                alimento_dieta_toma[4]= rs.getString("ADTEstado");
          
                modelo.addRow(alimento_dieta_toma);
               
            }
            tablaADT.setModel(modelo);
          }catch(Exception e){
              
          }
    }
    
    public void iniciarCBDietCod(){
         try {
            Statement st=con.createStatement();
             ResultSet result=st.executeQuery("SELECT *FROM d1_dieta");
             
             while(result.next()){
                 CBDietCod.addItem(result.getString("DietFin"));
            }
             
        } catch (SQLException ex) {
            Logger.getLogger(Alimento_Dieta_Toma.class.getName()).log(Level.SEVERE, null, ex);
        }
           CBDietCod.setVisible(false);
    }
     public void iniciarCBAlimNom(){
            try {
            Statement st=con.createStatement();
             ResultSet result=st.executeQuery("SELECT *FROM d1_Alimento");
             
             while(result.next()){
                 CBAlimento.addItem(result.getString("AlimNom"));
            }
             
        } catch (SQLException ex) {
            Logger.getLogger(Alimento_Dieta_Toma.class.getName()).log(Level.SEVERE, null, ex);
        }
           CBAlimento.setVisible(false);
        }
     public void iniciarCBTomCod(){
         try {
            Statement st=con.createStatement();
             ResultSet result=st.executeQuery("SELECT *FROM d1_toma");
             
             while(result.next()){
                 CDToma.addItem(result.getString("TomNom"));
            }
             
        } catch (SQLException ex) {
            Logger.getLogger(Alimento_Dieta_Toma.class.getName()).log(Level.SEVERE, null, ex);
        }
           CDToma.setVisible(false);
    }
     public void setDieta(String Dieta){
         dieta=Dieta;
     }
     public void setAlimento(String Alimento){
         alimento=Alimento;
     }
     public void setToma(String Toma){
         toma=Toma;
     }
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBAlimento;
    private javax.swing.JComboBox<String> CBDietCod;
    private javax.swing.JComboBox<String> CDToma;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaADT;
    private javax.swing.JTextField txtADTAlimNom;
    private javax.swing.JTextField txtADTDietCod;
    private javax.swing.JTextField txtADTTomCant;
    private javax.swing.JTextField txtADTTomCod;
    private javax.swing.JTextField txtANEstado;
    private javax.swing.JTextField verMagnitudAlimento;
    // End of variables declaration//GEN-END:variables
}
