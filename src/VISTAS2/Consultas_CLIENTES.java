/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTAS2;

/**
 *
 * @author Barbara
 */
public class Consultas_CLIENTES extends javax.swing.JInternalFrame {

    /**
     * Creates new form Ficha_CLIENTE2
     */
    public Consultas_CLIENTES() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jlDNI = new javax.swing.JLabel();
        jltexto_dni = new javax.swing.JLabel();
        jlN_DE_CLIENTE = new javax.swing.JLabel();
        jltexto_n_cliente = new javax.swing.JLabel();
        jlNOMBRE = new javax.swing.JLabel();
        jltexto_Nombre = new javax.swing.JLabel();
        jlCONTACTO_ALTERNATIVO = new javax.swing.JLabel();
        jltexto_Contacto_Alternativo = new javax.swing.JLabel();
        jlAPELLIDO2 = new javax.swing.JLabel();
        jltexto_Apellido2 = new javax.swing.JLabel();
        jlDIRECCION1 = new javax.swing.JLabel();
        jltexto_Direccion1 = new javax.swing.JLabel();
        jlTELEFONO1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jltexto_Telefono1 = new javax.swing.JLabel();
        jrbACTIVO = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jFondo_CLIENTE = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 580, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 580, 10));

        jlDNI.setBackground(new java.awt.Color(255, 255, 255));
        jlDNI.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlDNI.setForeground(new java.awt.Color(255, 255, 255));
        jlDNI.setText("DNI :");
        jPanel1.add(jlDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        jltexto_dni.setBackground(new java.awt.Color(255, 255, 255));
        jltexto_dni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jltexto_dni.setOpaque(true);
        jPanel1.add(jltexto_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 100, 20));

        jlN_DE_CLIENTE.setBackground(new java.awt.Color(255, 255, 255));
        jlN_DE_CLIENTE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlN_DE_CLIENTE.setForeground(new java.awt.Color(255, 255, 255));
        jlN_DE_CLIENTE.setText("N°  de Cliente:");
        jPanel1.add(jlN_DE_CLIENTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jltexto_n_cliente.setBackground(new java.awt.Color(255, 255, 255));
        jltexto_n_cliente.setForeground(new java.awt.Color(255, 255, 255));
        jltexto_n_cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jltexto_n_cliente.setOpaque(true);
        jPanel1.add(jltexto_n_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 70, 20));

        jlNOMBRE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlNOMBRE.setForeground(new java.awt.Color(255, 255, 255));
        jlNOMBRE.setText("Nombre: ");
        jPanel1.add(jlNOMBRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 70, 20));

        jltexto_Nombre.setBackground(new java.awt.Color(255, 255, 255));
        jltexto_Nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jltexto_Nombre.setOpaque(true);
        jPanel1.add(jltexto_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 210, 20));

        jlCONTACTO_ALTERNATIVO.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlCONTACTO_ALTERNATIVO.setForeground(new java.awt.Color(255, 255, 255));
        jlCONTACTO_ALTERNATIVO.setText("Contacto Alternativo: ");
        jPanel1.add(jlCONTACTO_ALTERNATIVO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 160, 20));

        jltexto_Contacto_Alternativo.setBackground(new java.awt.Color(255, 255, 255));
        jltexto_Contacto_Alternativo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jltexto_Contacto_Alternativo.setOpaque(true);
        jPanel1.add(jltexto_Contacto_Alternativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 310, 20));

        jlAPELLIDO2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlAPELLIDO2.setForeground(new java.awt.Color(255, 255, 255));
        jlAPELLIDO2.setText("Apellido: ");
        jPanel1.add(jlAPELLIDO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 70, 20));

        jltexto_Apellido2.setBackground(new java.awt.Color(255, 255, 255));
        jltexto_Apellido2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jltexto_Apellido2.setOpaque(true);
        jPanel1.add(jltexto_Apellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 210, 20));

        jlDIRECCION1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlDIRECCION1.setForeground(new java.awt.Color(255, 255, 255));
        jlDIRECCION1.setText("Direccion:");
        jPanel1.add(jlDIRECCION1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 70, 20));

        jltexto_Direccion1.setBackground(new java.awt.Color(255, 255, 255));
        jltexto_Direccion1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jltexto_Direccion1.setOpaque(true);
        jPanel1.add(jltexto_Direccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 210, 20));

        jlTELEFONO1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlTELEFONO1.setForeground(new java.awt.Color(255, 255, 255));
        jlTELEFONO1.setText("Telefono:");
        jPanel1.add(jlTELEFONO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 70, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 590, 20));

        jltexto_Telefono1.setBackground(new java.awt.Color(255, 255, 255));
        jltexto_Telefono1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jltexto_Telefono1.setOpaque(true);
        jPanel1.add(jltexto_Telefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 210, 20));

        jrbACTIVO.setBackground(new java.awt.Color(255, 255, 255));
        jrbACTIVO.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbACTIVO.setText("Activo");
        jrbACTIVO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jrbACTIVO, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 70, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 204));
        jLabel1.setText("MASCOTAS A SU CARGO :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 350, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/close.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 60, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/add.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 60, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/delete.png"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 60, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/edit.png"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 60, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/search.png"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 60, 50));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 610, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/clear.png"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 60, 50));

        jFondo_CLIENTE.setIcon(new javax.swing.ImageIcon("D:\\PROYECTO FINAL\\IMAGENES\\Consultas_CLIENTES.png")); // NOI18N
        jFondo_CLIENTE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jFondo_CLIENTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 630, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jFondo_CLIENTE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel jlAPELLIDO2;
    private javax.swing.JLabel jlCONTACTO_ALTERNATIVO;
    private javax.swing.JLabel jlDIRECCION1;
    private javax.swing.JLabel jlDNI;
    private javax.swing.JLabel jlNOMBRE;
    private javax.swing.JLabel jlN_DE_CLIENTE;
    private javax.swing.JLabel jlTELEFONO1;
    private javax.swing.JLabel jltexto_Apellido2;
    private javax.swing.JLabel jltexto_Contacto_Alternativo;
    private javax.swing.JLabel jltexto_Direccion1;
    private javax.swing.JLabel jltexto_Nombre;
    private javax.swing.JLabel jltexto_Telefono1;
    private javax.swing.JLabel jltexto_dni;
    private javax.swing.JLabel jltexto_n_cliente;
    private javax.swing.JRadioButton jrbACTIVO;
    // End of variables declaration//GEN-END:variables
}
