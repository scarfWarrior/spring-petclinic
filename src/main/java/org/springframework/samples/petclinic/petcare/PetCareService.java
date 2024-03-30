package org.springframework.samples.petclinic.petcare;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

	public Optional<PetCare> findById(Integer id) {
		return petCareRepository.findById(id);
	}

	public PetCare save(PetCare petCare) {
		return petCareRepository.save(petCare);
	}

	public void deleteById(Integer id) {
		petCareRepository.deleteById(id);
	}

	// Additional methods as needed

}
