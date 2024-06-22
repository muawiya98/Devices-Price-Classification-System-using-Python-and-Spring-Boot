package com.example.project.Services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Repositories.DeviceRepository;
import com.example.project.device.Classes.Device;

@Service
public class DeviceService {
	
	private final DeviceRepository deviceRepository;
	
	@Autowired
	public DeviceService(DeviceRepository deviceRepository) {
		super();
		this.deviceRepository = deviceRepository;
	}
	
	public List <Device> getDevices(){
		return deviceRepository.findAll();
	}
	
	public Optional <Device> getDeviceById(long id){
		return deviceRepository.findById(id);
	}
	
	public void addNewDevice(Device device) 
	{
		deviceRepository.save(device);
	}
}
