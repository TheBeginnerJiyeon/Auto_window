package sec04.exam01;

public class ContinueKeycodeExample {
	public static void main(String[] args) throws Exception {
		int Keycode;
		
		while (true) {
			Keycode=System.in.read();
			System.out.println("Keycode: " + Keycode);
		}
	}
}
