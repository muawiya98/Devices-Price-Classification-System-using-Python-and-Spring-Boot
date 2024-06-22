package com.example.project.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Services.DeviceService;
import com.example.project.device.Classes.Device;

@RestController
public class DeviceController {

	
	private final DeviceService deviceService ;
	
	@Autowired
	public DeviceController(DeviceService deviceService) {
		super();
		this.deviceService = deviceService;
	}
	// http://localhost:8080/devices
	@GetMapping("/devices")
	public List <Device> getDevices(){
		return deviceService.getDevices();
	}
	// http://localhost:8080/devices/1
	@GetMapping("/devices/{Id}")
	public Optional <Device> getDeviceById(@PathVariable ("Id") long id){
		return deviceService.getDeviceById(id);
	}
	// http://localhost:8080/add
	@PostMapping("/add")
	public void addNewDevice(@RequestBody Device device){
		System.err.println(device);
		deviceService.addNewDevice(device);
	}
}
