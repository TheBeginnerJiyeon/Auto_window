package com.multi.practice.phone15;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone=new DmbCellPhone("자바폰","검정",10);
		
		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("색상: " + dmbCellPhone.color);
		
		System.out.println("채널: " + dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice(" 하이");
		dmbCellPhone.receiveVoice("안녕하세여");
		dmbCellPhone.sendVoice("아~ 안녕하세요");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.hangUp();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		
		
		
		
	}
	
	
	
}
