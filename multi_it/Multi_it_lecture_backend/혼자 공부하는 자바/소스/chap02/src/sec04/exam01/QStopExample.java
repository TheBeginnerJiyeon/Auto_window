package sec04.exam01;

public class QStopExample {
	public static void main(String[] args) throws Exception {
		int KeyCode;
		while (true) {
			KeyCode=System.in.read();
	
			System.out.println("KeyCode: " + KeyCode);
			if (KeyCode==113) {
				break;
			}		
		}	
		
		System.out.println("종료 ㅋ");
	}
}
