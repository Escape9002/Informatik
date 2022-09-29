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

	static int depthMax = 0;
	public int depth(int depth) {
		depth++;

		if (left == null) {
			if(depthMax < depth) {
				depthMax = depth;
			}
			
			depth--;
			 return depthMax;
		} else {
			left.depth(depth);
		}

		if (right == null) {
			if(depthMax < depth) {
				depthMax = depth;
			}
			depth--;
			return depthMax;
		} else {
			right.depth(depth);
		}
		
	return depthMax;
	}
}