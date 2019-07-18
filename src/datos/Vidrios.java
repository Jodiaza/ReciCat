package datos;

import javax.swing.ImageIcon;

public class Vidrios extends Residuos{
    public Vidrios() {
    	setTipo("Vidrios");
    	setRecompensa(50);
    	setImagen(new ImageIcon("./src/img/vidrio.png").getImage());
    }
}
