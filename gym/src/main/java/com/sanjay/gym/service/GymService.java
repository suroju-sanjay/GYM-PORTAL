package com.sanjay.gym.service;

import java.util.List;

import com.sanjay.gym.model.Gym;

//interface means what to do but not how to do
public interface GymService {
	Gym saveGym(Gym g);

	Gym getGym(Integer id);

	List<Gym> getAllGym();

	void deleteGym(Integer Id);

	Gym updateGym(Gym id);

	Gym updateGym(Integer id, Gym g);

}
