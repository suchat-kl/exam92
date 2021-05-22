
public class IphoneX extends Iphone8 {
	public void faceId() {
		super.phoneCall();
		System.out.println("from class " + this.getClass().getName() + " method  faceId");
	}

	@Override
	public void appStore() {
		super.phoneCall();
		super.appStore();
		System.out.println("from class " + this.getClass().getName() + " method  override appStore");
	}
}
