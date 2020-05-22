package Model;

import java.util.LinkedList;

import processing.core.PApplet;

public class Logic {
	
	PApplet app;
	
	LinkedList<Persona> personitas;
	
	String[] txt, txtSplit;
	
	int num;
	String tipi;
	
	public Logic(PApplet app) {
		this.app = app;
		
		this.personitas = new LinkedList<Persona>();
		
		txt = app.loadStrings("data/datos.txt");
		
		for(int i = 0; i < txt.length; i++) {
			
			txtSplit = txt[i].split(":");
			
			tipi = txtSplit[0];
			num = Integer.parseInt(txtSplit[1]);
		
	
			
		
		for(int k = 0; k < num; k++) {
			if(tipi.equals("personas infectadas")) {
				personitas.add(new Infectado(app));
				//personitas.get(k).setContador(num);
			}
			
		}
		
		for(int j = 0; j < num; j++) {
			if(tipi.equals("personas sanas")) {
				personitas.add(new Sano(app));
				//personitas.get(j).setContador(num);
			}
		}	
			
		for(int m = 0; m < num; m++) {
			if(tipi.equals("personas recuperadas")) {
				personitas.add(new Recuperado(app));
				//personitas.get(m).setContador(num);
				
				}
			
			}
		
		}
		
	}

	public PApplet getApp() {
		return app;
	}

	public LinkedList<Persona> getPersonitas() {
		return personitas;
	}

	public String[] getTxt() {
		return txt;
	}

	public String[] getTxtSplit() {
		return txtSplit;
	}

	public int getNum() {
		return num;
	}

	public String getTipi() {
		return tipi;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public void setPersonitas(LinkedList<Persona> personitas) {
		this.personitas = personitas;
	}

	public void setTxt(String[] txt) {
		this.txt = txt;
	}

	public void setTxtSplit(String[] txtSplit) {
		this.txtSplit = txtSplit;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setTipi(String tipi) {
		this.tipi = tipi;
	}
	
	
	
	

}
