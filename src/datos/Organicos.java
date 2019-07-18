package datos;

import javax.swing.ImageIcon;

public class Organicos extends Residuos {

    public Organicos() {
        setTipo("Organicos");
        setRecompensa(20);
        setImagen(new ImageIcon("./src/img/organico.png").getImage());
    }
}
