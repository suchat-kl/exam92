
public class Iphone8 extends MobilePhone {
	private void touchId() {
		super.phoneCall();
		System.out.println("from class "+this.getClass().getName() + " method  touchId");
	}
	public void appStore() {
		super.phoneCall();
		System.out.println("from class "+this.getClass().getName() + " method  appStore");
	}
}
