package Controller;

import java.util.LinkedList;

import Model.Logic;
import Model.Persona;
import processing.core.PApplet;

public class ControllerC {
	
	Logic logica;
	
	PApplet app;
	
	public ControllerC (PApplet app) {
		this.app = app;
		this.logica = new Logic(app);
	}
	
	public LinkedList<Persona> getPersonitas() {
		return logica.getPersonitas();
	}

}
