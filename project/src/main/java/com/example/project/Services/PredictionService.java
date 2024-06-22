package com.example.project.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Repositories.DeviceRepository;
import com.example.project.device.Classes.Device;


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
