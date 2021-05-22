
public class MobilePhone {
	MobilePhone() {

	}

	void sms() {
		System.out.println("Parent sms");
	}

	void internetSurfing() {
		System.out.println("Parent internetSurfing");
	}

	void phoneCall() {
		System.out.println("Parent phoneCall");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobilePhone p;// =new MobilePhone();
		p = new SumsungGalaxyNote8();
		p.sms();
		SumsungGalaxyNote8 s = (SumsungGalaxyNote8) p;
		s.googlePlay();
	}

}
