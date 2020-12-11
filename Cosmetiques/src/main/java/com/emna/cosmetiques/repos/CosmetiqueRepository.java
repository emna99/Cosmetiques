package com.emna.cosmetiques.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emna.cosmetiques.entities.Cosmetique;

public interface CosmetiqueRepository extends JpaRepository<Cosmetique, Long> {

}
