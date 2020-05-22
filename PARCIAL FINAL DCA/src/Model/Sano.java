package Model;

import processing.core.PApplet;

public class Sano extends Persona{
	
	public Sano(PApplet app) {
		super(app);
		this.tipo = 1;
		this.nombre = "sanos:";
		this.pxTexto = 420;
		
		this.r = 0;
		this.g = 250;
		this.b = 0;
	}
	
	public void pintar() {
		
		app.fill(this.r, this.g, this.b);
		app.textSize(25);
		app.text(nombre+contador, pxTexto ,40);
		
		app.noStroke();
		app.fill(this.r, this.g, this.b);
		app.ellipse(this.px,this.py,this.tam,this.tam);
			
	}

}
