package org.springframework.samples.petclinic.petcare;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/petcare")
public class PetCareController {

	private final PetCareService petCareService;

	@Autowired
	public PetCareController(PetCareService petCareService) {
		this.petCareService = petCareService;
	}

	@GetMapping
	public List<PetCare> getAllPetCareRecords() {
		return petCareService.findAll();
	}

	@GetMapping("/{id}")
	public PetCare getPetCareById(@PathVariable Integer id) {
		return petCareService.findById(id).orElse(null);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public PetCare addPetCareRecord(@RequestBody PetCare petCare) {
		return petCareService.save(petCare);
	}

	@PutMapping("/{id}")
	public PetCare updatePetCareRecord(@PathVariable Integer id, @RequestBody PetCare petCare) {
		// Ensure the ID is associated with the existing PetCare
		petCare.setId(id);
		return petCareService.save(petCare);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deletePetCareRecord(@PathVariable Integer id) {
		petCareService.deleteById(id);
	}

}
