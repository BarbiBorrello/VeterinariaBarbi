package VISTAS2;

import MODELO.Cliente;
import MODELO.Mascota;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Ficha_MASCOTA extends javax.swing.JInternalFrame {

    public Ficha_MASCOTA() {
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
        jPanel1 = new javax.swing.JPanel() {
            String str="/IMAGENES/fondo_MASCOTA.png";
            ImageIcon icon = new ImageIcon(getClass().getResource(str));
            Image image = icon.getImage();

            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0,getWidth(),getHeight(), this);
            }

        };
        jSeparator1 = new javax.swing.JSeparator();
        jlALIAS = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jltexto_alias = new javax.swing.JLabel();
        jlNOMBRE = new javax.swing.JLabel();
        jltexto_Nombre = new javax.swing.JLabel();
        jlCONTACTO_ALTERNATIVO = new javax.swing.JLabel();
        jltexto_Contacto_Alternativo = new javax.swing.JLabel();
        jlAPELLIDO2 = new javax.swing.JLabel();
        jltexto_Apellido2 = new javax.swing.JLabel();
        jltexto_Direccion1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jltexto_Telefono1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlN_DE_CLIENTE1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jltexto_n_paciente1 = new javax.swing.JLabel();
        jltexto_Apellido3 = new javax.swing.JLabel();
        jlCONTACTO_ALTERNATIVO1 = new javax.swing.JLabel();
        jltexto_Apellido4 = new javax.swing.JLabel();
        jlALIAS1 = new javax.swing.JLabel();
        jltexto_alias1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jlAPELLIDO3 = new javax.swing.JLabel();
        jlAPELLIDO4 = new javax.swing.JLabel();
        jlAPELLIDO5 = new javax.swing.JLabel();
        jlAPELLIDO6 = new javax.swing.JLabel();
        jltexto_Telefono2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jSeparator5 = new javax.swing.JSeparator();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel(){
            String str="/IMAGENES/fondo _menu.png";
            ImageIcon icon = new ImageIcon(getClass().getResource(str));
            Image image = icon.getImage();

            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0,getWidth(),getHeight(), this);
            }

        };

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
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 580, 20));

        jlALIAS.setBackground(new java.awt.Color(255, 255, 255));
        jlALIAS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlALIAS.setForeground(new java.awt.Color(255, 255, 255));
        jlALIAS.setText("DUEÑO:");
        jPanel1.add(jlALIAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 112, 580, 10));

        jltexto_alias.setBackground(new java.awt.Color(255, 255, 255));
        jltexto_alias.setForeground(new java.awt.Color(255, 255, 255));
        jltexto_alias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jltexto_alias.setOpaque(true);
        jPanel1.add(jltexto_alias, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 150, 20));

        jlNOMBRE.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlNOMBRE.setForeground(new java.awt.Color(255, 255, 255));
        jlNOMBRE.setText("Raza:");
        jPanel1.add(jlNOMBRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 70, 20));

        jltexto_Nombre.setBackground(new java.awt.Color(255, 255, 255));
        jltexto_Nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jltexto_Nombre.setOpaque(true);
        jPanel1.add(jltexto_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 100, 20));

        jlCONTACTO_ALTERNATIVO.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlCONTACTO_ALTERNATIVO.setForeground(new java.awt.Color(255, 255, 255));
        jlCONTACTO_ALTERNATIVO.setText("F. Nac:");
        jPanel1.add(jlCONTACTO_ALTERNATIVO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 90, 20));

        jltexto_Contacto_Alternativo.setBackground(new java.awt.Color(255, 255, 255));
        jltexto_Contacto_Alternativo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jltexto_Contacto_Alternativo.setOpaque(true);
        jPanel1.add(jltexto_Contacto_Alternativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 30, 20));

        jlAPELLIDO2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlAPELLIDO2.setForeground(new java.awt.Color(255, 255, 255));
        jlAPELLIDO2.setText("Edad :");
        jPanel1.add(jlAPELLIDO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 90, 20));

        jltexto_Apellido2.setBackground(new java.awt.Color(255, 255, 255));
        jltexto_Apellido2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jltexto_Apellido2.setOpaque(true);
        jPanel1.add(jltexto_Apellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 70, 20));

        jltexto_Direccion1.setBackground(new java.awt.Color(255, 255, 255));
        jltexto_Direccion1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jltexto_Direccion1.setOpaque(true);
        jPanel1.add(jltexto_Direccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 60, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 590, 10));

        jltexto_Telefono1.setBackground(new java.awt.Color(255, 255, 255));
        jltexto_Telefono1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jltexto_Telefono1.setOpaque(true);
        jPanel1.add(jltexto_Telefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 30, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 204));
        jLabel1.setText("Ultima visita :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, -1, -1));

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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 590, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/close.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 60, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/add.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 60, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/delete.png"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 60, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/edit.png"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 60, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/search.png"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 60, 50));

        jlN_DE_CLIENTE1.setBackground(new java.awt.Color(255, 255, 255));
        jlN_DE_CLIENTE1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlN_DE_CLIENTE1.setForeground(new java.awt.Color(255, 255, 255));
        jlN_DE_CLIENTE1.setText("N°  de Paciente:");
        jPanel1.add(jlN_DE_CLIENTE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/clear.png"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 60, 50));

        jltexto_n_paciente1.setBackground(new java.awt.Color(255, 255, 255));
        jltexto_n_paciente1.setForeground(new java.awt.Color(255, 255, 255));
        jltexto_n_paciente1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jltexto_n_paciente1.setOpaque(true);
        jPanel1.add(jltexto_n_paciente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 70, 20));

        jltexto_Apellido3.setBackground(new java.awt.Color(255, 255, 255));
        jltexto_Apellido3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jltexto_Apellido3.setOpaque(true);
        jPanel1.add(jltexto_Apellido3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 100, 20));

        jlCONTACTO_ALTERNATIVO1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlCONTACTO_ALTERNATIVO1.setForeground(new java.awt.Color(255, 255, 255));
        jlCONTACTO_ALTERNATIVO1.setText("Sexo:");
        jPanel1.add(jlCONTACTO_ALTERNATIVO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 50, 20));

        jltexto_Apellido4.setBackground(new java.awt.Color(255, 255, 255));
        jltexto_Apellido4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jltexto_Apellido4.setOpaque(true);
        jPanel1.add(jltexto_Apellido4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 60, 20));

        jlALIAS1.setBackground(new java.awt.Color(255, 255, 255));
        jlALIAS1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlALIAS1.setForeground(new java.awt.Color(255, 255, 255));
        jlALIAS1.setText("ALIAS:");
        jPanel1.add(jlALIAS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));

        jltexto_alias1.setBackground(new java.awt.Color(255, 255, 255));
        jltexto_alias1.setForeground(new java.awt.Color(255, 255, 255));
        jltexto_alias1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jltexto_alias1.setOpaque(true);
        jPanel1.add(jltexto_alias1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 100, 20));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 630, 20));

        jlAPELLIDO3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlAPELLIDO3.setForeground(new java.awt.Color(255, 255, 255));
        jlAPELLIDO3.setText("Especie:");
        jPanel1.add(jlAPELLIDO3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 70, 20));

        jlAPELLIDO4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlAPELLIDO4.setForeground(new java.awt.Color(255, 255, 255));
        jlAPELLIDO4.setText("Color pelaje :");
        jPanel1.add(jlAPELLIDO4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 90, 20));

        jlAPELLIDO5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlAPELLIDO5.setForeground(new java.awt.Color(255, 255, 255));
        jlAPELLIDO5.setText("Peso actual :");
        jPanel1.add(jlAPELLIDO5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 90, 20));

        jlAPELLIDO6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlAPELLIDO6.setForeground(new java.awt.Color(255, 255, 255));
        jlAPELLIDO6.setText("Peso Prom  :");
        jPanel1.add(jlAPELLIDO6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 90, 20));

        jltexto_Telefono2.setBackground(new java.awt.Color(255, 255, 255));
        jltexto_Telefono2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jltexto_Telefono2.setOpaque(true);
        jPanel1.add(jltexto_Telefono2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 30, 20));

        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 220, 110));

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Fallecido");
        jRadioButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 80, 20));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 308, 620, -1));

        jRadioButton2.setText("Vacunado");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 80, 20));

        jRadioButton3.setText("Castrado");
        jPanel1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 90, 20));

        jRadioButton4.setText("Desparacitado");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 100, 20));

        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 80, 80));

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

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private Mascota crearUnaMascotaDesdeElForm() {
        Mascota mascota = new Mascota();
        //String alias, String sexo, String especie, String raza, String color_pelaje, LocalDate fecha_nac, double peso_actual, double peso_promedio, boolean activo, Cliente cliente
        mascota.setAlias(jltexto_alias1.getText());
        mascota.setSexo(jltexto_Apellido4.getText());
        mascota.setEspecie(jltexto_Apellido3.getText());
        mascota.setRaza(jltexto_Nombre.getText());
        mascota.setColor_pelaje(jltexto_Apellido2.getText());
        //mascota.setFecha_nac(jltexto_Direccion1.getText());
        mascota.setPeso_actual(Double.parseDouble(jltexto_Contacto_Alternativo.getText()));
        mascota.setPeso_promedio(Double.parseDouble(jltexto_Telefono2.getText()));        
        mascota.setActivo(true);        
        //mascota.setCliente((Cliente) new Cliente());
        
        return mascota;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel jlALIAS;
    private javax.swing.JLabel jlALIAS1;
    private javax.swing.JLabel jlAPELLIDO2;
    private javax.swing.JLabel jlAPELLIDO3;
    private javax.swing.JLabel jlAPELLIDO4;
    private javax.swing.JLabel jlAPELLIDO5;
    private javax.swing.JLabel jlAPELLIDO6;
    private javax.swing.JLabel jlCONTACTO_ALTERNATIVO;
    private javax.swing.JLabel jlCONTACTO_ALTERNATIVO1;
    private javax.swing.JLabel jlNOMBRE;
    private javax.swing.JLabel jlN_DE_CLIENTE1;
    private javax.swing.JLabel jltexto_Apellido2;
    private javax.swing.JLabel jltexto_Apellido3;
    private javax.swing.JLabel jltexto_Apellido4;
    private javax.swing.JLabel jltexto_Contacto_Alternativo;
    private javax.swing.JLabel jltexto_Direccion1;
    private javax.swing.JLabel jltexto_Nombre;
    private javax.swing.JLabel jltexto_Telefono1;
    private javax.swing.JLabel jltexto_Telefono2;
    private javax.swing.JLabel jltexto_alias;
    private javax.swing.JLabel jltexto_alias1;
    private javax.swing.JLabel jltexto_n_paciente1;
    // End of variables declaration//GEN-END:variables
}
