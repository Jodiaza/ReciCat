package datos;

import javax.swing.ImageIcon;

public class Ordinarios extends Residuos{
    public Ordinarios() {
    	setTipo("Ordinarios");
    	setRecompensa(5);
    	setImagen(new ImageIcon("./src/img/ordinarios.png").getImage());
    }
}
