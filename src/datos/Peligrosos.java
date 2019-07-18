package datos;

import javax.swing.ImageIcon;

public class Peligrosos extends Residuos{
	public Peligrosos() {
		setTipo("Peligrosos");
		setRecompensa(50);
		setImagen(new ImageIcon("./src/img/peligroso.png").getImage());
	}
}
