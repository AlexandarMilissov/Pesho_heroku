package bg.pesho.positioning.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bg.pesho.positioning.db.entity.Beacon;

@Repository
public interface BeaconRepository extends JpaRepository<Beacon, Integer> {

}
