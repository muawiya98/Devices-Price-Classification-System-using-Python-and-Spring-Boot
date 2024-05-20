package com.example.project.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import com.example.project.device.Classes.*;
import com.example.project.Services.*;

@RestController
public class PriceController {

	private final PredictionService predictionService;
	
	@Autowired
	public PriceController(PredictionService predictionService) {
		super();
		this.predictionService = predictionService;
	}
	
	@PostMapping("/predict")
	public void predictPrice (@RequestBody Map<String, Long> requestBody) {
	    Long id = requestBody.get("id");
	    predictionService.predictPrice(id);
	}
	
}
