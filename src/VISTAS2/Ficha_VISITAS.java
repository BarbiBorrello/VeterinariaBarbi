/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTAS2;

import MODELO.Cliente;
import MODELO.Mascota;
import MODELO.Tratamiento;
import static VISTAS2.Menu_PRINCIPAL_VETERINARIA.escritorio;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Barbara
 */
public class Ficha_VISITAS extends javax.swing.JInternalFrame {

    /**
     * Creates new form Ficha_CLIENTE2
     */
    public Ficha_VISITAS() {
        initComponents();

        Tratamientos_Visita(); // inicializa con listado de tratamientos activos
        fechaVisita();         // inicializa con le fecha de hoy  

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
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jlFecha_V = new javax.swing.JLabel();
        jlN_DE_CLIENTE = new javax.swing.JLabel();
        jltexto_peso_V = new javax.swing.JLabel();
        jlPrecio_V = new javax.swing.JLabel();
        jlprecio_V = new javax.swing.JLabel();
        jlMascota_V = new javax.swing.JLabel();
        jlDuenio = new javax.swing.JLabel();
        jlDiagnostico = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jltexto_id_visita = new javax.swing.JLabel();
        jrbACTIVO = new javax.swing.JRadioButton();
        jlUtima_Visita = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtableUltima_Visita = new javax.swing.JTable();
        jlSALIR = new javax.swing.JLabel();
        jbuscarClienteV = new javax.swing.JLabel();
        jLIMPIAR = new javax.swing.JLabel();
        jlTratamiento_V = new javax.swing.JLabel();
        jcMascotaV = new javax.swing.JComboBox<>();
        jtDNI_duenio_V = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jlDETALLES_diagnostico = new javax.swing.JLabel();
        jlPeso_V = new javax.swing.JLabel();
        jcbTratamientos_V = new javax.swing.JComboBox<>();
        jdcFechaV = new com.toedter.calendar.JDateChooser();
        jFondo_CLIENTE = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();

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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 630, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 610, 10));

        jlFecha_V.setBackground(new java.awt.Color(255, 255, 255));
        jlFecha_V.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlFecha_V.setForeground(new java.awt.Color(255, 255, 255));
        jlFecha_V.setText("Fecha :");
        jPanel1.add(jlFecha_V, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jlN_DE_CLIENTE.setBackground(new java.awt.Color(255, 255, 255));
        jlN_DE_CLIENTE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlN_DE_CLIENTE.setForeground(new java.awt.Color(255, 255, 255));
        jlN_DE_CLIENTE.setText("Visita N° :");
        jPanel1.add(jlN_DE_CLIENTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jltexto_peso_V.setBackground(new java.awt.Color(255, 255, 255));
        jltexto_peso_V.setForeground(new java.awt.Color(255, 255, 255));
        jltexto_peso_V.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jltexto_peso_V.setOpaque(true);
        jPanel1.add(jltexto_peso_V, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 70, 20));

        jlPrecio_V.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlPrecio_V.setForeground(new java.awt.Color(255, 255, 255));
        jlPrecio_V.setText("Valor de la consulta : ");
        jPanel1.add(jlPrecio_V, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 220, 20));

        jlprecio_V.setBackground(new java.awt.Color(255, 255, 255));
        jlprecio_V.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jlprecio_V.setOpaque(true);
        jPanel1.add(jlprecio_V, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 80, 20));

        jlMascota_V.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlMascota_V.setForeground(new java.awt.Color(255, 255, 255));
        jlMascota_V.setText("Mascota :");
        jPanel1.add(jlMascota_V, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 90, 20));

        jlDuenio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlDuenio.setForeground(new java.awt.Color(255, 255, 255));
        jlDuenio.setText("Dueño:");
        jPanel1.add(jlDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 70, 20));

        jlDiagnostico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlDiagnostico.setForeground(new java.awt.Color(255, 255, 255));
        jlDiagnostico.setText("Sintomas:");
        jPanel1.add(jlDiagnostico, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 70, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 590, 10));

        jltexto_id_visita.setBackground(new java.awt.Color(255, 255, 255));
        jltexto_id_visita.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jltexto_id_visita.setEnabled(false);
        jltexto_id_visita.setOpaque(true);
        jPanel1.add(jltexto_id_visita, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 60, 20));

        jrbACTIVO.setBackground(new java.awt.Color(255, 255, 255));
        jrbACTIVO.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbACTIVO.setText("Activa");
        jrbACTIVO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jrbACTIVO, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 70, 20));

        jlUtima_Visita.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlUtima_Visita.setForeground(new java.awt.Color(51, 0, 204));
        jlUtima_Visita.setText("ULTIMA VISITA");
        jPanel1.add(jlUtima_Visita, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, -1, -1));

        jtableUltima_Visita.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jtableUltima_Visita);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 560, 50));

        jlSALIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/close.png"))); // NOI18N
        jlSALIR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jlSALIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, 60, 50));

        jbuscarClienteV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/search.png"))); // NOI18N
        jbuscarClienteV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbuscarClienteV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbuscarClienteVMouseClicked(evt);
            }
        });
        jPanel1.add(jbuscarClienteV, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 60, 50));

        jLIMPIAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/clear.png"))); // NOI18N
        jLIMPIAR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLIMPIAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 60, 50));

        jlTratamiento_V.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlTratamiento_V.setForeground(new java.awt.Color(255, 255, 255));
        jlTratamiento_V.setText("Tratamiento :");
        jPanel1.add(jlTratamiento_V, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 140, 20));

        jcMascotaV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jcMascotaV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcMascotaVActionPerformed(evt);
            }
        });
        jPanel1.add(jcMascotaV, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 190, -1));
        jPanel1.add(jtDNI_duenio_V, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 160, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 570, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 570, 10));

        jlDETALLES_diagnostico.setBackground(new java.awt.Color(255, 255, 255));
        jlDETALLES_diagnostico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jlDETALLES_diagnostico.setOpaque(true);
        jPanel1.add(jlDETALLES_diagnostico, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 300, 40));

        jlPeso_V.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlPeso_V.setForeground(new java.awt.Color(255, 255, 255));
        jlPeso_V.setText("Peso:");
        jPanel1.add(jlPeso_V, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 70, 20));

        jcbTratamientos_V.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jcbTratamientos_V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTratamientos_VActionPerformed(evt);
            }
        });
        jPanel1.add(jcbTratamientos_V, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 220, -1));
        jPanel1.add(jdcFechaV, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 140, -1));

        jFondo_CLIENTE.setBackground(new java.awt.Color(255, 255, 255));
        jFondo_CLIENTE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/fondo_VISITAS.png"))); // NOI18N
        jFondo_CLIENTE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jFondo_CLIENTE.setOpaque(true);
        jPanel1.add(jFondo_CLIENTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 630, -1));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList1);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 190, -1));

        jLabel1.setText("GUARDAR ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, -1, -1));

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

    private void jcMascotaVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcMascotaVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcMascotaVActionPerformed

    private void jbuscarClienteVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbuscarClienteVMouseClicked

        // con el DNI del cliente busco al cliente //
        Cliente c = Menu_PRINCIPAL_VETERINARIA.cd.buscarClientexDNI(Long.parseLong(jtDNI_duenio_V.getText()));

//  opcion de cargar un nuevo cliente//
        if (c == null) {
            // si el dni no existe //   

            String[] options = {"Si", "No"};

            int x = JOptionPane.showOptionDialog(null, "¿Desea agregar un nuevo cliente?",
                    "Selecciona una opcion",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            //si //
            if (x == 0) {

                escritorio.removeAll();
                Menu_PRINCIPAL_VETERINARIA.mostrarFichaCliente();

// lleva el usuario a la ficha del cliente para que lo agregue a la base de datos //
// si elige "NO"  se limpia para nueva carga de visita //
            } else {
                jtDNI_duenio_V.setText("");
            }

        } // si el cliente existe , verificar que tenga mascota activa //
        else {
            // Lista a todas la mascotas de ese cliente //
            List<Mascota> m = Menu_PRINCIPAL_VETERINARIA.md.buscarMascotas_x_Cliente(c);

            jcMascotaV.removeAllItems(); //borra datos anteriores //

            for (Mascota m1 : m) {

                jcMascotaV.addItem(m1);
            }

        }


    }//GEN-LAST:event_jbuscarClienteVMouseClicked

    private void jcbTratamientos_VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTratamientos_VActionPerformed
        // TODO add your handling code here:
        jlprecio_V.setText(Double.toString(((Tratamiento) jcbTratamientos_V.getSelectedItem()).getPrecio()));
        
        
    }//GEN-LAST:event_jcbTratamientos_VActionPerformed
    // metodo: trae todos los tratmientos activos //

    public void Tratamientos_Visita() {

        List<Tratamiento> t = Menu_PRINCIPAL_VETERINARIA.td.obtenerTratamientos();

        for (Tratamiento t1 : t) {

            jcbTratamientos_V.addItem(t1);

        }
    }

    // metodo: fecha de la visita: HOY //
    public void fechaVisita() {
        LocalDate localDate = LocalDate.now();
        Date date = java.sql.Date.valueOf(localDate);
        jdcFechaV.setDate(date);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jFondo_CLIENTE;
    private javax.swing.JLabel jLIMPIAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jbuscarClienteV;
    private javax.swing.JComboBox<Mascota> jcMascotaV;
    private javax.swing.JComboBox<Tratamiento> jcbTratamientos_V;
    private com.toedter.calendar.JDateChooser jdcFechaV;
    private javax.swing.JLabel jlDETALLES_diagnostico;
    private javax.swing.JLabel jlDiagnostico;
    private javax.swing.JLabel jlDuenio;
    private javax.swing.JLabel jlFecha_V;
    private javax.swing.JLabel jlMascota_V;
    private javax.swing.JLabel jlN_DE_CLIENTE;
    private javax.swing.JLabel jlPeso_V;
    private javax.swing.JLabel jlPrecio_V;
    private javax.swing.JLabel jlSALIR;
    private javax.swing.JLabel jlTratamiento_V;
    private javax.swing.JLabel jlUtima_Visita;
    private javax.swing.JLabel jlprecio_V;
    private javax.swing.JLabel jltexto_id_visita;
    private javax.swing.JLabel jltexto_peso_V;
    private javax.swing.JRadioButton jrbACTIVO;
    private javax.swing.JTextField jtDNI_duenio_V;
    private javax.swing.JTable jtableUltima_Visita;
    // End of variables declaration//GEN-END:variables
}
