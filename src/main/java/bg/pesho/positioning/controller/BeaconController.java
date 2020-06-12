package bg.pesho.positioning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bg.pesho.positioning.service.BeaconService;

@RestController
@RequestMapping("/beacons")
public class BeaconController {
	@Autowired BeaconService beaconService;
	
	// TODO: implement
}
