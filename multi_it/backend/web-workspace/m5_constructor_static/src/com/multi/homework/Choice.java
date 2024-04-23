package com.multi.homework;

public class Choice {
	public String subject="";
	public String time="";
	public String name="";
	
	public Choice(String subject, String time, String name) {
		this.subject = subject;
		this.time = time;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Academy{" +
				"subject='" + subject + '\'' +
				", time=" + time +
				", name='" + name + '\'' +
				'}';
	}
}
