package tallerTemp;

public class Temperatura {
	private String tempEntrada="";
	private String tempSalida="";
	
	public Temperatura(String tempEntrada, String tempSalida) {
		this.tempEntrada = tempEntrada;
		this.tempSalida = tempSalida;
	}
	
	public double temperaturaTransformar(double grados) {
		double salida= grados;
		
		switch(tempEntrada) {
		case "kelvin":
			break;
		case "celsius":
			salida=salida+273;
			break;
		case "farenheit":
			salida=(salida+459.67)*5/9;
		}
		
		switch(tempSalida) {
		case "kelvin":
			break;
		case "celsius":
			salida=salida-273.15;
			break;
		case "farenheit":
			salida=(1.8*(salida - 273))+32;
		}
		
		return salida;
	}

	
	
	public String getTempEntrada() {
		return tempEntrada;
	}

	public void setTempEntrada(String tempEntrada) {
		this.tempEntrada = tempEntrada;
	}

	public String getTempSalida() {
		return tempSalida;
	}

	public void setTempSalida(String tempSalida) {
		this.tempSalida = tempSalida;
	}

	@Override
	public String toString() {
		return "Temperatura [tempEntrada=" + tempEntrada + ", tempSalida=" + tempSalida + "]";
	}
	
	
		
}
