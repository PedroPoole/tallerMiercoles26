package taller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StarterController {
	@Autowired
	Saludo saludo;
	
	@GetMapping(value="/saludo")
	public String saludar() {
		return saludo.mensajeSaludo();
	}
	
}
