package com.example.project.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;
import com.example.project.device.Classes.*;
import com.example.project.Services.*;

@RestController
public class DeviceController {

	
	private final DeviceService deviceService ;
	
	@Autowired
	public DeviceController(DeviceService deviceService) {
		super();
		this.deviceService = deviceService;
	}
	@GetMapping("/devices")
	public List <Device> getDevices(){
		return deviceService.getDevices();
	}
	
	@GetMapping("/devices/{Id}")
	public Optional <Device> getDeviceById(@PathVariable ("Id") long id){
		return deviceService.getDeviceById(id);
	}
	
	@PostMapping("/add")
	public void addNewDevice(@RequestBody Device device){
		 deviceService.addNewDevice(device);
	}
}
