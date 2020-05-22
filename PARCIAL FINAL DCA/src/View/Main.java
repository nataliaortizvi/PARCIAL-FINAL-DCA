package View;

import Model.Persona;

import java.util.LinkedList;

import Controller.ControllerC;
import processing.core.PApplet;

public class Main extends PApplet {
	
	ControllerC controllerMain;
	
	LinkedList<Persona> lista;

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
					System.out.println("yes");
				}
				
				
				
			}
			
			
			
			
		}
		
		
	}
	
	public void mousePressed() {
		
	}
	
	public void keyPressed() {
		
	
	}

}
