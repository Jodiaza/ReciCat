package datos;

import javax.swing.ImageIcon;

public class Plasticos extends Residuos{
    public Plasticos() {
    	setTipo("Plasticos");
    	setRecompensa(15);
    	setImagen(new ImageIcon("./src/img/plastico.png").getImage());
    }
}
