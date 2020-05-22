package View;

import Model.Persona;
import MyExceptions.MiException;

import java.util.LinkedList;

import Controller.ControllerC;
import processing.core.PApplet;

public class Main extends PApplet {
	
	ControllerC controllerMain;
	
	LinkedList<Persona> lista;
	
	boolean contagiado = false;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("View.Main");

	}
	
	public void settings() {
		size(600,600);
		
		
	}
	
	public void setup() {
		controllerMain = new ControllerC(this);
		lista = controllerMain.getPersonitas();
		
	}
	
	public void draw() {
		background(0);
		
		for(int i = 0; i < lista.size(); i++) {
			lista.get(i).pintar();
			new Thread (lista.get(i)).start();
			
			for(int j = 0; j < lista.size(); j++) {
				
				if(dist(lista.get(i).getPx(),lista.get(i).getPy(),
						lista.get(j).getPx(), lista.get(j).getPy())<14) {
					
					if(lista.get(i).getTipo() == 1 && lista.get(j).getTipo() == 2) {
						
						contagiado = true;
						
						lista.get(i).setR(255);
						lista.get(i).setG(0);
						lista.get(i).setB(0);
					
						
					}
					
					//System.out.println("yes");
				}
				
			}
			
		}
		
		try {
			
			MiExcepcion(contagiado);
			
		} catch (MiException e) {
			// TODO: handle exception
			System.out.println("infectado");
		}
		
	}
	
	public void MiExcepcion (boolean a) throws MiException{
		controllerMain.hayInfectado(a);
		
	}
	
	
	public void keyPressed() {
		controllerMain.teclas(key);
	
	}

}
