package com.sanjay.gym.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanjay.gym.model.Gym;
import com.sanjay.gym.repository.GymRepo;
//a class is helping how to do what we declared interface.....
@Service
public class GymServiceImpl implements GymService{
@Autowired
	GymRepo gymRepo;
	@Override
	public Gym saveGym(Gym g) {
		
		return gymRepo.save(g);
	}
	@Override
	public Gym getGym(Integer id) {
		return gymRepo.findById(id).orElseThrow();
	}
	@Override
	public List<Gym> getAllGym() {
		return gymRepo.findAll();
	}
	@Override
	public void deleteGym(Integer Id) {
		gymRepo.deleteById(Id);
		
	}
	@Override
	public Gym updateGym(Integer id, Gym g) {

	    Gym existingGym = gymRepo.findById(id)
	        .orElseThrow(() ->
	            new RuntimeException("Gym member not found: " + id));

	    existingGym.setAge(g.getAge());
	    existingGym.setAmount(g.getAmount());
	    existingGym.setDuration(g.getDuration());
	    existingGym.setEmail(g.getEmail());
	    existingGym.setGender(g.getGender());
	    existingGym.setJoiningDate(g.getJoiningDate());
	    existingGym.setName(g.getName());
	    existingGym.setPhone(g.getPhone());
	    existingGym.setPlan(g.getPlan());
	    existingGym.setStatus(g.getStatus());

	    return gymRepo.save(existingGym);
	}
	@Override
	public Gym updateGym(Gym id) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public Gym getGym(Integer id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Gym> getAllGym() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void deleteGym(Integer Id) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public Gym updateGym(Integer id) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
