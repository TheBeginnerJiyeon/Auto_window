package com.multi.practice.typeconversion21;

import com.multi.practice.Audio;
import com.multi.practice.RemoteControl;
import com.multi.practice.Television;

public class MyClass {
	RemoteControl rc = new Television();
	
	MyClass() {
	}
	
	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
	
	
}
