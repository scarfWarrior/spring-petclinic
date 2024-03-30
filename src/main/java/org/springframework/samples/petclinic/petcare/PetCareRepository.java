package org.springframework.samples.petclinic.petcare;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PetCareRepository extends JpaRepository<PetCare, Integer> {



}
