package com.example.project.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.device.Classes.Device;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Long> {

}
