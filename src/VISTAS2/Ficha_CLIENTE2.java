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
public class Ficha_CLIENTE2 extends javax.swing.JInternalFrame {

    /**
     * Creates new form Ficha_CLIENTE2
     */
    public Ficha_CLIENTE2() {
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
        jlGUARDAR = new javax.swing.JLabel();
        jlACTUALIZAR = new javax.swing.JLabel();
        jlBORRAR = new javax.swing.JLabel();
        jlLIMPIAR = new javax.swing.JLabel();
        jlSALIR = new javax.swing.JLabel();
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

        jlGUARDAR.setText("GUARDAR");
        jlGUARDAR.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel1.add(jlGUARDAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, 30));

        jlACTUALIZAR.setText("ACTUALIZAR");
        jlACTUALIZAR.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel1.add(jlACTUALIZAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 60, 30));

        jlBORRAR.setText("BORRAR");
        jlBORRAR.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel1.add(jlBORRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 50, 30));

        jlLIMPIAR.setText("LIMPIAR");
        jlLIMPIAR.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel1.add(jlLIMPIAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 50, 30));

        jlSALIR.setText("SALIR");
        jlSALIR.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel1.add(jlSALIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 40, 30));
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

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\PROYECTO FINAL\\IMAGENES\\buscar.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 60, 50));

        jFondo_CLIENTE.setIcon(new javax.swing.ImageIcon("D:\\PROYECTO FINAL\\IMAGENES\\fondo_CLIENTE.png")); // NOI18N
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel jlACTUALIZAR;
    private javax.swing.JLabel jlAPELLIDO2;
    private javax.swing.JLabel jlBORRAR;
    private javax.swing.JLabel jlCONTACTO_ALTERNATIVO;
    private javax.swing.JLabel jlDIRECCION1;
    private javax.swing.JLabel jlDNI;
    private javax.swing.JLabel jlGUARDAR;
    private javax.swing.JLabel jlLIMPIAR;
    private javax.swing.JLabel jlNOMBRE;
    private javax.swing.JLabel jlN_DE_CLIENTE;
    private javax.swing.JLabel jlSALIR;
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
