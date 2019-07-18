package GUI;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public abstract class Pantalla {
    
    public static ImageIcon escalar(Image imagen, int ancho, int largo) {
        ImageIcon nuevaImagen = new ImageIcon(imagen.getScaledInstance(ancho,
                largo, Image.SCALE_SMOOTH));
        return nuevaImagen;
    }

    public static ImageIcon escalar(Image imagen, JPanel panel) {
        ImageIcon nuevaImagen = new ImageIcon(imagen.getScaledInstance(panel.getWidth(),
                panel.getHeight(), Image.SCALE_SMOOTH));
        return nuevaImagen;
    }
    
    public static void volverTransparente(JButton boton){
        boton.setOpaque(false);
        boton.setContentAreaFilled(false);
        boton.setBorderPainted(false);
    }

}
