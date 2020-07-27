package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.PetService;

/**
 * Created by jt on 12/28/19.
 */
@Controller
public class PetController {

	private final PetService petService;
    
// Autowire annotation doesn't require for Constructor Based Injection
    public PetController(PetService petService) {
		super();
		this.petService = petService;
	}


	public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}
