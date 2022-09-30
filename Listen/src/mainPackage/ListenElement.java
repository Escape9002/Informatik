package mainPackage;
public class ListenElement {

	private int inhalt;
	private ListenElement next;
	
	priority flag;

	public ListenElement(int inhalt) {
		this.inhalt = inhalt;
	}
	
	//TATÜTTATA
	public ListenElement(int inhalt, priority flag) {
		this.inhalt = inhalt;
		this.flag = flag;
	}

	public void add(ListenElement neu) {
		if (next == null) {
			next = neu;
		} else {
			next.add(neu);
		}
	}

	public ListenElement getNext() {
		return next;
	}

	public int get() {
		return inhalt;
	}
	
	//TATÜTATA
	public ListenElement getAnruf() {
		return this;
	}

	public void remove(int wert) {
		if (next != null) {
			if (next.get() == wert) {
				if (next.getNext() != null) {
					next = next.getNext();
				} else {
					next = null;
				} 
			}
			else {
				if(next!=null) {next.remove(wert);}
			}
		}
		
	}

	public int find(int wert) {
		if (inhalt == wert) {
			return inhalt;
		} else {
			if (next == null) {
				return -1;
			} else {
				return next.find(wert);
			}
		}

	}

	public void firstLast() {
		if (next == null) {
			System.out.print(inhalt);
		} else {
			next.firstLast();
		}

	}

	public String toString() {
		if (next == null) {
			return "" + inhalt;
		} else {
			return "" + inhalt + " " + next.toString();
		}
	}

	public int count() {
		if (next == null) {
			return 1;
		} else {
			return 1 + next.count();
		}

	}

	public int addition() {
		if (next == null) {
			return inhalt;
		} else {
			return inhalt + next.addition();

		}

	}

}
