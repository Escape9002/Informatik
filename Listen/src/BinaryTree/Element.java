package BinaryTree;

public class Element {
	public int value;
	public Element left, right;

	public Element(int n) {
		value = n;
		left = null;
		right = null;
	}

	public void show() {
		System.out.println("" + value);
	}

	public void insert(int wert) {
		if (wert < value) {
			if (left != null) {
				this.left.insert(wert);
			}
		} else if (wert > value) {
			if (right != null) {
				this.right.insert(wert);
			}
		} else {
			if (left == null) {
				left = new Element(wert);
			} else {
				right = new Element(wert);
			}
			return;
		}
	}
}