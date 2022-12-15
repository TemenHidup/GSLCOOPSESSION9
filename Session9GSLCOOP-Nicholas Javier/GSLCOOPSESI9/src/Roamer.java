
public class Roamer extends Hero{

	public Roamer(String nama, String type, String role) {
		super(nama, type, role);
		// TODO Auto-generated constructor stub
	}
	
	public void voiceLineRoa() {
		System.out.println("Tank abadi selalu menjaga corenya");
	}
	
	public void roamAct() {
		System.out.println(this.getNama()+" is a roamer");
	}
	
}
