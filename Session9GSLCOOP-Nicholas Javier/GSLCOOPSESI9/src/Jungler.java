
public class Jungler extends Hero{

	
	
	public Jungler(String nama, String type, String role) {
		super(nama, type, role);
		// TODO Auto-generated constructor stub
	}

	public void voiceLineJung() {
		System.out.println("Farming Terus sampe menang mulus");
	}
	
	public void jungAct() {
		System.out.println(this.getNama()+" is a jungler");
	}
	
}
