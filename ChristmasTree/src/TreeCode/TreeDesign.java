package TreeCode;

public class TreeDesign {

	static int breite = 9;
	static int leerzeichen = breite / 2;
	static int blaetter = 1;

	public TreeDesign(int width){
		breite = width;
	}
	
	public static void main(String[] args) {

		while (blaetter <= breite) {
			for (int i = 0; i < leerzeichen; i++) {
				System.out.print(" ");
			}

			for (int i = 0; i < blaetter; i++) {
				System.out.print("1");
			}

			System.out.println();
			leerzeichen--;
			blaetter += 2;
		}
		
		
	}

}
