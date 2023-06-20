package ua.artemii.knowledgesharing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/math")
@RequiredArgsConstructor
public class MathController {

	@GetMapping("/sum")
	public int sum(@RequestParam int a, @RequestParam int b) {
		return a + b;
	}

	@GetMapping("/difference")
	public int difference(@RequestParam int a, @RequestParam int b) {
		return a - b;
	}
}
