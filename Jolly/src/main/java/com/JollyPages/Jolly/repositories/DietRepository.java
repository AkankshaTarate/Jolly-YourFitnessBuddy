package com.JollyPages.Jolly.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JollyPages.Jolly.entities.Diet;

@Repository
public interface DietRepository extends JpaRepository<Diet, Integer> {
	//List<Diet> findByDietNameContainingIgnoreCase(String dietname);
}