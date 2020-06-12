package bg.pesho.positioning.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bg.pesho.positioning.db.entity.Beacon;
import bg.pesho.positioning.db.repository.BeaconRepository;

@Service
public class BeaconService {
	@Autowired private BeaconRepository beaconRepository;
	
	public List<Beacon> findAll() {
		return beaconRepository.findAll();
	}
	
	public Optional<Beacon> findById(Integer id) {
		return beaconRepository.findById(id);
	}
}
