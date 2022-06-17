
package Extras;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JInternalFrame;


public class jInternalPersonalizado extends JInternalFrame{

    private BufferedImage img;

    public jInternalPersonalizado() {
        try {
            img = ImageIO.read(getClass().getResourceAsStream("/IMAGENES/fondo _menu.png"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    }
}
