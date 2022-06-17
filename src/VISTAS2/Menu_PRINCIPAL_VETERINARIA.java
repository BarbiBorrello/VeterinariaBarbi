/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTAS2;

import CONTROLADOR.ClienteData;
import CONTROLADOR.Conexion;
import CONTROLADOR.MascotaData;
import CONTROLADOR.TratamientoData;
import CONTROLADOR.Validaciones_CAMPOS;
import CONTROLADOR.VisitaData;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Barbara
 */
public class Menu_PRINCIPAL_VETERINARIA extends javax.swing.JFrame {
    
    Conexion conexion = null;
    public static ClienteData cd;
    public static MascotaData md;
    public static TratamientoData td;
    public static VisitaData vd;
    public static Validaciones_CAMPOS vcampos= new Validaciones_CAMPOS();
    
    

    /**
     * Creates new form Menu_VETE2
     */
    public Menu_PRINCIPAL_VETERINARIA() {

        try {
            this.conexion = new Conexion();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu_PRINCIPAL_VETERINARIA.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.cd = new ClienteData(conexion);
        this.md = new MascotaData(conexion);
        this.td = new TratamientoData(conexion);
        this.vd = new VisitaData(conexion);
         
        initComponents();
        setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane(){
            String str="/IMAGENES/fondo _menu.png";
            ImageIcon icon = new ImageIcon(getClass().getResource(str));
            Image image = icon.getImage();

            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0,getWidth(),getHeight(), this);
            }
        };
        jMenuPrincipal = new javax.swing.JMenuBar();
        jM_CLIENTES = new javax.swing.JMenu();
        jM_FICHA_CLIENTE = new javax.swing.JMenuItem();
        jM_MASCOTAS = new javax.swing.JMenu();
        jM_FICHA_MASCOTA = new javax.swing.JMenuItem();
        jM_TRATAMIENTOS = new javax.swing.JMenu();
        jM_FICHA_TRATAMIENTOS = new javax.swing.JMenuItem();
        jM_VISITAS = new javax.swing.JMenu();
        jM_FICHA_VISITAS = new javax.swing.JMenuItem();
        jConsultas = new javax.swing.JMenu();
        jMConsultasCLIENTES = new javax.swing.JMenuItem();
        jMConsultasMASCOTAS = new javax.swing.JMenuItem();
        jMConsultasTRATAMIENTOS = new javax.swing.JMenuItem();
        jMConsultasVISITAS = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(102, 0, 255));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 638, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );

        jM_CLIENTES.setText("Clientes");
        jM_CLIENTES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_CLIENTESActionPerformed(evt);
            }
        });

        jM_FICHA_CLIENTE.setText("Ficha CLIENTE");
        jM_FICHA_CLIENTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_FICHA_CLIENTEActionPerformed(evt);
            }
        });
        jM_CLIENTES.add(jM_FICHA_CLIENTE);

        jMenuPrincipal.add(jM_CLIENTES);

        jM_MASCOTAS.setText("Mascotas");
        jM_MASCOTAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_MASCOTASActionPerformed(evt);
            }
        });

        jM_FICHA_MASCOTA.setText("Ficha MASCOTA");
        jM_FICHA_MASCOTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_FICHA_MASCOTAActionPerformed(evt);
            }
        });
        jM_MASCOTAS.add(jM_FICHA_MASCOTA);

        jMenuPrincipal.add(jM_MASCOTAS);

        jM_TRATAMIENTOS.setText("Tratamientos");

        jM_FICHA_TRATAMIENTOS.setText("Ficha TRATAMIENTO");
        jM_FICHA_TRATAMIENTOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_FICHA_TRATAMIENTOSActionPerformed(evt);
            }
        });
        jM_TRATAMIENTOS.add(jM_FICHA_TRATAMIENTOS);

        jMenuPrincipal.add(jM_TRATAMIENTOS);

        jM_VISITAS.setText("Visitas");

        jM_FICHA_VISITAS.setText("Ficha VISITAS");
        jM_FICHA_VISITAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_FICHA_VISITASActionPerformed(evt);
            }
        });
        jM_VISITAS.add(jM_FICHA_VISITAS);

        jMenuPrincipal.add(jM_VISITAS);

        jConsultas.setText("Consultas");

        jMConsultasCLIENTES.setText("Consultas de Clientes");
        jMConsultasCLIENTES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMConsultasCLIENTESActionPerformed(evt);
            }
        });
        jConsultas.add(jMConsultasCLIENTES);

        jMConsultasMASCOTAS.setText("Consulta de Mascotas");
        jMConsultasMASCOTAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMConsultasMASCOTASActionPerformed(evt);
            }
        });
        jConsultas.add(jMConsultasMASCOTAS);

        jMConsultasTRATAMIENTOS.setText("Consulta de Tratamientos");
        jMConsultasTRATAMIENTOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMConsultasTRATAMIENTOSActionPerformed(evt);
            }
        });
        jConsultas.add(jMConsultasTRATAMIENTOS);

        jMConsultasVISITAS.setText("Consulta de Visitas");
        jMConsultasVISITAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMConsultasVISITASActionPerformed(evt);
            }
        });
        jConsultas.add(jMConsultasVISITAS);

        jMenuPrincipal.add(jConsultas);

        setJMenuBar(jMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jM_FICHA_CLIENTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_FICHA_CLIENTEActionPerformed
        // TODO add your handling code here:
        
        escritorio.removeAll();
        Ficha_CLIENTE agregar;
        agregar = new Ficha_CLIENTE();
        agregar.setVisible(true);
        escritorio.add(agregar);
        escritorio.repaint();
        escritorio.moveToFront(agregar);
    }//GEN-LAST:event_jM_FICHA_CLIENTEActionPerformed

    private void jMConsultasMASCOTASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMConsultasMASCOTASActionPerformed
        // TODO add your handling code here:
        
        escritorio.removeAll();
        Consultas_MASCOTAS agregar;
        agregar = new Consultas_MASCOTAS();
        agregar.setVisible(true);
        escritorio.add(agregar);
        escritorio.repaint();
        escritorio.moveToFront(agregar);
        
        
    }//GEN-LAST:event_jMConsultasMASCOTASActionPerformed

    private void jM_FICHA_MASCOTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_FICHA_MASCOTAActionPerformed
        // TODO add your handling code here:
        
        escritorio.removeAll();
        Ficha_MASCOTA agregar ;
        agregar = new Ficha_MASCOTA();
        agregar.setVisible(true);
        escritorio.add(agregar);
        escritorio.repaint();
        escritorio.moveToFront(agregar);
    }//GEN-LAST:event_jM_FICHA_MASCOTAActionPerformed

    private void jM_CLIENTESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_CLIENTESActionPerformed
        // TODO add your handling code here:
        
        escritorio.removeAll();
 
    }//GEN-LAST:event_jM_CLIENTESActionPerformed

    private void jM_MASCOTASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_MASCOTASActionPerformed
        // TODO add your handling code here:
        
        escritorio.removeAll();
    }//GEN-LAST:event_jM_MASCOTASActionPerformed

    private void jM_FICHA_TRATAMIENTOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_FICHA_TRATAMIENTOSActionPerformed
        // TODO add your handling code here:
        
        escritorio.removeAll();
        Ficha_TRATAMIENTOS agregar ;
        agregar = new Ficha_TRATAMIENTOS();
        agregar.setVisible(true);
        escritorio.add(agregar);
        escritorio.repaint();
        escritorio.moveToFront(agregar);              
        
    }//GEN-LAST:event_jM_FICHA_TRATAMIENTOSActionPerformed

    private void jM_FICHA_VISITASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_FICHA_VISITASActionPerformed
        // TODO add your handling code here:
        
        escritorio.removeAll();
        Ficha_VISITAS agregar;
        agregar = new Ficha_VISITAS();
        agregar.setVisible(true);
        escritorio.add(agregar);
        escritorio.repaint();
        escritorio.moveToFront(agregar);
        
        
        
    }//GEN-LAST:event_jM_FICHA_VISITASActionPerformed

    private void jMConsultasCLIENTESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMConsultasCLIENTESActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        Consultas_CLIENTES agregar;
        agregar = new Consultas_CLIENTES();
        agregar.setVisible(true);
        escritorio.add(agregar);
        escritorio.repaint();
        escritorio.moveToFront(agregar);
       
    }//GEN-LAST:event_jMConsultasCLIENTESActionPerformed

    private void jMConsultasTRATAMIENTOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMConsultasTRATAMIENTOSActionPerformed
        // TODO add your handling code here:
        
        escritorio.removeAll();
        Consultas_TRATAMIENTOS agregar;
        agregar = new Consultas_TRATAMIENTOS();
        agregar.setVisible(true);
        escritorio.add(agregar);
        escritorio.repaint();
        escritorio.moveToFront(agregar);
      
        
       
    }//GEN-LAST:event_jMConsultasTRATAMIENTOSActionPerformed

    private void jMConsultasVISITASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMConsultasVISITASActionPerformed
        // TODO add your handling code here:
        
        escritorio.removeAll();
        Consultas_VISITAS agregar;
        agregar = new Consultas_VISITAS();
        agregar.setVisible(true);
        escritorio.add(agregar);
        escritorio.repaint();
        escritorio.moveToFront(agregar);
        
    }//GEN-LAST:event_jMConsultasVISITASActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Menu_PRINCIPAL_VETERINARIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_PRINCIPAL_VETERINARIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_PRINCIPAL_VETERINARIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_PRINCIPAL_VETERINARIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_PRINCIPAL_VETERINARIA().setVisible(true);
            }
        });
    }
    
    
    // METODOS LLAMAR A UNA VISTA DESDE OTRAS VISTAS //
    
    
    public static void mostrarFichaCliente() {
        Ficha_CLIENTE agregar;
        agregar = new Ficha_CLIENTE();
        agregar.setVisible(true);
        escritorio.add(agregar);
        escritorio.repaint();
        escritorio.moveToFront(agregar);
    }
    
    
        public static void mostrarFichaMascota() {
        Ficha_MASCOTA agregar;
        agregar = new Ficha_MASCOTA();
        agregar.setVisible(true);
        escritorio.add(agregar);
        escritorio.repaint();
        escritorio.moveToFront(agregar);
    }
        
        public static void mostrarFichaTratamientos() {
        Ficha_TRATAMIENTOS agregar;
        agregar = new Ficha_TRATAMIENTOS();
        agregar.setVisible(true);
        escritorio.add(agregar);
        escritorio.repaint();
        escritorio.moveToFront(agregar);
    }
        
        public static void mostrarFichaVisitas() {
        Ficha_VISITAS agregar;
        agregar = new Ficha_VISITAS();
        agregar.setVisible(true);
        escritorio.add(agregar);
        escritorio.repaint();
        escritorio.moveToFront(agregar);
    }
        
        
        public static void mostrarConsultasClientes() {
        Consultas_CLIENTES agregar;
        agregar = new Consultas_CLIENTES();
        agregar.setVisible(true);
        escritorio.add(agregar);
        escritorio.repaint();
        escritorio.moveToFront(agregar);
    }
        
        public static void mostrarConsultasMascotas() {
        Consultas_MASCOTAS agregar;
        agregar = new Consultas_MASCOTAS();
        agregar.setVisible(true);
        escritorio.add(agregar);
        escritorio.repaint();
        escritorio.moveToFront(agregar);
    }
        
        public static void mostrarConsultasTratamientos() {
        Consultas_TRATAMIENTOS agregar;
        agregar = new Consultas_TRATAMIENTOS();
        agregar.setVisible(true);
        escritorio.add(agregar);
        escritorio.repaint();
        escritorio.moveToFront(agregar);
    }
        
        public static void mostrarConsultasVisitas() {
        Consultas_VISITAS agregar;
        agregar = new Consultas_VISITAS();
        agregar.setVisible(true);
        escritorio.add(agregar);
        escritorio.repaint();
        escritorio.moveToFront(agregar);
    }
//------------------------------------------------------------------------------------------------------------------
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jConsultas;
    private javax.swing.JMenuItem jMConsultasCLIENTES;
    private javax.swing.JMenuItem jMConsultasMASCOTAS;
    private javax.swing.JMenuItem jMConsultasTRATAMIENTOS;
    private javax.swing.JMenuItem jMConsultasVISITAS;
    private javax.swing.JMenu jM_CLIENTES;
    private javax.swing.JMenuItem jM_FICHA_CLIENTE;
    private javax.swing.JMenuItem jM_FICHA_MASCOTA;
    private javax.swing.JMenuItem jM_FICHA_TRATAMIENTOS;
    private javax.swing.JMenuItem jM_FICHA_VISITAS;
    private javax.swing.JMenu jM_MASCOTAS;
    private javax.swing.JMenu jM_TRATAMIENTOS;
    private javax.swing.JMenu jM_VISITAS;
    private javax.swing.JMenuBar jMenuPrincipal;
    // End of variables declaration//GEN-END:variables
}

