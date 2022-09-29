package BinaryTree;

public class BuildTree {
	Element root;

	public BuildTree(int val) {
		root = new Element(val);

	}
	
	public void nullVar() {
		Element.count = 0;
		Element.depthMax = 0;
		Element.msg = "";
	}

	public void insert(int value) {
		nullVar();
		
		root.insert(value);
	}

	public int depth() {
		nullVar();
		
		return root.depth(0);
	}

	public int count() {
		nullVar();
		
		return root.count();
	}

	public String preOrder() {
		nullVar();
		
		return root.preOrder();
	}
	
	public String inOrder() {
		nullVar();
		
		return root.inOrder();
	}
	
	public String postOrder() {
		nullVar();
		
		return root.postOrder();
	}
}