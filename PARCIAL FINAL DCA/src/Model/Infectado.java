package Model;

import processing.core.PApplet;

public class Infectado extends Persona{
	
	public Infectado(PApplet app) {
		super(app);
		this.tipo = 2;
		this.nombre = "infectados:";
		this.pxTexto = 20;
		
		this.r = 250;
		this.g = 0;
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
