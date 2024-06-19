package org.springframework.samples.petclinic.petcare;

import jakarta.persistence.*;

import java.util.Date;
import org.springframework.samples.petclinic.owner.Pet;

@Entity
@Table(name = "pet_care")
public class PetCare {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	private Pet pet;

	private String type; // e.g., "Grooming", "Vaccination"

	private Date date;

	// Getters and setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
