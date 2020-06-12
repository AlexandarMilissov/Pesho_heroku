package bg.pesho.positioning.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bg.pesho.positioning.db.entity.Room;
import bg.pesho.positioning.service.RoomService;

@RestController
@RequestMapping("/rooms")
public class RoomController {
	@Autowired RoomService roomService;
	
	@GetMapping("/findAll")
	public List<Room> findAll() {
		return roomService.findAll();
	}
	
	@GetMapping("/find")
	public Room find(@PathParam("id") Integer id) {
		return roomService.findById(id);
	}
	
	@GetMapping("/find-image")
	public String findImage(@PathParam("id") Integer id) {
		return roomService.findImage(id);
	}
	
	@GetMapping("/find-images")
	public List<String> findImages(@PathParam("id") Integer id) {
		return roomService.findImages(id);
	}
}
