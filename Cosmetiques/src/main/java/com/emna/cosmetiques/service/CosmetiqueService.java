package com.emna.cosmetiques.service;

import java.util.List;

import com.emna.cosmetiques.entities.Cosmetique;

public interface CosmetiqueService {
	Cosmetique saveCosmetique(Cosmetique c);
	Cosmetique updateCosmetique(Cosmetique c);
	void deleteCosmetique(Cosmetique c);
	void deleteCosmetiqueById(Long id);
	Cosmetique getCosmetique(Long id);
	List<Cosmetique> getAllCosmetiques();
}
