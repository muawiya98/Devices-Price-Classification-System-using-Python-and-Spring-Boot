package com.example.project.device.Classes;
	
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
	
	@Entity 
	@Table(name="prices")
	public class Price {
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private int price;
		
		
		public Price(int id, int price) {
			super();
			this.id = id;
			this.price = price;
		}
		
		
	}
