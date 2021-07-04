package override_eg;

public class MobileV2 extends MobileV1 {

	public void gaming() {
		System.out.println("You can play games from V2");
	}
	
	public void browsing() {
		System.out.println("Internet and browsing feature from V2");
	}
	
	public void camera() {
		System.out.println("Click pictures and record videos from camera from V2");
	}
	
	@Override
	public void displayMenu() {
		//super.displayMenu();
		System.out.println("Menu in V2 is updated to GRID view");
	}
}
//@