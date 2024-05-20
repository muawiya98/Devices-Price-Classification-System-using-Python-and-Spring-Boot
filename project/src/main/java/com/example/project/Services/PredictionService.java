package com.example.project.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.project.device.Classes.*;
import com.example.project.Repositories.*;


@Service
public class PredictionService {

	private final DeviceRepository deviceRepository;
	
	@Autowired
	public PredictionService (DeviceRepository deviceRepository) {
		super();
		this.deviceRepository = deviceRepository;
	
	}
	
	public void predictPrice(long id) {
		
		Boolean deviceId = deviceRepository.existsById(id);
		
		if (deviceId) {
			Device d=deviceRepository.getReferenceById(id);
			System.out.println(d);

	    } else {
	        System.out.println("Device not found for ID: " + id);
	    }
			
		
	}
	
	
}
