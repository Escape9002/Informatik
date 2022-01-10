
public class Player {
	
	String name = " ";
	
	public Player(String name, Languages setting) {
		this.name = name;
		setting.greeting(name);
	}
	
	public Player(String name, Setting setting) {
		this.name = name;
		setting.greeting(name);
	}
	
	public Player(String name, randombullshitClass setting) {
		this.name = name;
		setting.greeting(name);
	}

}
