package GUI;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class HojaSprites {
	
	private int ancho=1400;
	private int alto=1050;
	private int columnas=6;
	private int filas=5;
	
	private BufferedImage hojaSprites;
	private File direccion;
	
	public HojaSprites(String direccion) {
		this.direccion= new File("./src/img/"+direccion+".png");
		try {
			this.hojaSprites = ImageIO.read(this.direccion);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public BufferedImage[] generarSprites(int fila) {
		BufferedImage[] sprites = new BufferedImage[filas*columnas];
		for (int j = 0; j < columnas; j++){
			sprites[j] = hojaSprites.getSubimage(j * ancho, fila * alto,
					ancho,alto);
		}
		return sprites;
	}
}
