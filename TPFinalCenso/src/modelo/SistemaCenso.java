package modelo;

import java.util.ArrayList;

public class SistemaCenso {
	//Variables
	private ArrayList <Comuna> comunas = new ArrayList<>();
	
	//Metodos
	public ArrayList <Comuna> atencionPrioriCom() {
		ArrayList <Comuna> comunAtencionPriori = new ArrayList<>();
		for (Comuna c : comunas) {
			if (c.AtencionPrioritaria() == true) {
				comunAtencionPriori.add(c);
			}
		}
		return comunAtencionPriori;
	}

}
