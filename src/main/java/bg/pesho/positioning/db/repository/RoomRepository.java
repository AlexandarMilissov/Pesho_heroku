package bg.pesho.positioning.db.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import bg.pesho.positioning.db.entity.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {
	@Query(value = "SELECT image FROM ROOMS WHERE id = ?1 LIMIT 1", nativeQuery = true)
	public String findImage(Integer id);
	
	@Query(value = "SELECT image FROM ROOMS WHERE building_id = ?1", nativeQuery = true)
	public List<String> findImages(Integer id);
}
