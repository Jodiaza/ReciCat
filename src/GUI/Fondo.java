package GUI;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Fondo extends JPanel{
	   
    int x, y;  
    String direccion="";
    
    public Fondo(JPanel jPanel1, String direccion) {
        this.x = jPanel1.getWidth();
        this.y = jPanel1.getHeight();
        this.setSize(x,y);
        this.direccion = direccion;
    }
	
    @Override
    public void paint(Graphics g) {
        Image imagen = new ImageIcon("./src/img/"+direccion+".png").getImage();
        imagen = Pantalla.escalar(imagen, 370, 620).getImage();
        g.drawImage(imagen, 0, 0,x,y,null);
        setOpaque(false);
        super.paint(g);
    }

}
