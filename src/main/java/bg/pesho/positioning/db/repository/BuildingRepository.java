package bg.pesho.positioning.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bg.pesho.positioning.db.entity.Building;

@Repository
public interface BuildingRepository extends JpaRepository<Building, Integer> {
	
}
