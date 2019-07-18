package datos;

import javax.swing.ImageIcon;

public class Carton extends Residuos{
	public Carton() {
    	setTipo("Carton");
    	setRecompensa(10);
    	setImagen(new ImageIcon("./src/img/carton.png").getImage());
    }
}
