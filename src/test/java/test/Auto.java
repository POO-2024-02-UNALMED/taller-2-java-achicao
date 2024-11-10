package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static String cantidadCreados;
	
	int cantidadAsientos (Asiento[] asientos){
		int cantidadAsientos = asientos.length;
		return cantidadAsientos;
	}
	
	String verificarIntegridad(Motor motor,Asiento[] asientos) {
		if (registro == motor.registro) {
			for (int i = 0;i < asientos.length;i++) {
				if (asientos[i].registro != registro) {
					return "Las piezas no son originales";
				}
			}
			return "Auto original";
		}else {
			return "Las piezas no son originales";
		}
	}

}
