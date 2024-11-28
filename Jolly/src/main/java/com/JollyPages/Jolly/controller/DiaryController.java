package com.JollyPages.Jolly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DiaryController {
	@GetMapping("/notes")
	public String getMyDiary() {
		return "notes";
	}
}
