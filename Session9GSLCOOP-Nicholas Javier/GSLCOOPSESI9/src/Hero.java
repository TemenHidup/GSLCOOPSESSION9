
public abstract class Hero {
	private String nama;
	private String type;
	private String role;
	
	
	
	public Hero(String nama, String type, String role) {
		super();
		this.nama = nama;
		this.type = type;
		this.role = role;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	

}
