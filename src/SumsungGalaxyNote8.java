
public class SumsungGalaxyNote8 extends SumsungGalaxyS8 {
	@Override
	public void useGearVR() {
		super.useGearVR();
		System.out.println(this.getClass().getName() + " override useGearVR");
	}

	@Override
	public void transformToPC() {
		super.transformToPC();
		System.out.println(this.getClass().getName() + "  override transformToPC");
	}

	public void usePen() {
		System.out.println(this.getClass().getName() + " usePen");
	}

	@Override
	public void googlePlay() {
		super.phoneCall();
		super.googlePlay();
		System.out.println("from class " + this.getClass().getName() + " override method  googlePlay");
	}
}
