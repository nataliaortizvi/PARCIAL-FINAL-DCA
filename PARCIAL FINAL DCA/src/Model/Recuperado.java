package Model;

import processing.core.PApplet;

public class Recuperado extends Persona{
	
	public Recuperado(PApplet app) {
		super(app);
		this.tipo = 3;
		this.nombre = "recuperados:";
		this.pxTexto = 220;
		
		
		this.r = 0;
		this.g = 0;
		this.b = 250;
	}
	
	public void pintar() {
		
		app.fill(this.r, this.g, this.b);
		app.textSize(25);
		app.text(nombre + contador, pxTexto ,40);
		
		app.noStroke();
		app.fill(this.r, this.g, this.b);
		app.ellipse(this.px,this.py,this.tam,this.tam);
			
	}

}
