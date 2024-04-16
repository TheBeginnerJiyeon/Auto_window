package com.multi.practice.phone15;

public class DmbCellPhone extends Cellphone{

	int channel;
	
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("DMB turn on" + channel);
	}
	
	void changeChannelDmb(int channel) {
		this.channel=channel;
		System.out.println("DMB change channel" + channel);
	}
	
	void turnOffDmb() {
		System.out.println("DMB turn off");
	}
	
	
	
}



