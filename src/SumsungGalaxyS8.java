
public class SumsungGalaxyS8 extends MobilePhone {
	public void useGearVR() {
		System.out.println(this.getClass().getName() + " useGearVR");
	}

	public void transformToPC() {
		System.out.println(this.getClass().getName() + " transformToPC");
	}

	

	public void googlePlay() {
		super.phoneCall();
		System.out.println("from class "+this.getClass().getName() + " method  googlePlay");
	}
}
