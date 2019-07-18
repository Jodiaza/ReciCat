package datos;

import GUI.HojaSprites;
import GUI.Pantalla;
import GUI.PantallaDescripcionResiduos;
import GUI.PantallaInicio;
import java.awt.image.BufferedImage;

public class Gato extends Personaje implements Runnable{
    private static String file=cargarHoja();    
    private static HojaSprites sprites = new HojaSprites(file);
    private boolean movimiento=true;
    private boolean mirar = false;
    private Thread t = new Thread(this);
    
    public Gato(){
    }
    
    public Gato(HojaSprites hoja){
        setSprites(hoja);
    }
    
    @Override
    public void emitirSonido() {

    }

    @Override
    public void run(){
        moverse();
        
    }

    @Override
    public void moverse() {
        if(mirar){
            BufferedImage[] sprite1 = sprites.generarSprites(1);
            for (int i = 0; i < 6; i++) {
                PantallaInicio.getBtnGato().setIcon(Pantalla.escalar(sprite1[i], 210, 158));
                try {
                    Thread.sleep(5);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
            mirar=false;
        }
        if (PantallaDescripcionResiduos.isCaida()) {
            BufferedImage[] sprite1 = sprites.generarSprites(2);
            BufferedImage[] sprite2 = sprites.generarSprites(3);
            
            for (int i = 0; i < 6; i++) {
                PantallaInicio.getBtnGato().setIcon(Pantalla.escalar(sprite1[i], 210, 158));
                try {
                    Thread.sleep(5);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
            Residuos.caer();
            for (int i = 0; i < 5; i++) {
                PantallaInicio.getBtnGato().setIcon(Pantalla.escalar(sprite2[i], 210, 158));
                try {
                    Thread.sleep(5);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
            PantallaDescripcionResiduos.setCaida(false);
        }
        if (getSalud() > 20) {
            cambiarImagen(0);
        } else {
            cambiarImagen(4);
        }
    }

    public void cambiarImagen(int fila) {
        BufferedImage[] sprite = sprites.generarSprites(fila);
        do {
            for (int i = 0; i < 6;i++) {
                PantallaInicio.getBtnGato().setIcon(Pantalla.escalar(sprite[i], 210, 158));
                try {
                    Thread.sleep(30);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
            enfermarse();
        } while (movimiento);
    }

    public static HojaSprites getSprites() {
        return sprites;
    }

    public void setSprites(HojaSprites sprites) {
        Gato.sprites = sprites;
    }

    public Thread getT() {
        return t;
    }

    public void setT(Thread t) {
        this.t = t;
    }

    public boolean isMovimiento() {
        return movimiento;
    }

    public void setMovimiento(boolean movimiento) {
        this.movimiento = movimiento;
    }

    public boolean isMirar() {
        return mirar;
    }

    public void setMirar(boolean mirar) {
        this.mirar = mirar;
    }

    public static String getFile() {
        return file;
    }

    public static void setFile(String file) {
        Gato.file = file;
    }
    
    
}
