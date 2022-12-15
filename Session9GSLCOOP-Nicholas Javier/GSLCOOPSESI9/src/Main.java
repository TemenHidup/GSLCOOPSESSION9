import java.util.*;

public class Main {
	
	// Untuk Scanner
	Scanner scan = new Scanner(System.in);
	// Arraylist
	ArrayList<Hero> heroAL = new ArrayList();
	void printMenu() {
		System.out.println("Welcome to Mobile Legend");
		System.out.println("1. Input Hero");
		System.out.println("2. View Hero");
		System.out.println("3. Delete Hero");
		System.out.println("4. Exit");
		System.out.print(">>");
	}
	
	// Fungsi untuk memasukan nama, tipe, role suatu hero
	void addHero() {
		
		// Declaration 
		String nama = "";
		String type = "";
		String role = "";
		
		// Input
		do {
			System.out.println("Input nama hero: ");
			nama = scan.nextLine();
		}while(nama.length()<1 || nama.length()>20);
		
		
		do {
			System.out.println("Input hero type(Animal | Human | god | Unknown) (Case Sensitive): ");
			type = scan.nextLine();
		}while(!type.equals("Animal") && !type.equals("Human") && !type.equals("god") && !type.equals("Unknown"));
		
		do {
			System.out.println("Input Hero Role(Jungler | Roamer | Midlaner | Explaner | Goldlaner) (Case Sensitive): ");
			role = scan.nextLine();
		}while(!role.equals("Jungler") && !role.equals("Roamer") && !role.equals("Midlaner") && !role.equals("Explaner") && !role.equals("Goldlaner"));
		
		// Memasukan ke dalam Arraylist sesuai role
		if(role.equals("Jungler")) {
			Jungler jungle = new Jungler(nama,type,role);
			heroAL.add(new Jungler(nama,type,role));
			jungle.voiceLineJung();
			jungle.jungAct();
		}
		else if(role.equals("Roamer")) {
			Roamer roam = new Roamer(nama,type,role);
			heroAL.add(new Roamer(nama,type,role));
			roam.voiceLineRoa();
			roam.roamAct();
		}
		else if(role.equals("Midlaner")) {
			Midlane mid = new Midlane(nama,type,role);
			heroAL.add(new Midlane(nama,type,role));
			mid.voiceLineMidlane();
			mid.midAct();
		}
		else if(role.equals("Explaner")) {
			Explane exp = new Explane(nama,type,role);
			heroAL.add(new Explane(nama,type,role));
			exp.voiceLineExp();
			exp.actExp();
		}
		else if(role.equals("Goldlaner")) {
			Goldlane gold = new Goldlane(nama,type,role);
			heroAL.add(new Goldlane(nama,type,role));
			gold.voiceLineGold();
			gold.goldAct();
		}
		System.out.println("Successfully Added to the list");
		
	}
	
	// Untuk print semua hero yang sudah dimasukan
	void viewHero() {
		if(heroAL.isEmpty()){
			System.out.println("Masukan Hero terlebih dahulu");
			return;
		}
		else {
			int counter = 0;
			System.out.printf("%-3s | %-25s | %-10s | %-15s |\n","No","Hero Name","Hero Type","Hero Role");
			
			for (Hero hero : heroAL) {
				counter++;
				if(hero instanceof Jungler) {
					System.out.printf("%-3d | %-25s | %-10s | %-15s | \n",counter,hero.getNama(),hero.getType(),hero.getRole());
				}
				else if(hero instanceof Roamer) {
					System.out.printf("%-3d | %-25s | %-10s | %-15s | \n",counter,hero.getNama(),hero.getType(),hero.getRole());
				}
				else if(hero instanceof Midlane) {
					System.out.printf("%-3d | %-25s | %-10s | %-15s | \n",counter,hero.getNama(),hero.getType(),hero.getRole());
				}
				else if(hero instanceof Explane) {
					System.out.printf("%-3d | %-25s | %-10s | %-15s | \n",counter,hero.getNama(),hero.getType(),hero.getRole());
				}
				else if(hero instanceof Goldlane) {
					System.out.printf("%-3d | %-25s | %-10s | %-15s | \n",counter,hero.getNama(),hero.getType(),hero.getRole());
				}
			}
		}
	}
	
	// Menghapus sebagian hero
	void deleteHero() {
		viewHero();
		int hapus;
		System.out.println("Delete hero yang mana ni?");
		hapus = scan.nextInt();
		System.out.println(heroAL.get(hapus-1).getNama() + " sudah dihapus");
		heroAL.remove(hapus-1);
	}
	
	public Main() {
		// TODO Auto-generated constructor stub
		int opt = 0;
		do {
			printMenu();
			opt = scan.nextInt();
			scan.nextLine();
			switch(opt) {
			case 1:
				addHero();
				break;
			case 2:
				viewHero();
				break;
			case 3:
				deleteHero();
				break;
			}
			
		}while(opt!=4);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
