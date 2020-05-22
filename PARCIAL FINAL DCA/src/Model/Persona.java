package Model;

import processing.core.PApplet;

public abstract class Persona implements Runnable{
	
	int px, py, tam, r, g, b, vel, dir, tipo;
	PApplet app;
	String nombre;
	int pxTexto;
	int contador;
	

	public Persona(PApplet app) {
		this.px = (int) app.random(5, 590);
		this.py = (int) app.random(5, 590);
		
		this.app = app;
		this.tam = 7;
		
		this.vel = 3;
		this.dir = (int) app.random(1,5);
	}
	
	
	public void run() {
			mover();
		
		
	}
	public void pintar() {
		
	}
	
	public void mover() {
		
		if (this.dir == 1) {
            this.px += this.vel;
            this.py += this.vel;
        }

        if (this.dir == 2) {
            this.px -= this.vel;
            this.py -= this.vel;
        }

        if (this.dir == 3) {
            this.px -= this.vel;
            this.py += this.vel;
        }

        if (this.dir == 4) {
            this.px += this.vel;
            this.py -= this.vel;
        }

        if (this.px <= 0 || this.px >= 600 || this.py <= 0 || this.py >= 600) {
            this.vel *= -1;
        }
	

	}
		
	


	public int getPx() {
		return px;
	}


	public int getPy() {
		return py;
	}


	public int getTam() {
		return tam;
	}


	public int getR() {
		return r;
	}


	public int getG() {
		return g;
	}


	public int getB() {
		return b;
	}


	public int getVel() {
		return vel;
	}


	public int getDir() {
		return dir;
	}


	public int getTipo() {
		return tipo;
	}


	public PApplet getApp() {
		return app;
	}


	public void setPx(int px) {
		this.px = px;
	}


	public void setPy(int py) {
		this.py = py;
	}


	public void setTam(int tam) {
		this.tam = tam;
	}


	public void setR(int r) {
		this.r = r;
	}


	public void setG(int g) {
		this.g = g;
	}


	public void setB(int b) {
		this.b = b;
	}


	public void setVel(int vel) {
		this.vel = vel;
	}


	public void setDir(int dir) {
		this.dir = dir;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public void setApp(PApplet app) {
		this.app = app;
	}


	public String getNombre() {
		return nombre;
	}


	public int getPxTexto() {
		return pxTexto;
	}


	public int getContador() {
		return contador;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setPxTexto(int pxTexto) {
		this.pxTexto = pxTexto;
	}


	public void setContador(int contador) {
		this.contador = contador;
	}
}
