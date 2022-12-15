
public class Midlane extends Hero{

	public Midlane(String nama, String type, String role) {
		super(nama, type, role);
		// TODO Auto-generated constructor stub
	}
	
	public void voiceLineMidlane() {
		System.out.println("Posisi no 1");
	}
	
	public void midAct() {
		System.out.println(this.getNama()+" is a midlaner");
	}

}
