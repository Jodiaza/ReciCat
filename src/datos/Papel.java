package datos;

import javax.swing.ImageIcon;

public class Papel extends Residuos{
    public Papel() {
    	setTipo("Papel");
    	setRecompensa(10);
    	setImagen(new ImageIcon("./src/img/papel.png").getImage());
    }
}
