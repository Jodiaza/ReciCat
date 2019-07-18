package datos;

import GUI.PantallaDescripcionResiduos;
import GUI.PantallaInicio;
import java.awt.Image;

public abstract class Residuos{

    private String tipo;
    private int recompensa;
    private Image imagen;
    private Thread  t = new Thread();
    
    public static void caer(){
        PantallaInicio.getjLabel1().setVisible(true);
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        for (int i = 0; i < 22; i++) {
            PantallaInicio.getjLabel1().setLocation((int) PantallaInicio.getjLabel1().
                    getLocation().getX(),(int)PantallaInicio.getjLabel1().
                    getLocation().getY()+i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        PantallaInicio.getjLabel1().setVisible(false);
        PantallaInicio.getjLabel1().setLocation((int)PantallaInicio.getjLabel1().
                    getLocation().getX(),(int)PantallaInicio.getjLabel1().
                    getLocation().getY()-200);
        PantallaDescripcionResiduos.setCaida(false);
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    public int getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(int recompensa) {
        this.recompensa = recompensa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Thread getT() {
        return t;
    }

    public void setT(Thread t) {
        this.t = t;
    }

    
}
