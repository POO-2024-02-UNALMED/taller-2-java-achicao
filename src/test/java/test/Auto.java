package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static String cantidadCreados;
	
	int cantidadAsientos (){
		int contador = 0;
		for (Asiento i:asientos) {
			if(i != null) {
				contador++;
			}
		}
		return contador;
	}
	
	String verificarIntegridad() {
		for (Asiento i:asientos) {
			if (registro != motor.registro) {
				return "Las piezas no son originales";
			}else if(i.registro != motor.registro){
				return "Las piezas no son originales";
			}else if(i.registro != registro) {
				return "Las piezas no son originales";
			}
		}
		return "Auto original";
	}

}
