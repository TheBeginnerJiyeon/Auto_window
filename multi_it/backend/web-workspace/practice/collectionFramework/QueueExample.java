package com.multi.practice.collectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		
		Queue<Message> messageQueue=new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail","홍길동"));
		messageQueue.offer(new Message("send1","홍길동1"));
		messageQueue.offer(new Message("send2","홍길동2"));
		
		while (!messageQueue.isEmpty()){
			Message message=messageQueue.poll();
			switch (message.command){
				case "sendMail":
					System.out.println(message.to+"에게 보냄");
					break;
				
				case "send1":
					System.out.println(message.to+"에게 보냄2");
					break;
				
				case "send2":
					System.out.println(message.to+"에게 보냄3");
					break;
					
					
			}
		}
		
		
		
		
		
		
	}
}
