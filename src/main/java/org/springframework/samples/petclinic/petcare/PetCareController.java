import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

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

	@PostMapping
	public PetCare addPetCareRecord(@RequestBody PetCare petCare) {
		return petCareService.save(petCare);
	}

	// Additional endpoints as needed
}
