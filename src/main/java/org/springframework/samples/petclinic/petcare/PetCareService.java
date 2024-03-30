import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PetCareService {

	private final PetCareRepository petCareRepository;

	@Autowired
	public PetCareService(PetCareRepository petCareRepository) {
		this.petCareRepository = petCareRepository;
	}

	public List<PetCare> findAll() {
		return petCareRepository.findAll();
	}

	public PetCare save(PetCare petCare) {
		return petCareRepository.save(petCare);
	}

	// Additional methods as needed
}
