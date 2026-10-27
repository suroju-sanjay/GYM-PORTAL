package com.sanjay.gym.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sanjay.gym.model.Gym;

@Repository
public interface GymRepo extends JpaRepository<Gym, Integer> {

}
