package org.springframework.samples.petclinic.petcare;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import org.springframework.samples.petclinic.owner.Pet;

import java.util.Date;

@Entity
public class PetCare {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	private Pet pet;

	private String type; // e.g., "Grooming", "Vaccination"
	private Date date;

	// Getters and setters
}
