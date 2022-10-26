package tallerConfiguracion.autoconfigure.temperatura;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties("temperatura.temperaturas")
@Getter
@Setter
public class TemperaturaProperties {
	
	private String tempEntrada = "celsius";
	private String tempSalida = "farenheit";

}
