package BinaryTree;

public class Element {
	public int value;
	public Element left, right;
	
	static int depthMax = 0;

	public Element(int n) {
		value = n;
		left = null;
		right = null;
	}

	public void show() {
		System.out.println(value);
	}
	public void show(String pos) {
		System.out.println(pos +": " + value);
	}

	// großes nach rechts | kleines nach links
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
	
	public int count(int count) {
		
		
		count++;

		if (left != null) {
			left.depth(count);
		} 

		if (right != null) {
			right.depth(count);
		}
		
		return count;
	}
}