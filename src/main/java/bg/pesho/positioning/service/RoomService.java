package bg.pesho.positioning.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bg.pesho.positioning.db.entity.Room;
import bg.pesho.positioning.db.repository.RoomRepository;

@Service
public class RoomService {
	@Autowired private RoomRepository roomRepository;
	
	public List<Room> findAll() {
		return roomRepository.findAll();
	}
	
	public Room findById(Integer id) {
		Optional<Room> result = roomRepository.findById(id);
		if (result.isPresent()) return result.get();
		else return null;
	}
	
	public String findImage(Integer id) {
		return roomRepository.findImage(id);
	}
	
	public List<String> findImages(Integer id) {
		return roomRepository.findImages(id);
	}
}
