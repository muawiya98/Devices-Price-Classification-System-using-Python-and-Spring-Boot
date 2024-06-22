package com.example.project.Controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Services.PredictionService;

@RestController
public class PriceController {

	private final PredictionService predictionService;
	
	@Autowired
	public PriceController(PredictionService predictionService) {
		super();
		this.predictionService = predictionService;
	}
	// http://localhost:8080/predict
	@PostMapping("/predict")
	public void predictPrice (@RequestBody Map<String, Long> requestBody) {
	    Long id = requestBody.get("id");
	    predictionService.predictPrice(id);
	}
	
}
