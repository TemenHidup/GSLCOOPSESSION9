
public class Goldlane extends Hero{

	public Goldlane(String nama, String type, String role) {
		super(nama, type, role);
		// TODO Auto-generated constructor stub
	}
	
	public void voiceLineGold() {
		System.out.println("Moneyyy");
	}
	
	public void goldAct() {
		System.out.println(this.getNama()+" is a goldlaner");
	}
	
}
