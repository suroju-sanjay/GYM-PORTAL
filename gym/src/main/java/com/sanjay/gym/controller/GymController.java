
package com.sanjay.gym.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanjay.gym.model.Gym;
import com.sanjay.gym.service.GymService;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/gym")
public class GymController {

	@Autowired
	GymService gymService;

	// CREATE
	@PostMapping("/creategym")
	public Gym createGym(@RequestBody Gym g) {
		return gymService.saveGym(g);
	}

	// READ ALL
	@GetMapping("/getallmembers")
	public List<Gym> getAllGym() {
		return gymService.getAllGym();
	}

	// READ BY ID
	@GetMapping("/getgymmem/{id}")
	public Gym getgym(@PathVariable Integer id) {
		return gymService.getGym(id);
	}

	// UPDATE
	@PutMapping("/updategymmem/{id}")
	public Gym updateGym(@PathVariable Integer id, @RequestBody Gym g) {
		return gymService.updateGym(id, g);
	}

	// DELETE
	@DeleteMapping("/deletegymmember/{id}")
	public String deleteGym(@PathVariable Integer id) {
		gymService.deleteGym(id);
		return "Gym member successfully deleted";
	}
}
