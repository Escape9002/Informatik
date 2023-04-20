package SchnelleTests;

public class BinTree {
	int daten;
	BinTree left;
	BinTree right;

	public BinTree(int daten,BinTree right, BinTree left) {
		this.daten = daten;
		this.right = right;
		this.left = left;
	}

	public BinTree(int daten) {
		this.daten = daten;
		
	}
	

	public void add(int wert) {
		if (wert <= daten) {
			if (left == null) {
				left =new BinTree(wert);
			}else if(left != null) {
				left.add(wert);
			}
		}else if(wert > daten) {
			if(right == null) {
				right = new BinTree(wert);
			}else if(right != null) {
				right.add(wert);
			}
		}
	}

}