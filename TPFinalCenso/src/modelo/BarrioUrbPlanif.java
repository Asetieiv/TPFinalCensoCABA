package modelo;

public final class BarrioUrbPlanif extends Barrio {
	//Variables
	private boolean tieneConexionFormal;
	private float numLey;
	
	//Métodos
	public float densidadPoblacional() {
		float densidad = (getPersona().size()/getSuperficie());
		return densidad;
	}
	
	public boolean indiceCriticidad() {
		if (tieneConexionFormal == false) {
			return true;
		}
		else return false;
	}

}
