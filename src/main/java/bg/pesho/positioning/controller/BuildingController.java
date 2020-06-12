package bg.pesho.positioning.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bg.pesho.positioning.db.entity.Building;
import bg.pesho.positioning.service.BuildingService;

@RestController
@RequestMapping("/buildings")
public class BuildingController {
	@Autowired BuildingService buildingService;
	
	@GetMapping("/findAll")
	public List<Building> findAll() {
		return buildingService.findAll();
	}
	
	@GetMapping("/find")
	public Building find(@PathParam("id") Integer id) {
		return buildingService.findById(id).get();
	}
}
