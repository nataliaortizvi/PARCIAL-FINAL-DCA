package Model;

import java.util.Comparator;

public class PersonaColor implements Comparator<Persona>{

	@Override
	public int compare(Persona o1, Persona o2) {
		// TODO Auto-generated method stub
		return o1.getR()-(o2.getR());
	}

}
