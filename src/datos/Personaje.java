package datos;
import GUI.PantallaInicio;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public abstract class Personaje implements Serializable,Sonido {

    private String nombre;
    private ArrayList<Articulo> articulos;
    private int salud = cargarSalud();
    private int dinero = cargarDinero();
    
    public void comer(Residuos residuo) {
            if (salud + residuo.getRecompensa() > 100) {
                salud = 100;
                PantallaInicio.getjProgressBar2().setValue(salud);
                Personaje.guardarSalud(salud);
            } else {
                salud = salud + residuo.getRecompensa();
                PantallaInicio.getjProgressBar2().setValue(salud);
                Personaje.guardarSalud(salud);
            }
            dinero = dinero + (residuo.getRecompensa()*10 - 7);
            PantallaInicio.getTxtDinero().setText(Integer.toString(dinero));
            Personaje.guardarDinero(dinero);
    }

    public void enfermarse() {
        if (salud > 0) {
            salud = salud - 1;
            PantallaInicio.getjProgressBar2().setValue(salud);
            Personaje.guardarSalud(salud);
        }
    }
    public static void guardarSalud(int i){
        guardar(i,"salud");
    }
    
    public static void guardarDinero(int i){
        guardar(i,"dinero");
    }
    
    public static void guardarHoja(String hoja){
        try {
            FileOutputStream salida = new FileOutputStream("./src/flujos/hoja.obj");
            ObjectOutputStream objeto = new ObjectOutputStream(salida);
            objeto.writeObject(hoja);
            objeto.close();
        } catch (Exception exception) {
            System.out.println("ERROR :(");
        }
    }
    
    private static void guardar(int i,String file) {
        try {
            FileOutputStream salida = new FileOutputStream("./src/flujos/"+file+".obj");
            ObjectOutputStream objeto = new ObjectOutputStream(salida);
            objeto.writeObject(i);
            objeto.close();
        } catch (Exception exception) {
            System.out.println("ERROR :(");
        }
    }
    
    public static int cargarSalud(){
         return cargar("salud");
    }
    
    public static int cargarDinero(){
        return cargar("dinero");
    }
    
    public static String cargarHoja(){
        try {
            FileInputStream entrada = new FileInputStream("./src/flujos/hoja.obj");
            ObjectInputStream objeto = new ObjectInputStream(entrada);
            try {
                String hoja = (String) objeto.readObject();
                objeto.close();
                return hoja;
            } catch (IOException | ClassNotFoundException exception) {
                System.out.println(exception);
                return null;
            }
        } catch (IOException exception) {
            System.out.println(exception);
            return null;
        }
    }

    private static int cargar(String file) {
        try {
            FileInputStream entrada = new FileInputStream("./src/flujos/"+file+".obj");
            ObjectInputStream objeto = new ObjectInputStream(entrada);
            try {
                int i = (Integer) objeto.readObject();
                objeto.close();
                return i;
            } catch (Exception exception) {
                System.out.println(exception);
                return 0;
            }
        } catch (Exception exception) {
            System.out.println(exception);
            return 0;
        }
    }
    
    public void moverse(){}

    @Override
    public void emitirSonido() {

    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
    
    
    
}
