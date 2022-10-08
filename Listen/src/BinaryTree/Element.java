package BinaryTree;

public class Element {
	public int value;
	public Element left, right;

	static public int depthMax = 0;
	static public int count = 0;
	static public String msg = "";

	public Element(int n) {
		value = n;
		left = null;
		right = null;
	}

	public void show() {
		System.out.println(value);
	}

	public void show(String pos) {
		System.out.println(pos + ": " + value);
	}

	// groeszes nach rechts | kleines nach links yes, i did this on purpose
	public void insert(int value) {
		if (value >= this.value) {
			if (right == null) {

				right = new Element(value);
			} else {
				right.insert(value);
			}

		} else {
			if (left == null) {
				left = new Element(value);
			} else {
				left.insert(value);
			}
		}
	}

	public int depth(int depth) {
		depth++;

		if (left == null) {
			if (depthMax < depth) {
				depthMax = depth;
			}

			depth--;
			return depthMax;
		} else {
			left.depth(depth);
		}

		if (right == null) {
			if (depthMax < depth) {
				depthMax = depth;
			}
			depth--;
			return depthMax;
		} else {
			right.depth(depth);
		}

		return depthMax;
	}

	public int count() {
		count++;

		if (left != null) {
			left.count();
		}

		if (right != null) {
			right.count();
		}

		return count;
	}

	public String preOrder() {
		msg = msg + Integer.toString(value) + " | ";

		if (left != null) {
			left.preOrder();
		}

		if (right != null) {
			right.preOrder();
		}

		return msg;
	}

	public String inOrder() {
		if (left != null) {
			left.inOrder();
		}
		msg = msg + Integer.toString(value) + " | ";

		if (right != null) {
			right.inOrder();
		}

		return msg;
	}

	public String postOrder() {
		if (left != null) {
			left.postOrder();
		}

		if (right != null) {
			right.postOrder();
		}
		msg = msg + Integer.toString(value) + " | ";
		return msg;
	}

}