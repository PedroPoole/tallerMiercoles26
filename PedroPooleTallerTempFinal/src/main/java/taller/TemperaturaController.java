package taller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tallerTemp.Temperatura;

@RestController
@ResponseBody
public class TemperaturaController {

	@Autowired
	Temperatura temp;
	
	@GetMapping("/convertir")
	public String conversor(@RequestParam double temperatura) {
		
		
		return (temperatura+" grados "+temp.getTempEntrada()+" son "+temp.temperaturaTransformar(temperatura)+" grados "+temp.getTempSalida());
	}
	
	
}
