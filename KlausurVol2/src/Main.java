
public class Main {
	
	public static void main(String[] args) {
		Player one = new Player("Gandalf", 	new Setting() {
			
			@Override
			public void greeting(String name) {
				System.out.println("bonjour " + name);
			}
			
		});
		
		Player two = new Player("Gandalf", 	new randombullshitClass() {
			
			@Override
			public void greeting(String name) {
				System.out.println("hello " + name);
			}
			
			public void rechnen() {
				System.out.println(1+1);
			}
			
		});
		
		Player drei = new Player("Gandalf", 	new Languages() {
			
			@Override
			public void greeting(String name) {
				System.out.println("guten Tag " + name);
			}
			
		});
		
		

	}

}
