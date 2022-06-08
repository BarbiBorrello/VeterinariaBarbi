package CONTROLADOR;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextField;

public class Validaciones_CAMPOS {
    
    public static void SNumero(JTextField a){
        a.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if(Character.isLetter(c)){
                    Toolkit.getDefaultToolkit().beep();
                    e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void keyReleased(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }
    
    public static void SLetras(JTextField a){
        a.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c=e.getKeyChar();
                if(Character.isDigit(c)){
                    Toolkit.getDefaultToolkit().beep();
                    e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void keyReleased(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }
}
