package modelo;

import java.util.ArrayList;

public class Comuna {
	//Variables
	private int numComuna;
	private String sede;
	private String juntaComResp;
	private ArrayList <Barrio> barrios = new ArrayList<>();
	
	//Métodos
	public boolean AtencionPrioritaria() {
		int contador = 0;
		for (Barrio b : barrios) {
			if (b.indiceCriticidad() == true) {
				contador = contador * 1;
			}
		}
		if (contador > barrios.size()) {
			return true;
		}
		else return false;
	}
}
