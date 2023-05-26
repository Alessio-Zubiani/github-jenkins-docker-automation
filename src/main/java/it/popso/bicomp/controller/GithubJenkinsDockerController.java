package it.popso.bicomp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GithubJenkinsDockerController {
	
	@GetMapping
	public String message() {
		return "welcome to Github-Jenkins-Docker Application";
	}

}
