import daw.com.Pantalla;
import daw.com.Teclado;

public class Rect {
	private int b;
	private int h;
	private int x;
	private int y;
	private String color;
	
	public Rect() {
		b = 0;
		h = 0;
		x = 0;
		y = 0;
		color = "";
	}
	
	public Rect (int b, int h, int x, int y, String color) {
		this.b = b;
		this.h = h;
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	public Rect (int p[], int bh[], String col[]) {
		this.x = p[0];
		this.y = p[1];
		this.b = bh[0];
		this.h = bh[1];
		this.color = col[0];
	}
	
	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void leerDatos (){
		b = Teclado.leerInt("Base :");
		h = Teclado.leerInt("Altura :");
		x = Teclado.leerInt("Punto central X :");
		y = Teclado.leerInt("Punto central Y :");
		color = Teclado.leerString("Color :");
	}

	public void mostrarDatos (){
		Pantalla.escribirString("Base :" + b);
		Pantalla.escribirString("Altura :" + h);
		Pantalla.escribirString("Punto central :" + x + " " + y);
		Pantalla.escribirString("Color :" + color);
	}
}
