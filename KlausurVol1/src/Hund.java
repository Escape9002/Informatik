public class Hund {

	String rasse;
	String name;
	int alter;
	double lautstaerkeDB;

	public Hund(String rasse, String name, int alter, double lautstaerkeDB) {
		this.rasse = rasse;
		this.name = name;
		this.alter = alter;
		this.lautstaerkeDB = lautstaerkeDB;
	}

	public Hund(String name) {
		this("Standarbd", name, 13, 123.8);
	}

	public Hund() {
		this("Rudolf");
	}

	public void getAllData() {
		System.out.println(rasse + " | " + name + " | "  + alter + " | "  + lautstaerkeDB);
	}

	public double wuff() {
		return lautstaerkeDB;
	}
	
	public static void main(String[] args) {
		 Hund ma = new Hund("laprador", "gandalf",14, 44.5);
		 Schaeferhund wd = new Schaeferhund("ahd", 16, 5);
		 
		 ma.getAllData();
		 wd.getAllData();
		 
		 System.out.println("Hund " + ma.wuff());
		 System.out.println("Schaferhund " + wd.wuff());
		 }

}