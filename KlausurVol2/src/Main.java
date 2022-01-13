import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main{
	
	public static void main(String[] args) {
		Player one = new Player("Gandalf", 	new Setting() {
			
			public void greeting(String name) {
				System.out.println("bonjour " + name);
			}
			
		});
		
		Player two = new Player("Gandalf", 	new randombullshitClass() {
			
			@Override
			public void greeting(String name) {
				System.out.println("hello " + name);
				rechnen();
			}
			
			
			public void rechnen() {									// wie rufe ich diese Funktion auf? (alleine, ohne greeting)
				System.out.println(1+1);
			}
			
		});
		
		Player drei = new Player("Gandalf", 	new Languages() {
			
			@Override
			public void greeting(String name) {
				System.out.println("guten Tag " + name);
			}
			
		});
		
		Player four = new Player("cat", new Languages() {
			
			@Override
			public void greeting(String name) {
				System.out.println("guten Tag " + name);
			}
			
		});
		
		MouseHandler mouse = new MouseHandler();
		KeyHandler key = new KeyHandler();
		WindowHandler win = new WindowHandler(mouse, key);

	}
}
