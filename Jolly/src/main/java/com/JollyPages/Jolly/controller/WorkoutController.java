package com.JollyPages.Jolly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.JollyPages.Jolly.entities.Diet;
import com.JollyPages.Jolly.entities.Workout;
import com.JollyPages.Jolly.services.DietService;
import com.JollyPages.Jolly.services.WorkoutService;

import java.util.List;

@Controller
public class WorkoutController {

	    private final DietService dietService;
	    private final WorkoutService workoutService;

	    @Autowired
	    public WorkoutController(@Qualifier("dietbean") DietService dietService,@Qualifier("workoutbean") WorkoutService workoutService) {
	        this.dietService = dietService;
	        this.workoutService = workoutService;
	    }

	    @GetMapping("/home")
	    public String search() {

	        return "home"; 
	    }
	

}
