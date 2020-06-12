package bg.pesho.positioning.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bg.pesho.positioning.db.entity.Building;
import bg.pesho.positioning.db.repository.BuildingRepository;

@Service
public class BuildingService {
	@Autowired private BuildingRepository buildingRepository;
	
	public List<Building> findAll() {
		return buildingRepository.findAll();
	}
	
	public Optional<Building> findById(Integer id) {
		return buildingRepository.findById(id);
	}
}
