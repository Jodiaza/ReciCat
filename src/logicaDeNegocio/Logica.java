package logicaDeNegocio;
import GUI.HojaSprites;
import GUI.PantallaInicio;
import datos.Gato;
import datos.Personaje;
import java.io.Serializable;

public class Logica implements Serializable{

    public static void main(String[] args) {
        try{
            HojaSprites hoja = new HojaSprites(Personaje.cargarHoja());
            Gato gato = new Gato(hoja);
            PantallaInicio inicio = new PantallaInicio(true, gato);
            inicio.getT().start();
        }catch(Exception e){
            e.printStackTrace();
        }

    }

}
