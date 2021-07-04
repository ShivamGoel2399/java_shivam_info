package override_eg;

public class MobileV1 {

	public void voiceCalling() {
		System.out.println("Voice calling from V1");
	}
	
	public void textMessage() {
		System.out.println("Send messages from V1");
	}
	
	protected void displayMenu() {
		System.out.println("Menu in V1 displays in LIST view");
	}
}
//public -> protected -> default ->private